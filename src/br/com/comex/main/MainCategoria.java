package br.com.comex.main;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.StatusCategoria;

public class MainCategoria {

	public static void main(String[] args) {//CONSTRUTOR id, nome,(OPCional) statusCategoria
//		Categoria cat1 = new Categoria(0, "INFORMATICA");// ID invalido
//		Categoria cat1 = new Categoria(2, "nom",StatusCategoria.INATIVA);//NOME invalido
		Categoria cat1 = new Categoria(3, "Livro",StatusCategoria.ATIVA);//funcionando
		
		System.out.println(cat1.toString());
		

}
}