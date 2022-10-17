package br.com.comex.main;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.CategoriaDao;
import br.com.comex.dao.ProdutoDao;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.StatusCategoria;
import br.com.comex.modelo.Tipo;

public class MainTesteDao {

	public static void main(String[] args) throws SQLException {
	//	String[] colunaId = { "id" };
	//	Categoria cat1 = new Categoria("TESTE", StatusCategoria.INATIVA);
		Produto prod1 = new Produto("NOVO PRODUTO", new BigDecimal(199.99), 5,145,Tipo.NAO_ISENTO);
		
		Connection conexao = new ConnectionFactory().Conect();
		ProdutoDao produtoDao = new ProdutoDao(conexao);
//		produtoDao.insere(prod1);
		produtoDao.listaProdutos();
//		produtoDao.buscaPorId(10);
//		produtoDao.altera(prod1);
		
			//CategoriaDao categoriaDao = new CategoriaDao(conexao);
//			categoriaDao.insere(cat1);
//			categoriaDao.listaCategorias();
//			categoriaDao.exclui(142);
//			categoriaDao.buscaPorId(139);
//			categoriaDao.altera(cat1);
//			System.out.println(cat1);
//			System.out.println(cat1.getId());
			
			
		}
		

	}
