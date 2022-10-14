package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;

public class MainListaCategoria {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory Conexao = new ConnectionFactory();
		try (Connection conect = Conexao.Conect()) {

			try (PreparedStatement state = 
					conect.prepareStatement("SELECT ID, NOME, STATUS FROM COMEX.CATEGORIA")) {

				listaCategorias(state);
			}
		}
	}

	private static void listaCategorias(PreparedStatement state) throws SQLException {
		state.execute();
		ResultSet resultado = state.getResultSet();

		while (resultado.next()) {
			Integer id = resultado.getInt("ID");
			System.out.println(id);
			String nome = resultado.getString("NOME");
			System.out.println(nome);
			String status = resultado.getString("STATUS");
			System.out.println(status);
		}
	}
}
