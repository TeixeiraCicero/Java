package br.com.comex.modelo;

public class Categoria {

	private int id;
	private String nome;
	private StatusCategoria statusCategoria;
	private String stats;

	public Categoria(String nome) {
		if (nome.startsWith("9") || nome.startsWith("8") || nome.startsWith("7") || nome.startsWith("6")
				|| nome.startsWith("5") || nome.startsWith("4") || nome.startsWith("3") || nome.startsWith("2")
				|| nome.startsWith("1") || nome.startsWith("0")) {
			throw new IllegalArgumentException("Nome Invalido, nao pode comecar com NUMERO");
		}

		if (nome.length() > 3)
			this.nome = nome;
		else {
			throw new IllegalArgumentException("Nome Invalido");
		}
		this.statusCategoria = StatusCategoria.ATIVA;
	}

	public Categoria(String nome, StatusCategoria statusCategoria) {
		if (nome.startsWith("9") || nome.startsWith("8") || nome.startsWith("7") || nome.startsWith("6")
				|| nome.startsWith("5") || nome.startsWith("4") || nome.startsWith("3") || nome.startsWith("2")
				|| nome.startsWith("1") || nome.startsWith("0")) {
			throw new IllegalArgumentException("Nome Invalido, nao pode comecar com NUMERO");
		}

		if (nome.length() > 3)
			this.nome = nome;
		else {
			throw new IllegalArgumentException("Nome Invalido");
		}
		this.statusCategoria = statusCategoria;
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
		return statusCategoria;
	}

	public void setStatus(StatusCategoria statusCategoria) {
		this.statusCategoria = statusCategoria;
	}
	
	public void setStats(String stats) {
		this.stats = stats;
	}
	

	@Override
	public String toString() {
		return "Categoria " + getNome() + " ( " + getId() + " - " + getStatus() + " ). ";
	}

}