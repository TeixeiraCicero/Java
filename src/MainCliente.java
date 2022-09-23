
public class MainCliente {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente(123456789, "(45)988521548", "Ana", "AV Ayrtor Neves", "18845", "Sobrado 5",
				"Centro", "Foz do Iguaçu", "Parana");
		Cliente cli2 = new Cliente(987654321, "(43)981548748", "Eli", "AV Mundo Alegre", "145", "Casa", "Centro",
				"Cascavel", "Parana");
		Cliente cli3 = new Cliente(147852369, "(41)954831548", "Gabi", "AV Terra roxa", "1815", "Apartamento 5",
				"Mundo novo", "Curitiba", "Parana");

		System.out.println("o ID e " + cli1.getId() + ", o nome do Cliente e " + cli1.getNomeCompleto() + ", seu CPF e "
				+ cli1.getCpf() + ", seu numero de Celular e " + cli1.getNumeroCelular() + ", Mora no Estado "
				+ cli1.getEstado() + ", na Cidade " + cli1.getCidade() + ", no Bairro " + cli1.getBairro() + ", na Rua "
				+ cli1.getRua() + ", no Numero " + cli1.getNumeroRua() + ", e o complemento e "
				+ cli1.getComplemento());
		System.out.println("o ID e " + cli2.getId() + ", o nome do Cliente e " + cli2.getNomeCompleto() + ", seu CPF e "
				+ cli2.getCpf() + ", seu numero de Celular e " + cli2.getNumeroCelular() + ", Mora no Estado "
				+ cli2.getEstado() + ", na Cidade " + cli2.getCidade() + ", no Bairro " + cli2.getBairro() + ", na Rua "
				+ cli2.getRua() + ", no Numero " + cli2.getNumeroRua() + ", e o complemento e "
				+ cli2.getComplemento());
		System.out.println("o ID e " + cli3.getId() + ", o nome do Cliente e " + cli3.getNomeCompleto() + ", seu CPF e "
				+ cli3.getCpf() + ", seu numero de Celular e " + cli3.getNumeroCelular() + ", Mora no Estado "
				+ cli3.getEstado() + ", na Cidade " + cli3.getCidade() + ", no Bairro " + cli3.getBairro() + ", na Rua "
				+ cli3.getRua() + ", no Numero " + cli3.getNumeroRua() + ", e o complemento e "
				+ cli3.getComplemento());

	}
}