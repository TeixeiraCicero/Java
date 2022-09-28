package br.com.comex.modelo;
public class Produto {

	private int id;
	private static int idsozinho = 1;
	private String nomeProduto;
	private String descricao;
	private double precoUnitario;
	private int qtdEstoque;
	private String categoria;

	public Produto(int id, String nomeProduto, double precoUnitario, int qtdEstoque, String categoria) {
		super();
		if (id <= 0) {
			throw new IllegalArgumentException("ID Invalido");
		} else
			this.id = id;
		if (nomeProduto.length() < 5) {
			throw new IllegalArgumentException("Nome do Produto Invalido");
		} else {
			this.nomeProduto = nomeProduto;
		}
		if (precoUnitario <= 0) {
			throw new IllegalArgumentException("Preco Invalido");
		} else {
			this.precoUnitario = precoUnitario;
		}
		if (qtdEstoque <= 0) {
			throw new IllegalArgumentException("Quantidade Invalida");
		} else {
			this.qtdEstoque = qtdEstoque;
		}
		if (categoria == null) {
			throw new IllegalArgumentException("Categoria Invalida");
		} else {
			this.categoria = categoria;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double calculaValorTotalEmEstoque() {
		double total = this.qtdEstoque * this.precoUnitario;
		return total;
	}

	public double calculaImposto() {
		double imposto = this.precoUnitario * 0.4;
		return imposto;
	}

	@Override
	public String toString() {
		return "o ID do produto é: "
				+getId()+", sua Categoria é: "   
				+getCategoria()+", o Nome do Produto é: "
				+getNomeProduto()+", a descrição do Produto é: "
				+getDescricao()+", cada Unidade Custa: R$"
				+getPrecoUnitario()+", atualmente temos em Estoque: "
				+getQtdEstoque()+" unidade(s) do produto, Seus impostos são de: R$"
				+calculaImposto()+" por unidade, e o valor total de todos os "
				+getNomeProduto()+" em estoque é de: R$"
				+calculaValorTotalEmEstoque();
		
	}
}