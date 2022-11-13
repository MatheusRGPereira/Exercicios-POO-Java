package ExerciciosPOO;

public class MainPatinete {
	public static void main(String[] args) {

		Patinete p1 = new Patinete();

		p1.setNome("etrip");
		p1.setMarca("Segway");
		p1.setCor("Azul");
		p1.setAno(2022);

		System.out.println("As informações do patinete são:");
		System.out.println();
		System.out.println("Nome: " + p1.getAno());
		System.out.println("Marca: " + p1.getMarca());
		System.out.println("Cor: " + p1.getCor());
		System.out.println("Ano:"+p1.getAno());
		
		System.out.println();
		p1.andar();
		System.out.println();
		p1.parar();
	}

}
