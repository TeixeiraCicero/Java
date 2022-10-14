package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.List;

public class PedidoMaisBaratoEMaisCaro {

	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidosCsv leitorCsv = new LeitorPedidosCsv();
		List<PedidoCsv> pedidos = leitorCsv.leCsv();
		
		ComparadorDePedidos porValor = new ComparadorDePedidos();
		pedidos.sort(porValor);
		
		double preco = Double.parseDouble(pedidos.get(0).getPreco());
		double quantidade = Integer.parseInt(pedidos.get(0).getQuantidade());
		
		System.out.println("Pedido Mais Barato: "+ (preco * quantidade) +" ("+pedidos.get(0).getProduto()+")");

		
		preco = Double.parseDouble(pedidos.get(pedidos.size()-1).getPreco());
		quantidade = Double.parseDouble(pedidos.get(pedidos.size()-1).getQuantidade());
		
		System.out.println("Pedido Mais Caro  : "+ (preco * quantidade) +" ("+pedidos.get(pedidos.size()-1).getProduto()+")");
	}
}

class ComparadorDePedidos implements Comparator<PedidoCsv> {

	@Override
	public int compare(PedidoCsv p1, PedidoCsv p2) {
		double ValorPedido1 = Double.parseDouble(p1.getPreco()) * Integer.parseInt(p1.getQuantidade());
		double ValorPedido2 = Double.parseDouble(p2.getPreco()) * Integer.parseInt(p2.getQuantidade());
		if(ValorPedido1 == ValorPedido2 ){
			return 0;
		} else if(ValorPedido1 > ValorPedido2 ){
			return 1;
		} else {
		    return -1;
		}
	}
}
