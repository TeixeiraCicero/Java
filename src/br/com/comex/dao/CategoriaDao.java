package br.com.comex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.StatusCategoria;

public class CategoriaDao {

	private Connection conexao;

	public CategoriaDao(Connection conexao) {
		this.conexao = conexao;
	}

	public void insere(Categoria categoria) throws SQLException {
		String sql = "INSERT INTO comex.categoria " + "(NOME,STATUS) " + "VALUES " + "(?, ?) ";

		String[] colunaId = { "id" };
		PreparedStatement state = conexao.prepareStatement(sql, colunaId);
		state.setString(1, categoria.getNome());
		state.setString(2, categoria.getStatus().name());
		state.execute();

		ResultSet rs = state.getGeneratedKeys();
		rs.next();
		categoria.setId(rs.getInt(1));
		System.out.println("O ID criado foi: " + rs.getInt(1));
		Integer modificacoes = state.getUpdateCount();
		System.out.println("Registros Inseridos: " + modificacoes);
		state.close();

	}

	public List<Categoria> listaCategorias() throws SQLException {

		List<Categoria> categorias = new ArrayList<Categoria>();
		PreparedStatement state = conexao.prepareStatement("SELECT * FROM comex.categoria");
		state.execute();
		ResultSet registros = state.getResultSet();
		while (registros.next()) {
			categorias.add(this.criaCategoria(registros));
		}
		registros.close();
		state.close();
		return categorias;
	}

	public void exclui(Integer id) throws SQLException {
		String sql = "DELETE FROM comex.categoria WHERE ID = ?";

		PreparedStatement state = conexao.prepareStatement(sql);
		state.setInt(1, id);
		state.execute();
		Integer modificacoes = state.getUpdateCount();
		System.out.println("Registros Excluidos: " + modificacoes);

		state.close();
	}

	public void altera(Categoria categoria) throws SQLException {

		PreparedStatement state = conexao
				.prepareStatement("UPDATE comex.categoria SET nome=? ,status=?" + "WHERE id=?");
		state.setString(1, categoria.getNome());
		state.setString(2, categoria.getStatus().name());
		state.setInt(3, categoria.getId());
		state.execute();
		Integer modificacoes = state.getUpdateCount();
		System.out.println("Registros Modificados: " + modificacoes);
		System.out.println(
				"Categoria" + " " + categoria.getId() + " " + categoria.getNome() + " " + categoria.getStatus());
		state.close();

	}

	public Categoria buscaPorId(Integer id) throws SQLException {
		String sql = "SELECT * FROM comex.categoria WHERE ID = ?";

		try (PreparedStatement state = this.conexao.prepareStatement(sql)) {
			state.setInt(1, id);

			try (ResultSet registro = state.executeQuery()) {
				Categoria categoria = null;
				if (registro.next()) {
					categoria = this.criaCategoria(registro);
				}
				return categoria;
			}
		}
	}

	private Categoria criaCategoria(ResultSet registro) throws SQLException {
		Categoria categoria = new Categoria(registro.getString("nome"));

		categoria.setId(registro.getInt("id"));
		//jdbc nao suporta enum, queria saber como funciona quando usamos enum...
		System.out.println(categoria);
		return categoria;
	}
}
