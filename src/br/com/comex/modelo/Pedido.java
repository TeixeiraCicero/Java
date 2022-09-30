package br.com.comex.modelo;

public class Pedido {
	private int id;
	private static int idsozinho = 1;
	private String data;
	private Cliente cliente;

	public Pedido(String data, Cliente cliente) {
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

	public Cliente getCliente() {
		return cliente;
	}

	public String toString() {
		return "O ID do pedido e " 
				+ getId() + ", foi feito pelo(a) cliente " 
				+ getCliente() + ", na data " 
				+ getData()+ ".";
	}
}
