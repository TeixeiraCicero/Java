package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.List;

public class TotalPedidos {
	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidosCsv leitorCsv = new LeitorPedidosCsv();
		List<PedidoCsv> pedidos =  leitorCsv.leCsv();
		
		System.out.println("Total de pedidos: "+pedidos.size());
	}
}
