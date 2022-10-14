package br.com.comex.csv;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeitorPedidosCsv {
	public List<PedidoCsv> leCsv() throws FileNotFoundException {
		List<PedidoCsv> pedidos = new ArrayList<PedidoCsv>();

		InputStream input = new FileInputStream("pedidos.csv");
		Scanner scan = new Scanner(input);

		scan.nextLine();

		while (scan.hasNextLine()) {
			String linha = scan.nextLine();
			String[] valores = linha.split(",");
			// CATEGORIA,PRODUTO,PRECO,QUANTIDADE,DATA,CLIENTE
			String categoria = valores[0];
			String produto = valores[1];
			String preco = valores[2];
			String quantidade = valores[3];
			String data = valores[4];
			String cliente = valores[5];

			PedidoCsv pedido = new PedidoCsv(categoria, produto, preco, quantidade, data, cliente);

			pedidos.add(pedido);
		}
		return pedidos;
	}
}
