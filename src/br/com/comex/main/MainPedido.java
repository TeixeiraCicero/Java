package br.com.comex.main;
import br.com.comex.modelo.Pedido;

public class MainPedido {

	public static void main(String[] args) {

		Pedido ped1 = new Pedido("21-09-2022", "Gabi");
		Pedido ped2 = new Pedido("21-09-2022", "Eli");
		Pedido ped3 = new Pedido("21-09-2022", "Ana");
		Pedido ped4 = new Pedido("22-09-2022", "Gabi");
		Pedido ped5 = new Pedido("22-09-2022", "Ana");

		System.out.println(ped1.toString());
		System.out.println(ped2.toString());
		System.out.println(ped3.toString());
		System.out.println(ped4.toString());
		System.out.println(ped5.toString());
	

	}

}
