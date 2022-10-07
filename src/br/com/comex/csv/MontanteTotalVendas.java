package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MontanteTotalVendas {
	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidosCsv leitorCsv = new LeitorPedidosCsv();
		ArrayList<PedidoCsv> pedidos = leitorCsv.leCsv();	
		
		double somaDoValorTotalDeProdutosVendidos = 0;

		for (PedidoCsv pedidoCsv : pedidos) {
			somaDoValorTotalDeProdutosVendidos = somaDoValorTotalDeProdutosVendidos + 
					Double.parseDouble(pedidoCsv.getPreco()) * Integer.parseInt(pedidoCsv.getQuantidade()) ;
		}
		System.out.println("Montante de vendas: "+somaDoValorTotalDeProdutosVendidos);
		
	
	
	}
	
	
}
