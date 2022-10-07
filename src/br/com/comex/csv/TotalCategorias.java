package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TotalCategorias {

	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidosCsv leitorCsv = new LeitorPedidosCsv();
		ArrayList<PedidoCsv> pedidos = leitorCsv.leCsv();
		ArrayList<String> listaCategoria = new ArrayList<String>();

		for (PedidoCsv pedidoCsv : pedidos) {
			String categoria = pedidoCsv.getCategoria();
			if (!listaCategoria.contains(categoria)) {
				listaCategoria.add(categoria);
			}
		}
		System.out.println("Total de categorias: "+listaCategoria.size());
	}
}
