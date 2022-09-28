package br.com.comex.modelo;

public class Cliente {
	private int id;
	private static int idsozinho = 1;
	private String nomeCompleto;
	private String cpf;
	private String numeroCelular;
	private String rua;
	private String numeroRua;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
//	private ClienteEstado estado;

	public Cliente(int id, String nomeCompeto, String cpf, String numeroCelular, String rua, String numeroRua,
			String complemento, String bairro, String cidade, String estado) { // ClienteEstado estado) {
		if (id <= 0) {
			throw new IllegalArgumentException("ID Invalido");
		} else
			this.id = id;

		if (nomeCompeto.length() < 5) {
			throw new IllegalArgumentException("Nome Invalido");
		} else {
			this.nomeCompleto = nomeCompeto;
		}
		if (cpf.length() < 11) {
			throw new IllegalArgumentException("CPF Invalido");
		} else if (cpf.length() > 14) {
			throw new IllegalArgumentException("CPF Invalido");
		} else {
			this.cpf = cpf;
		}

		if (numeroCelular != null) {
			if

			(numeroCelular.length() < 11) {
				throw new IllegalArgumentException("Telefone Invalido");
			} else if (numeroCelular.length() > 16) {
				throw new IllegalArgumentException("Telefone Invalido");
			} else {
				this.numeroCelular = numeroCelular;
			}
		}
		if (rua.length() < 5) {
			throw new IllegalArgumentException("Nome da Rua Invalido");
		} else {
			this.rua = rua;
		}
		if (numeroRua.length() <= 1) {
			throw new IllegalArgumentException("Numero da residencia Invalido");
		} else {
			this.numeroRua = numeroRua;
		}

		this.complemento = complemento;

		if (bairro.length() <= 1) {
			throw new IllegalArgumentException("Nome do bairro Invalido");
		} else {
			this.bairro = bairro;
		}

		if (cidade.length() <= 1) {
			throw new IllegalArgumentException("Nome da cidade Invalido");
		} else {
			this.cidade = cidade;
		}

		if (estado.length() != 2) {
			throw new IllegalArgumentException("Nome do estado Invalido");
		} else {
			this.estado = estado;
		}

	}

	public int getId() {
		return id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public String getCpf() {
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

//	public ClienteEstado getEstado() {
//		return estado;
//	}

	public String getEstado() {
		return estado;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
		return "o ID e " 
				+ getId() + ", o nome do Cliente e " 
				+ getNomeCompleto() + ", seu CPF e " 
				+ getCpf()+ ", seu numero de Celular e " 
				+ getNumeroCelular() + ", Mora no Estado " 
				+ getEstado() + ", na Cidade "
				+ getCidade() + ", no Bairro " 
				+ getBairro() + ", na Rua " 
				+ getRua() + ", no Numero " 
				+ getNumeroRua()+ ", e o complemento e " 
				+ getComplemento();
	}
}
