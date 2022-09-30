package br.com.comex.modelo;

public class Cliente {
	private int id;
	private String nomeCompleto;
	private String cpf;
	private String numeroCelular;
	private String rua;
	private String numeroRua;
	private String complemento;
	private String bairro;
	private String cidade;
	private ClienteEstado estado;

	public Cliente(int id, String nomeCompleto, String cpf, String numeroCelular, String rua, String numeroRua,
			String complemento, String bairro, String cidade,ClienteEstado estado) {
		if (id <= 0) {
			throw new IllegalArgumentException("ID Invalido");
		} else
			this.id = id;
		if(nomeCompleto.startsWith("9")||nomeCompleto.startsWith("8")||nomeCompleto.startsWith("7")||nomeCompleto.startsWith("6")||
				nomeCompleto.startsWith("5")||nomeCompleto.startsWith("4")||nomeCompleto.startsWith("3")||nomeCompleto.startsWith("2")||
				nomeCompleto.startsWith("1")||nomeCompleto.startsWith("0")) {
			throw new IllegalArgumentException("Nome Invalido, nao pode comecar com NUMERO");
		}
		if (nomeCompleto.length() < 5) {
			throw new IllegalArgumentException("Nome Invalido");
		} else {
			this.nomeCompleto = nomeCompleto;
		}
		if(!cpf.matches("[0-9]{11}")) {
			throw new IllegalArgumentException("O cpf está incorreto");
		}else {
			String cpf1 = cpf.substring(0,3);
			String cpf2 = cpf.substring(3,6);
			String cpf3 = cpf.substring(6,9);
			String cpf4 = cpf.substring(9,11);
			
			cpf = cpf1+"."+cpf2+"."+cpf3+"-"+cpf4;
			this.cpf = cpf;
		}
		if (numeroCelular != null) {
			if(!numeroCelular.matches("[0-9]{11}")) {
				throw new IllegalArgumentException("O telefone está incorreto");
			}else {
				String tel1 = numeroCelular.substring(0,2);
				String tel2 = numeroCelular.substring(2,3);
				String tel3 = numeroCelular.substring(3,7);
				String tel4 = numeroCelular.substring(7,11);
				
				numeroCelular = "("+tel1+") "+tel2+" "+tel3+"-"+tel4;
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
		
		this.estado = estado;
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
