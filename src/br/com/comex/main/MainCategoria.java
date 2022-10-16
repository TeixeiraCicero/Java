package br.com.comex.main;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.StatusCategoria;

public class MainCategoria {

	public static void main(String[] args) {//CONSTRUTOR id, nome,(OPCional) statusCategoria
//		Categoria cat1 = new Categoria("INFORMATICA");// ID invalido
//		Categoria cat1 = new Categoria("nom",StatusCategoria.INATIVA);//NOME invalido
		Categoria cat1 = new Categoria("Livro",StatusCategoria.ATIVA);//funcionando
		
		System.out.println(cat1.toString());
		

}
}