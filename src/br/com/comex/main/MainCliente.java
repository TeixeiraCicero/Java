package br.com.comex.main;
import br.com.comex.modelo.Cliente;

public class MainCliente {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente(123456789, "(45)988521548", "Ana", "AV Ayrtor Neves", "18845", "Sobrado 5",
				"Centro", "Foz do Iguaçu", "Parana");
		Cliente cli2 = new Cliente(987654321, "(43)981548748", "Eli", "AV Mundo Alegre", "145", "Casa", "Centro",
				"Cascavel", "Parana");
		Cliente cli3 = new Cliente(147852369, "(41)954831548", "Gabi", "AV Terra roxa", "1815", "Apartamento 5",
				"Mundo novo", "Curitiba", "Parana");
		System.out.println(cli1.toString());
		System.out.println(cli2.toString());
		System.out.println(cli3.toString());
	}
}