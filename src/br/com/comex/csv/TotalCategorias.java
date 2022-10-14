package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TotalCategorias {

	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidosCsv leitorCsv = new LeitorPedidosCsv();
		List<PedidoCsv> pedidos = leitorCsv.leCsv();
		Set<String> listaCategoria = new HashSet<>();

		for (PedidoCsv pedidoCsv : pedidos) {

		    listaCategoria.add(pedidoCsv.getCategoria());

		}

		System.out.println("Total de categorias: "+listaCategoria.size());
	}
	
}
