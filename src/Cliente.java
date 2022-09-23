
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
	private String estado;

	public Cliente( int cpf, String numeroCelular, String nomeCompeto, String rua, String numeroRua,
			String complemento, String bairro, String cidade, String estado) {
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
		System.out.println("Cliente criado com sucesso.");
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

	public String getEstado() {
		return estado;
	}

	public void setId(int id) {
		this.id = id;
	}

}
