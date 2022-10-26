package br.com.comex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Produto;
import br.com.comex.modelo.StatusCategoria;
import br.com.comex.modelo.Tipo;

public class ProdutoDao {

	private Connection conexao;

	public ProdutoDao(Connection conexao) {
		this.conexao = conexao;
	}

	public void insere(Produto produto) throws SQLException {
		String sql = "INSERT INTO comex.produto "
				+ "(NOME,DESCRICAO,PRECO_UNITARIO,QUANTIDADE_ESTOQUE,CATEGORIA_ID,TIPO) " + "VALUES "
				+ "(?, ?, ?, ?, ?, ?) ";

		String[] colunaId = { "id" };
		PreparedStatement state = conexao.prepareStatement(sql, colunaId);
		state.setString(1, produto.getNome());
		state.setString(2, produto.getDescricao());
		state.setBigDecimal(3, produto.getPrecoUnitario());
		state.setInt(4, produto.getQtdEstoque());
		state.setInt(5, produto.getCategoria());
		state.setString(6, produto.getTipo().name());
		state.execute();

		ResultSet rs = state.getGeneratedKeys();
		rs.next();
		produto.setId(rs.getInt(1));
		System.out.println("O ID criado foi: " + rs.getInt(1));
		Integer modificacoes = state.getUpdateCount();
		System.out.println("Registros Inseridos: " + modificacoes);
		state.close();

	}

	public List<Produto> listaProdutos() throws SQLException {

		List<Produto> produtos = new ArrayList<Produto>();
		PreparedStatement state = conexao.prepareStatement("SELECT * FROM comex.produto");
		state.execute();
		ResultSet resultado = state.getResultSet();
		while (resultado.next()) {
			produtos.add(this.criaProduto(resultado));
		}
		resultado.close();
		state.close();
		return produtos;
	}

	public void exclui(Integer id) throws SQLException {
		String sql = "DELETE FROM comex.produto WHERE ID = ?";

		PreparedStatement state = conexao.prepareStatement(sql);
		state.setInt(1, id);
		state.execute();
		Integer modificacoes = state.getUpdateCount();
		System.out.println("Registros Excluidos: " + modificacoes);

		state.close();
	}

	public void altera(Produto produto) throws SQLException {

		PreparedStatement state = conexao.prepareStatement(
				("NOME=? ,DESCRICAO=? ,PRECO_UNITARIO=? ,QUANTIDADE_ESTOQUE=? ,CATEGORIA_ID=? ,TIPO=? ")
						+ "WHERE id=?");
		state.setString(1, produto.getNome());
		state.setString(2, produto.getDescricao());
		state.setBigDecimal(3, produto.getPrecoUnitario());
		state.setInt(4, produto.getQtdEstoque());
		state.setInt(5, produto.getCategoria());
		state.setString(6, produto.getTipo().name());
		state.setInt(7, produto.getId());
		state.execute();
		Integer modificacoes = state.getUpdateCount();
		System.out.println("Registros Modificados: " + modificacoes);
		state.close();

	}

	public Produto buscaPorId(Integer id) throws SQLException {
		String sql = "SELECT * FROM comex.produto WHERE ID = ?";

		try (PreparedStatement state = this.conexao.prepareStatement(sql)) {
			state.setInt(1, id);

			try (ResultSet registro = state.executeQuery()) {
				Produto produto = null;
				if (registro.next()) {
					produto = this.criaProduto(registro);
				}
				return produto;
			}
		}
	}

	private Produto criaProduto(ResultSet registro) throws SQLException {
		Produto produto = new Produto(registro.getString("nome"), 
				registro.getBigDecimal("PRECO_UNITARIO"),
				registro.getInt("QUANTIDADE_ESTOQUE"),
				registro.getInt("CATEGORIA_ID"));

		produto.setId(registro.getInt("ID"));
		produto.setNome(registro.getString("NOME"));
		produto.setDescricao(registro.getString("DESCRICAO"));
		produto.setPrecoUnitario(registro.getBigDecimal("PRECO_UNITARIO"));
		produto.setQtdEstoque(registro.getInt("QUANTIDADE_ESTOQUE"));
		produto.setCategoria(registro.getInt("CATEGORIA_ID"));
		Tipo tipo = Tipo.valueOf(registro.getString("TIPO"));
		produto.setTipo(tipo);
		System.out.println(produto);
		return produto;
	}
}
