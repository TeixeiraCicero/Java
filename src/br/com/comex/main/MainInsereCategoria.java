package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ConnectionFactory;
import br.com.comex.modelo.StatusCategoria;

public class MainInsereCategoria {

	public static void main(String[] args) throws SQLException {
		String[] colunaId = { "id" };
		Categoria cat1 = new Categoria("INFORMÁTICA",StatusCategoria.ATIVA);
		Categoria cat2 = new Categoria("MÓVEIS",StatusCategoria.INATIVA);
		Categoria cat3 = new Categoria("LIVROS",StatusCategoria.ATIVA);
		
		ConnectionFactory Conexao = new ConnectionFactory();
		try (Connection conect = Conexao.Conect()) {

			try (PreparedStatement state = conect
					.prepareStatement
					("INSERT INTO comex.categoria(NOME,STATUS) VALUES (?,?)", colunaId)) {
				
				adicionaCategoria(cat1.getNome(), cat1.getStatus(), state);
				adicionaCategoria(cat2.getNome(), cat2.getStatus(), state);
				adicionaCategoria(cat3.getNome(), cat3.getStatus(), state);
				
				System.out.println(cat1);
			}
		}
	}

	private static void adicionaCategoria(String nome, StatusCategoria status, PreparedStatement state) throws SQLException {
		state.setString(1, nome);
		state.setString(2, status.name());	
		state.execute();

		try (ResultSet rs = state.getGeneratedKeys()) {
			while (rs.next()) {
				System.out.println("O ID criado foi: " + rs.getInt(1));
				Integer modificacoes = state.getUpdateCount();
				System.out.println("Registros Inseridos: " + modificacoes);
			}
			
		}
	}
}
