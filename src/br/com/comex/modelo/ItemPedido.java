package br.com.comex.modelo;

public class ItemPedido {
	private int id;
	private static int idsozinho;
	private double preco;
	private int quantidadeNoPedido;
	private Produto nomeProduto;
	private Pedido numeroPedido;
	private double desconto;
	private TipoDesconto tipoDesconto;
	
	public ItemPedido(double preco, int quantidadeNoPedido, Produto nomeProduto,
			Pedido numeroPedido) {
		this.id = idsozinho++;
		this.preco = preco;
		this.quantidadeNoPedido = quantidadeNoPedido;
		this.nomeProduto = nomeProduto;
		this.numeroPedido = numeroPedido;
		this.tipoDesconto = TipoDesconto.NENHUM;
		
	}
	public ItemPedido(double preco, int quantidadeNoPedido, Produto nomeProduto,
			Pedido numeroPedido, TipoDesconto tipoDesconto) {
		this.id = idsozinho++;
		this.preco = preco;
		this.quantidadeNoPedido = quantidadeNoPedido;
		this.nomeProduto = nomeProduto;
		this.numeroPedido = numeroPedido;
		this.tipoDesconto = tipoDesconto;
		
	}

	public int getId() {
		return id;
	}

	public double getPrecoProdutoNoPedido() {
		return preco;
	}

	public int getQuantidadeNoPedido() {
		return quantidadeNoPedido;
	}

	public Produto getNomeProduto() {
		return nomeProduto;
	}

	public Pedido getNumeroPedido() {
		return numeroPedido;
	}

	public double getDesconto() {
		return desconto;
	}

	public double precoTotalSemDesconto() {
		return getPrecoProdutoNoPedido() * getQuantidadeNoPedido();
	}

	public double calculaDesconto(double totalDesconto) {
		if (tipoDesconto == TipoDesconto.PROMOCAO) {
			totalDesconto = (getPrecoProdutoNoPedido() * getQuantidadeNoPedido()) * 0.2;
		}

		else if (tipoDesconto == TipoDesconto.QUANTIDADE)
			if(getQuantidadeNoPedido()>10){
			totalDesconto = (getPrecoProdutoNoPedido() * getQuantidadeNoPedido()) * 0.1;

		} else
			
			return 0;

		return totalDesconto;
	}
	public double precoTotalComDesconto(double totalComDesconto) {
		totalComDesconto = precoTotalSemDesconto() - calculaDesconto(0);
		return totalComDesconto;
	}
	
	public String toString() {
		return "Foram comprados " 
		+ getQuantidadeNoPedido() + ", " 
		+ getNomeProduto()+ ", que custa individualmente: R$ " 
		+ getPrecoProdutoNoPedido()+ ", o valor total do pedido foi de: R$ " 
		+ precoTotalSemDesconto()+ ", o total do desconto é de: R$ " 
		+ calculaDesconto(0) + "O Valor total com desconto e de: R$ "
		+ precoTotalComDesconto(0);
		}
}
