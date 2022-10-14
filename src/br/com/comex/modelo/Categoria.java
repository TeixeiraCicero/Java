package br.com.comex.modelo;
public class Categoria {

	private int id;
	private String nome;
	private StatusCategoria status;

	public Categoria(int id, String nome) {
		if (id <= 0) {
			throw new IllegalArgumentException("ID Invalido");
		} else
			this.id = id;
		if(nome.startsWith("9")||nome.startsWith("8")||nome.startsWith("7")||nome.startsWith("6")||
				nome.startsWith("5")||nome.startsWith("4")||nome.startsWith("3")||nome.startsWith("2")||
				nome.startsWith("1")||nome.startsWith("0")) {
			throw new IllegalArgumentException("Nome Invalido, nao pode comecar com NUMERO");}
		
		if (nome.length() > 3)
			this.nome = nome;
		else {
			throw new IllegalArgumentException("Nome Invalido");
		}
		this.status = StatusCategoria.ATIVA;
	}

	public Categoria(int id, String nome, StatusCategoria status) {
		if (id <= 0) {
			throw new IllegalArgumentException("ID Invalido");
		} else
			this.id = id;
		if (nome.length() > 3)
			this.nome = nome;
		else {
			throw new IllegalArgumentException("Nome Invalido");
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

	public StatusCategoria getStatus() {
		return status;
	}

	public void setStatus(StatusCategoria status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Categoria " 
				+ getNome() + " ( " 
				+ getId() + " - " 
				+ getStatus() + " ). ";
	}
}