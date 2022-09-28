package br.com.comex.main;
import br.com.comex.modelo.Pedido;

public class MainPedido {

	public static void main(String[] args) {

		Pedido ped1 = new Pedido("21-09-2022", "Gabi");
		Pedido ped2 = new Pedido("21-09-2022", "Eli");
		Pedido ped3 = new Pedido("21-09-2022", "Ana");
		Pedido ped4 = new Pedido("22-09-2022", "Gabi");
		Pedido ped5 = new Pedido("22-09-2022", "Ana");

		System.out.println("O ID do pedido e " + ped1.getId() + ", foi feito pelo(a) cliente " + ped1.getCliente()
				+ ", na data " + ped1.getData() + ".");
		System.out.println("O ID do pedido e " + ped2.getId() + ", foi feito pelo(a) cliente " + ped2.getCliente()
				+ ", na data " + ped2.getData() + ".");
		System.out.println("O ID do pedido e " + ped3.getId() + ", foi feito pelo(a) cliente " + ped3.getCliente()
				+ ", na data " + ped3.getData() + ".");
		System.out.println("O ID do pedido e " + ped4.getId() + ", foi feito pelo(a) cliente " + ped4.getCliente()
				+ ", na data " + ped4.getData() + ".");
		System.out.println("O ID do pedido e " + ped5.getId() + ", foi feito pelo(a) cliente " + ped5.getCliente()
				+ ", na data " + ped5.getData() + ".");

	}

}
