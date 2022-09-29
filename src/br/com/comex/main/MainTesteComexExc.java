package br.com.comex.main;

import br.com.comex.modelo.StatusCategoria2;
import br.com.comex.modelo.TesteComexExc;

public class MainTesteComexExc {

	public static void main(String[] args) {
//		TesteComexExc cat1 = new TesteComexExc(0, "INFORMATICA");// ID invalido
		TesteComexExc cat1 = new TesteComexExc(2, "nom");//NOME invalido
//		TesteComexExc cat1 = new TesteComexExc(3, "Livro",StatusCategoria2.INATIVO);// funcionando

		System.out.println(cat1.toString());

	}

}
