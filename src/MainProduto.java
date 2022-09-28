
public class MainProduto {

	public static void main(String[] args) {// id, nome, preco, qtd, categoria
//		Produto prod1 = new Produto(0, "xxFBI", 109.98, 2, "LIVROS");//ID invalido
//		Produto prod1 = new Produto(5, "FBI", 109.98, 2, "LIVROS");//NOME invalido
//		Produto prod1 = new Produto(5, "xxFBI", 0, 2, "LIVROS");//PRECO invalido
//		Produto prod1 = new Produto(5, "xxFBI", 109.98, 0, "LIVROS");//QUANTIDADE invalido
//		Produto prod1 = new Produto(5, "xxFBI", 109.98, 2, null);//CATEGORIA invalido
		Produto prod1 = new Produto(5, "xxFBI", 109.98, 2, "LIVROS");// valido
		
//		Produto prod2 = new ProdutoIsento(0, "xxFBI", 109.98, 2, "LIVROS");//ID invalido
//		Produto prod2 = new ProdutoIsento(5, "FBI", 109.98, 2, "LIVROS");//NOME invalido
//		Produto prod2 = new ProdutoIsento(5, "xxFBI", 0, 2, "LIVROS");//PRECO invalido
//		Produto prod2 = new ProdutoIsento(5, "xxFBI", 109.98, 0, "LIVROS");//QUANTIDADE invalido
//		Produto prod2 = new ProdutoIsento(5, "xxFBI", 109.98, 2, null);//CATEGORIA invalido
		Produto prod2 = new ProdutoIsento(5, "xxFBI", 109.98, 2, "LIVROS");// valido
		
		System.out.println(prod1.toString());
		System.out.println(prod2.toString());
	}
}
