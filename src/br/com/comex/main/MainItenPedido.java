package br.com.comex.main;
import br.com.comex.modelo.ItemPedido;
import br.com.comex.modelo.TipoDesconto;

public class MainItenPedido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemPedido c01 = new ItemPedido(100.00, 11, "Mouse LogiTech", 1, TipoDesconto.QUANTIDADE);
		ItemPedido c02 = new ItemPedido(80.00, 1, "As Cronicas de Gelo e Fogo", 2, TipoDesconto.PROMOCAO);
		ItemPedido c03 = new ItemPedido(5.00, 12, "Copo Americano", 3, TipoDesconto.NENHUM);

		System.out.println("Foram comprados " + c01.getQuantidadeNoPedido() + ", " + c01.getNomeProduto()
				+ ", que custa individualmente: R$ " + c01.getPrecoProdutoNoPedido()
				+ ", o valor total do pedido foi de: R$ " + c01.precoTotalSemDesconto()
				+ ", o total do desconto é de: R$ " + c01.calculaDesconto(0) + "O Valor total com desconto e de: R$ "
				+ c01.precoTotalComDesconto(0));

		System.out.println("Foram comprados " + c02.getQuantidadeNoPedido() + ", " + c02.getNomeProduto()
				+ ", que custa individualmente: R$ " + c02.getPrecoProdutoNoPedido()
				+ ", o valor total do pedido foi de: R$ " + c02.precoTotalSemDesconto()
				+ ", o total do desconto é de: R$ " + c02.calculaDesconto(0) + "O Valor total com desconto e de: R$ "
				+ c02.precoTotalComDesconto(0));

		System.out.println("Foram comprados " + c03.getQuantidadeNoPedido() + ", " + c03.getNomeProduto()
				+ ", que custa individualmente: R$ " + c03.getPrecoProdutoNoPedido()
				+ ", o valor total do pedido foi de: R$ " + c03.precoTotalSemDesconto()
				+ ", o total do desconto é de: R$ " + c03.calculaDesconto(0) + "O Valor total com desconto e de: R$ "
				+ c03.precoTotalComDesconto(0));
	}

}
