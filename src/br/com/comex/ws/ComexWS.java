package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.jws.WebService;

import br.com.comex.dao.CategoriaDao;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Categoria;

@WebService
public class ComexWS {
	

	
	Connection conexao = new ConnectionFactory().Conect();
	private CategoriaDao catDao = new CategoriaDao(conexao);
	
	public List<Categoria> getCategorias() throws SQLException {
		System.out.println("getCategorias");
		List<Categoria> lista = catDao.listaCategorias();
		return lista;
	}
}
