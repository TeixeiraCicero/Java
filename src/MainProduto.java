
public class MainProduto {

	public static void main(String[] args) {
		Produto prod1 = new Produto();
		Produto prod2 = new Produto();
		Produto prod3 = new Produto();
		Produto prod4 = new ProdutoIsento();

		prod1.setCategoria("INFORMATICA");
		prod1.setDescricao("TELA 15.6', 256 GB SSD");
		//prod1.setId(1);
		prod1.setNomeProduto("Notebook Samsung");
		prod1.setPrecoUnitario(3523.00);
		prod1.setQtdEstoque(1);

		prod2.setCategoria("LIVROS");
		prod2.setDescricao("849 PAGINAS, CAPA DURA");
		//prod2.setId(2);
		prod2.setNomeProduto("Clean Architecture");
		prod2.setPrecoUnitario(102.90);
		prod2.setQtdEstoque(2);

		prod3.setCategoria("INFORMATICA");
		prod3.setDescricao("CURVO");
		//prod3.setId(3);
		prod3.setNomeProduto("Monitor Dell 27");
		prod3.setPrecoUnitario(1889.00);
		prod3.setQtdEstoque(3);
		
		prod4.setCategoria("LIVROS");
		prod4.setDescricao("849 PAGINAS, CAPA DURA");
		//prod4.setId(2);
		prod4.setNomeProduto("Clean Architecture");
		prod4.setPrecoUnitario(102.90);
		prod4.setQtdEstoque(2);

//		System.out.println("o ID do produto é: "+
//				prod1.getId()+", sua Categoria é: "+prod1.getCategoria()+
//				", o Nome do Produto é: "+prod1.getNomeProduto()+
//				", a descrição do Produto é: "+
//				prod1.getDescricao()+", cada Unidade Custa: R$"+prod1.getPrecoUnitario()
//				+", atualmente temos em Estoque: "+prod1.getQtdEstoque()
//				+" unidade(s) do produto, Seus impostos são de: R$"+
//				prod1.calculaImposto()+" por unidade, e o valor total de todos os "
//				+prod1.getNomeProduto()+" em estoque é de: R$"+prod1.calculaValorTotalEmEstoque());
		
		System.out.println("o ID do produto é: "+
				prod2.getId()+", sua Categoria é: "+prod2.getCategoria()+
				", o Nome do Produto é: "+prod2.getNomeProduto()+
				", a descrição do Produto é: "+
				prod2.getDescricao()+", cada Unidade Custa: R$"+prod2.getPrecoUnitario()
				+", atualmente temos em Estoque: "+prod2.getQtdEstoque()
				+" unidade(s) do produto, Seus impostos são de: R$"+
				prod2.calculaImposto()+" por unidade, e o valor total de todos os "
				+prod2.getNomeProduto()+" em estoque é de: R$"+prod2.calculaValorTotalEmEstoque());
		
//		System.out.println("o ID do produto é: "+
//				prod3.getId()+", sua Categoria é: "+prod3.getCategoria()+
//				", o Nome do Produto é: "+prod3.getNomeProduto()+
//				", a descrição do Produto é: "+
//				prod3.getDescricao()+", cada Unidade Custa: R$"+prod3.getPrecoUnitario()
//				+", atualmente temos em Estoque: "+prod3.getQtdEstoque()
//				+" unidade(s) do produto, Seus impostos são de: R$"+
//				prod3.calculaImposto()+" por unidade, e o valor total de todos os "
//				+prod3.getNomeProduto()+" em estoque é de: R$"+prod3.calculaValorTotalEmEstoque());
		
		System.out.println("o ID do produto é: "+
				prod4.getId()+", sua Categoria é: "+prod4.getCategoria()+
				", o Nome do Produto é: "+prod4.getNomeProduto()+
				", a descrição do Produto é: "+
				prod4.getDescricao()+", cada Unidade Custa: R$"+prod4.getPrecoUnitario()
				+", atualmente temos em Estoque: "+prod4.getQtdEstoque()
				+" unidade(s) do produto, Seus impostos são de: R$"+
				prod4.calculaImposto()+" por unidade, e o valor total de todos os "
				+prod4.getNomeProduto()+" em estoque é de: R$"+prod4.calculaValorTotalEmEstoque());
	}
}
