package br.com.comex.modelo;

public class ProdutoIsento extends Produto {
	
	
	public ProdutoIsento(int id, String nomeProduto, double precoUnitario, int qtdEstoque, String categoria) {
		super(id, nomeProduto, precoUnitario, qtdEstoque, categoria);
	}

	public double calculaImposto() {
		return 0;
	}
}
