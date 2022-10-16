package br.com.comex.main;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.CategoriaDao;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Produto;

public class MainProduto {

	public static void main(String[] args) throws SQLException {// id, nome, preco, qtd, categoria
//		Produto prod1 = new Produto(0, "xxFBI", 109.98, 2, "LIVROS");//ID invalido
//		Produto prod1 = new Produto(5, "FBI", 109.98, 2, "LIVROS");//NOME invalido
//		Produto prod1 = new Produto(5, "xxFBI", 0, 2, "LIVROS");//PRECO invalido
//		Produto prod1 = new Produto(5, "xxFBI", 109.98, 0, "LIVROS");//QUANTIDADE invalido
//		Produto prod1 = new Produto(5, "xxFBI", 109.98, 2, null);//CATEGORIA invalido
//		Produto prod1 = new Produto(5, "xxFBI", 109.98, 2, "LIVROS");// valido
		
//		Produto prod2 = new ProdutoIsento(0, "xxFBI", 109.98, 2, "LIVROS");//ID invalido
//		Produto prod2 = new ProdutoIsento(5, "FBI", 109.98, 2, "LIVROS");//NOME invalido
//		Produto prod2 = new ProdutoIsento(5, "xxFBI", 0, 2, "LIVROS");//PRECO invalido
//		Produto prod2 = new ProdutoIsento(5, "xxFBI", 109.98, 0, "LIVROS");//QUANTIDADE invalido
//		Produto prod2 = new ProdutoIsento(5, "xxFBI", 109.98, 2, null);//CATEGORIA invalido
//		Produto prod2 = new ProdutoIsento(5, "xxFBI", 109.98, 2, "LIVROS");// valido
		
//		System.out.println(prod1.toString());
//		System.out.println(prod2.toString());
		Connection conexao = new ConnectionFactory().Conect();
		CategoriaDao categoriaDao = new CategoriaDao(conexao);
		Categoria cat1 = new Categoria("INFORMATICAxx");
		Categoria cat2 = new Categoria("LIVROSxx");
		categoriaDao.insere(cat1);
		categoriaDao.insere(cat2);
		categoriaDao.altera(cat1);
		categoriaDao.altera(cat2);
		Produto prod1 = new Produto("xxFBI", new BigDecimal(119.98), 2,cat1);
		Produto prod2 = new Produto("xxFBI", new BigDecimal(119.98), 2,cat2);
		
		System.out.println(prod1.toString());
		System.out.println(prod2.toString());
		
	}
}
