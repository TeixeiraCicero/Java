public class Produto {

	private int id;
	private static int idsozinho = 1;
	private String nomeProduto;
	private String descricao;
	private double precoUnitario;
	private int qtdEstoque;
	private String categoria;

	public Produto() {
		this.id = idsozinho++;
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
}