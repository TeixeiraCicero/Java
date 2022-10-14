package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.comex.modelo.ConnectionFactory;

public class MainRemoveCategoria {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory Conexao = new ConnectionFactory();
		try (Connection conect = Conexao.Conect()) {

			try (PreparedStatement state = conect
					.prepareStatement("DELETE FROM COMEX.CATEGORIA")){// WHERE STATUS = 'INATIVA'")) {
				removeCategoria(state);
			}
		}
	}
	private static void removeCategoria(PreparedStatement state) throws SQLException {
		state.execute();
		Integer modificacoes = state.getUpdateCount();
		System.out.println("Registros Excluidos: " + modificacoes);
	}
}
