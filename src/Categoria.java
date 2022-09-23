
public class Categoria {

	private int id;
	private static int idsozinho = 1;
	private String nome;
	private StatusCategoria status;
	
	public Categoria() {
		this.id = idsozinho++;
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
}
