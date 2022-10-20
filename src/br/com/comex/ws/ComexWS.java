package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.comex.dao.CategoriaDao;
import br.com.comex.dao.ClienteDao;
import br.com.comex.dao.ProdutoDao;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Produto;

@WebService
public class ComexWS {
	
	Connection conexao = new ConnectionFactory().Conect();
	
	private CategoriaDao catDao = new CategoriaDao(conexao);
	private ProdutoDao proDao = new ProdutoDao(conexao);
	private ClienteDao cliDao = new ClienteDao(conexao);
	
	@WebMethod(operationName="listarCategorias")
	@WebResult(name="Categoria")
	public List<Categoria> getCategorias() throws SQLException {
		System.out.println("getCategorias");
		List<Categoria> lista = catDao.listaCategorias();
		return lista;
	}
	
	
	@WebMethod(operationName="AdicionaCategorias")
	@WebResult(name="Categoria")
	public Categoria adicionarCategoria(Categoria categoria) throws SQLException{
		this.catDao.insere(categoria);
		return categoria;
	}
	@WebMethod(operationName="listarProdutos")
	@WebResult(name="Produto")
	public List<Produto> getProdutos() throws SQLException {
		System.out.println("getProdutos");
		List<Produto> lista = proDao.listaProdutos();
		return lista;
	}
	@WebMethod(operationName="listarClientes")
	@WebResult(name="Cliente")
	public List<Cliente> getClientes() throws SQLException {
		System.out.println("getClientes");
		List<Cliente> lista = cliDao.listaClientes();
		return lista;
	}
}
