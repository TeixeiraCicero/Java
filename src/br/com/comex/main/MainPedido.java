package br.com.comex.main;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ClienteEstado;
import br.com.comex.modelo.Pedido;

public class MainPedido {

	public static void main(String[] args) {
		
		Cliente cli1 = new Cliente("Craudio", "01234567891", "41999875078","RUA XV", "5812", null, "centro", "curitiba",ClienteEstado.PR);
		Cliente cli2 = new Cliente("Maria", "01234567891", "41999875078","RUA XV", "5812", null, "centro", "curitiba",ClienteEstado.PR);
		Cliente cli3 = new Cliente("Bastiao", "01234567891", "41999875078","RUA XV", "5812", null, "centro", "curitiba",ClienteEstado.PR);
		Cliente cli4 = new Cliente("Zezinho", "01234567891", "41999875078","RUA XV", "5812", null, "centro", "curitiba",ClienteEstado.PR);
		Cliente cli5 = new Cliente("Marcia", "01234567891", "41999875078","RUA XV", "5812", null, "centro", "curitiba",ClienteEstado.PR);

		Pedido ped1 = new Pedido("21-09-2022",cli1);
		Pedido ped2 = new Pedido("21-09-2022",cli2);
		Pedido ped3 = new Pedido("21-09-2022",cli3);
		Pedido ped4 = new Pedido("22-09-2022",cli4);
		Pedido ped5 = new Pedido("22-09-2022",cli5);

		System.out.println(ped1.toString());
		System.out.println(ped2.toString());
		System.out.println(ped3.toString());
		System.out.println(ped4.toString());
		System.out.println(ped5.toString());
	

	}

}
