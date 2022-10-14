package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.List;

public class TotalProdutosVendidos {
	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidosCsv leitorCsv = new LeitorPedidosCsv();
		List<PedidoCsv> pedidos = leitorCsv.leCsv();

		int somaProdutosVendidos = 0;

		for (PedidoCsv pedidoCsv : pedidos) {
			somaProdutosVendidos += Integer.parseInt(pedidoCsv.getQuantidade());
		}

		System.out.println("Total de produtos vendidos: " + somaProdutosVendidos);
	}
}
