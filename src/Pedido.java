
public class Pedido {
	private int id;
	private static int idsozinho = 1;
	private String data;
	private String cliente;

	public Pedido(String data, String cliente) {
		this.id = idsozinho++;
		this.data = data;
		this.cliente = cliente;

	}

	public int getId() {
		return id;
	}

	public String getData() {
		return data;
	}

	public String getCliente() {
		return cliente;
	}

}
