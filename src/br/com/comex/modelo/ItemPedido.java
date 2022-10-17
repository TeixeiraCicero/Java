package br.com.comex.modelo;

import java.math.BigDecimal;

public class ItemPedido {
	private int id;
	private static int idsozinho;
	private BigDecimal preco;
	private int quantidadeNoPedido;
	private Produto nomeProduto;
	private Pedido numeroPedido;
	private double desconto;
	private TipoDesconto tipoDesconto;
	
	public ItemPedido(BigDecimal preco, int quantidadeNoPedido, Produto nomeProduto,
			Pedido numeroPedido) {
		this.id = idsozinho++;
		this.preco = preco;
		this.quantidadeNoPedido = quantidadeNoPedido;
		this.nomeProduto = nomeProduto;
		this.numeroPedido = numeroPedido;
		this.tipoDesconto = TipoDesconto.NENHUM;
		
	}
	public ItemPedido(BigDecimal preco, int quantidadeNoPedido, Produto nomeProduto,
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

	public BigDecimal getPrecoProdutoNoPedido() {
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

	public BigDecimal precoTotalSemDesconto() {
		return getPrecoProdutoNoPedido().multiply(new BigDecimal(getQuantidadeNoPedido()) );
	}

	public BigDecimal calculaDesconto(BigDecimal totalDesconto) {
		if (tipoDesconto == TipoDesconto.PROMOCAO) {
			totalDesconto = (getPrecoProdutoNoPedido().multiply(new BigDecimal(getQuantidadeNoPedido()))).multiply( new BigDecimal(0.2));
		}

		else if (tipoDesconto == TipoDesconto.QUANTIDADE)
			if(getQuantidadeNoPedido()>10){
			totalDesconto = (getPrecoProdutoNoPedido().multiply(new BigDecimal(getQuantidadeNoPedido()))).multiply( new BigDecimal(0.1));

		} else
			
			return new BigDecimal(0);

		return totalDesconto;
	}
	public BigDecimal precoTotalComDesconto(BigDecimal totalComDesconto) {
		totalComDesconto = precoTotalSemDesconto().subtract(calculaDesconto(new BigDecimal(0))) ;
		return totalComDesconto;
	}
	
	public String toString() {
		return "Foram comprados " 
		+ getQuantidadeNoPedido() + ", " 
		+ getNomeProduto()+ ", que custa individualmente: R$ " 
		+ getPrecoProdutoNoPedido()+ ", o valor total do pedido foi de: R$ " 
		+ precoTotalSemDesconto()+ ", o total do desconto é de: R$ " 
		+ calculaDesconto(new BigDecimal(0)) + "O Valor total com desconto e de: R$ "
		+ precoTotalComDesconto(new BigDecimal(0));
		}
}
