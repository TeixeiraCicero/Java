
public class Categoria {

	private int id;
	private String nome;
	private boolean stats;
	
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


	public void setStatus(boolean stats) {
		this.stats = stats;
	}

	public boolean getStatus() {
		if (stats == true) {
			System.out.print("Ativo. ");
			return stats;
		} else {
			System.out.print("Inativo. ");
			return stats;
		}
	}
}
