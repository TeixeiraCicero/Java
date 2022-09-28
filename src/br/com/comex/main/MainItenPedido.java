package br.com.comex.main;
import br.com.comex.modelo.ItemPedido;
import br.com.comex.modelo.TipoDesconto;

public class MainItenPedido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemPedido c01 = new ItemPedido(100.00, 11, "Mouse LogiTech", 1, TipoDesconto.QUANTIDADE);
		ItemPedido c02 = new ItemPedido(80.00, 1, "As Cronicas de Gelo e Fogo", 2, TipoDesconto.PROMOCAO);
		ItemPedido c03 = new ItemPedido(5.00, 12, "Copo Americano", 3, TipoDesconto.NENHUM);

		System.out.println(c01.toString());
		System.out.println(c02.toString());
		System.out.println(c03.toString());
	}

}
