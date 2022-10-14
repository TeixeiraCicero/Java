package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;

public class MainTestaConexao {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory Conexao = new ConnectionFactory();
		Connection conect = Conexao.Conect();
		
		System.out.println("Conexão efetuada com sucesso");
		conect.close();
		
	}

}
