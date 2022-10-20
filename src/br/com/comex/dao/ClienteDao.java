package br.com.comex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ClienteEstado;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.StatusCategoria;
import br.com.comex.modelo.Tipo;

public class ClienteDao {

	private Connection conexao;

	public ClienteDao(Connection conexao) {
		this.conexao = conexao;
	}

	public void insere(Cliente cliente) throws SQLException {
		String sql = "INSERT INTO comex.cliente "
				+ "(NOME,CPF,TELEFONE,RUA,NUMERO,COMPLEMENTO,BAIRRO,CIDADE,UF) "
				+ "VALUES " + "(?, ?, ?, ?, ?, ?, ?, ?, ?) ";

		String[] colunaId = { "id" };
		PreparedStatement state = conexao.prepareStatement(sql, colunaId);
		state.setString(1, cliente.getNome());
		state.setString(2, cliente.getCpf());
		state.setString(3, cliente.getTelefone());
		state.setString(4, cliente.getRua());
		state.setString(5, cliente.getNumeroRua());
		state.setString(6, cliente.getComplemento());
		state.setString(7, cliente.getBairro());
		state.setString(8, cliente.getCidade());
		state.setString(9, cliente.getEstado().name());

		state.execute();

		ResultSet rs = state.getGeneratedKeys();
		rs.next();
		cliente.setId(rs.getInt(1));
		System.out.println("O ID criado foi: " + rs.getInt(1));
		Integer modificacoes = state.getUpdateCount();
		System.out.println("Registros Inseridos: " + modificacoes);
		state.close();

	}

	public List<Cliente> listaClientes() throws SQLException {

		List<Cliente> clientes = new ArrayList<Cliente>();
		PreparedStatement state = conexao
				.prepareStatement("SELECT * FROM comex.cliente");
		state.execute();
		ResultSet resultado = state.getResultSet();
		while (resultado.next()) {
			clientes.add(this.criaCliente(resultado));// rever
		}
		resultado.close();
		state.close();
		return clientes;
	}

//	public void exclui(Integer id) throws SQLException {
//		String sql = "DELETE FROM comex.produto WHERE ID = ?";
//
//		PreparedStatement state = conexao.prepareStatement(sql);
//		state.setInt(1, id);
//		state.execute();
//		Integer modificacoes = state.getUpdateCount();
//		System.out.println("Registros Excluidos: " + modificacoes);
//
//		state.close();
//	}
//
//	public void altera(Produto produto) throws SQLException {
//
//		PreparedStatement state = conexao
//				.prepareStatement(("NOME=? ,DESCRICAO=? ,PRECO_UNITARIO=? ,QUANTIDADE_ESTOQUE=? ,CATEGORIA_ID=? ,TIPO=? ")
//						+ "WHERE id=?");
//		state.setString(1, produto.getNome());
//		state.setString(2, produto.getDescricao());
//		state.setBigDecimal(3, produto.getPrecoUnitario());
//		state.setInt(4, produto.getQtdEstoque());
//		state.setInt(5, produto.getCategoria());
//		state.setString(6, produto.getTipo().name());
//		state.setInt(7, produto.getId());
//		state.execute();
//		Integer modificacoes = state.getUpdateCount();
//		System.out.println("Registros Modificados: " + modificacoes);
//		state.close();
//
//	}
//
//	public Produto buscaPorId(Integer id) throws SQLException {
//		String sql = "SELECT * FROM comex.produto WHERE ID = ?";
//
//		try (PreparedStatement state = this.conexao.prepareStatement(sql)) {
//			state.setInt(1, id);
//
//			try (ResultSet registro = state.executeQuery()) {
//				Produto produto = null;
//				if (registro.next()) {
//					produto = this.criaProduto(registro);
//				}
//				return produto;
//			}
//		}
//	}

	private Cliente criaCliente(ResultSet registro) throws SQLException {
		Cliente cliente = new Cliente

		(registro.getString("NOME"), registro.getString("CPF"),
				registro.getString("TELEFONE"), registro.getString("RUA"),
				registro.getString("NUMERO"),
				registro.getString("COMPLEMENTO"),
				registro.getString("BAIRRO"), registro.getString("CIDADE"),
				registro.getString("UF"));

		cliente.setId(registro.getInt("ID"));
		cliente.setNome(registro.getString("NOME"));
		cliente.setCpf(registro.getString("CPF"));
		cliente.setTelefone(registro.getString("TELEFONE"));
		cliente.setRua(registro.getString("RUA"));
		cliente.setNumeroRua(registro.getString("NUMERO"));
		cliente.setComplemento(registro.getString("COMPLEMENTO"));
		cliente.setBairro(registro.getString("BAIRRO"));
		cliente.setCidade(registro.getString("CIDADE"));
		ClienteEstado cliEstado = ClienteEstado.valueOf(registro
				.getString("UF"));
		// categoria.setStatus(status);
		cliente.setEstado(cliEstado);

		System.out.println(cliente);
		return cliente;
	}

}
