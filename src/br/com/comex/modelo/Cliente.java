package br.com.comex.modelo;

public class Cliente {
	private int id;
	private static int idsozinho = 1;
	private String nomeCompleto;
	private int cpf;
	private String numeroCelular;
	private String rua;
	private String numeroRua;
	private String complemento;
	private String bairro;
	private String cidade;
	private ClienteEstado estado;

	public Cliente( int cpf, String numeroCelular, String nomeCompeto, String rua, String numeroRua,
			String complemento, String bairro, String cidade, ClienteEstado estado) {
		this.id = idsozinho++;
		this.cpf = cpf;
		this.nomeCompleto = nomeCompeto;
		this.numeroCelular = numeroCelular;
		this.rua = rua;
		this.numeroRua = numeroRua;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public int getCpf() {
		return cpf;
	}

	public String getNumeroCelular() {
		return numeroCelular;
	}

	public String getRua() {
		return rua;
	}

	public String getNumeroRua() {
		return numeroRua;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public ClienteEstado getEstado() {
		return estado;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		return "o ID e " 
				+ getId() + ", o nome do Cliente e " 
				+ getNomeCompleto() + ", seu CPF e "
				+ getCpf() + ", seu numero de Celular e " 
				+ getNumeroCelular() + ", Mora no Estado "
				+ getEstado() + ", na Cidade " 
				+ getCidade() + ", no Bairro " 
				+ getBairro() + ", na Rua "
				+ getRua() + ", no Numero " 
				+ getNumeroRua() + ", e o complemento e "
				+ getComplemento();
	}
}
