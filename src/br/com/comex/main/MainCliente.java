package br.com.comex.main;
import br.com.comex.modelo.Cliente;
//import br.com.comex.modelo.ClienteEstado;

public class MainCliente {

	public static void main(String[] args) {//id,nome,cpf,telefone,rua,numero,complemento,bairro,cidade,estado

//		Cliente cli1 = new Cliente(1, null, null, null, null, null, null, null, null, null);//id
//		Cliente cli1 = new Cliente(1, "NOMEv", null, null, null, null, null, null, null, null);//nome
//		Cliente cli1 = new Cliente(1, "NOMEv", "0123456789", null, null, null, null, null, null, null);//cpf
//		Cliente cli1 = new Cliente(1, "NOMEv", "012345678912345", null, null, null, null, null, null, null);//cpf
//		Cliente cli1 = new Cliente(1, "NOMEv", "0123456789v", null, null, null, null, null, null, null);//telefonenullpassa
//		Cliente cli1 = new Cliente(1, "NOMEv", "0123456789v", "4199890909", null, null, null, null, null, null);//telefone
//		Cliente cli1 = new Cliente(1, "NOMEv", "0123456789v", "01234567891234567", null, null, null, null, null, null);//telefone
//		Cliente cli1 = new Cliente(1, "NOMEv", "0123456789v", "0123456789123456","RUAX", null, null, null, null, null);//RUA
//		Cliente cli1 = new Cliente(1, "NOMEv", "0123456789v", "0123456789123456","RUAXV", "1", null, null, null, null);//NUMERO
//		Cliente cli1 = new Cliente(1, "NOMEv", "0123456789v", "0123456789123456","RUAXV", "12", null, "b", null, null);//bairro
//		Cliente cli1 = new Cliente(1, "NOMEv", "0123456789v", "0123456789123456","RUAXV", "12", null, "ba", "c", null);//cidade
//		Cliente cli1 = new Cliente(1, "NOMEv", "0123456789v", "0123456789123456","RUAXV", "12", null, "ba", "ci", "p");//estado
		Cliente cli1 = new Cliente(1, "NOMEv", "0123456789v", "0123456789123456","RUAXV", "12", null, "ba", "ci", "pr");//funcional
		
		System.out.println(cli1.toString());
	}
}