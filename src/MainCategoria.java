
public class MainCategoria {

	public static void main(String[] args) {

		Categoria cat1 = new Categoria();
		Categoria cat2 = new Categoria();
		Categoria cat3 = new Categoria();

		//cat1.setId(1);
		cat1.setNome("INFORMATICA");
		cat1.setStatus(StatusCategoria.ATIVA);

		//cat2.setId(2);
		cat2.setNome("MOVEIS");
		cat2.setStatus(StatusCategoria.INATIVA);
		
		//cat3.setId(3);
		cat3.setNome("LIVROS");
		cat3.setStatus(StatusCategoria.ATIVA);
		
		System.out.println("Categoria " + cat1.getNome() + " ( " + cat1.getId() + " - " + cat1.getStatus()+" ). ");
		System.out.println("Categoria " + cat2.getNome() + " ( " + cat2.getId() + " - " + cat2.getStatus()+" ). ");
		System.out.println("Categoria " + cat3.getNome() + " ( " + cat3.getId() + " - " + cat3.getStatus()+" ). ");
	}

}
