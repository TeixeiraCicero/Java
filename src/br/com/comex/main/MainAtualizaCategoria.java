package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.comex.modelo.ConnectionFactory;

public class MainAtualizaCategoria {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory Conexao = new ConnectionFactory();
		try (Connection conect = Conexao.Conect()) {

			try (PreparedStatement state = conect
					.prepareStatement("UPDATE COMEX.CATEGORIA SET NOME ='LIVROS TÉCNICOS' WHERE NOME = 'LIVROS'")) {
				atualizaCategoria(state);

			}
		}
	}

	private static void atualizaCategoria(PreparedStatement state) throws SQLException {
		state.execute();
		Integer modificacoes = state.getUpdateCount();
		System.out.println("Registros Modificados: " + modificacoes);
	}
}