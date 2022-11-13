package ExerciciosPOO;

public class MainProdutoEletronico {

	public static void main(String[] args) {
		ProdutoEletronico pe1 =new ProdutoEletronico();
		
		pe1.setNome("Celular");
		pe1.setFonteEnergia("Bateria");
		pe1.setCor("Azul");
		

		
		System.out.println("Informações sobre o aparelho eletronico");
		
		System.out.println("Tipo de eletronico: "+pe1.getNome());
		System.out.println("Fonte de energia: "+pe1.getFonteEnergia());
		System.out.println("Cor"+pe1.getCor());
		System.out.println();
	   pe1.liga();
	   System.out.println();
	   pe1.desliga();
	}

}
