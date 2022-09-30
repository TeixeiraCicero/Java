package br.com.comex.modelo;
public class Produto {

	private int id;
	private static int idsozinho = 1;
	private String nome;
	private String descricao;
	private double precoUnitario;
	private int qtdEstoque;
	private Categoria categoria;

	public Produto(int id, String nome, double precoUnitario, int qtdEstoque, Categoria categoria) {
		super();
		if (id <= 0) {
			throw new IllegalArgumentException("ID Invalido");
		} else
			this.id = id;
		if(nome.startsWith("9")||nome.startsWith("8")||nome.startsWith("7")||nome.startsWith("6")||
				nome.startsWith("5")||nome.startsWith("4")||nome.startsWith("3")||nome.startsWith("2")||
				nome.startsWith("1")||nome.startsWith("0")) {
			throw new IllegalArgumentException("Nome Invalido, nao pode comecar com NUMERO");}
		
		if (nome.length() < 5) {
			throw new IllegalArgumentException("Nome do Produto Invalido");
		} else {
			this.nome = nome;
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
		//this.categoria = categoria;
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
		return nome;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nome = nomeProduto;
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

	public Categoria getCategoria() {
		return categoria;
	}

//	public void setCategoria(String categoria) {
//		this.categoria = categoria;
//	}

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