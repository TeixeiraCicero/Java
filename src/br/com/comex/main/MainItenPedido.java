package br.com.comex.main;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ClienteEstado;
import br.com.comex.modelo.ItemPedido;
import br.com.comex.modelo.Pedido;
import br.com.comex.modelo.Produto;
import br.com.comex.modelo.TipoDesconto;

public class MainItenPedido {

	public static void main(String[] args) {//double preco, int quantidadeNoPedido, Produto nomeProduto,
		
		Cliente cli1 = new Cliente(1, "Craudio", "01234567891", "41999875078","RUA XV",
				"5812", null, "centro", "curitiba",ClienteEstado.PR);
		Categoria cat1 = new Categoria(1, "INFORMATICA");
		Produto prod1 = new Produto(5, "Mouse sem Fio Logi", 109.99, 20,cat1);
		Pedido ped1 = new Pedido("21-09-2022",cli1);
		ItemPedido ip1 = new ItemPedido(prod1.getPrecoUnitario(), 2,
				prod1, ped1, TipoDesconto.PROMOCAO);

		System.out.println("Foram comprados " 
				+ ip1.getQuantidadeNoPedido() + ", " 
				+ prod1.getNomeProduto()+ ", que custa individualmente: R$ " 
				+ prod1.getPrecoUnitario()+ ", o valor total do pedido foi de: R$ " 
				+ ip1.precoTotalSemDesconto()+ ", o total do desconto é de: R$ " 
				+ ip1.calculaDesconto(0) + "O Valor total com desconto e de: R$ "
				+ ip1.precoTotalComDesconto(0)
				);
		
		
	}

}
