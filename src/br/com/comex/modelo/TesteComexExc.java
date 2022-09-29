package br.com.comex.modelo;

public class TesteComexExc {
	private int id;
//	private static int idsozinho = 1;
	private String nome;
	private StatusCategoria2 status;

	public TesteComexExc(int id, String nome) {
		if (id <= 0) {
			throw new ComexException("ID Invalido");
		} else
			this.id = id;
		if (nome.length() > 3)
			this.nome = nome;
		else {
			throw new ComexException("Nome Invalido");
		}
		this.status = StatusCategoria2.ATIVO;
	}

	public TesteComexExc(int id, String nome, StatusCategoria2 status) {
		if (id <= 0) {
			throw new ComexException("ID Invalido");
		} else
			this.id = id;
		if (nome.length() > 3)
			this.nome = nome;
		else {
			throw new ComexException("Nome Invalido");
		}
		if (status == null) {
			throw new ComexException("Categoria Invalido");
		}else {
			this.status = status;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public StatusCategoria2 getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "Categoria " 
				+ getNome() + " ( " 
				+ getId() + " - " 
				+ getStatus() + " ). ";
	}
}
