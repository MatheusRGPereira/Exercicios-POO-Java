package ExerciciosPOO;

public class MainAviao {

	public static void main(String[] args) {
		Aviao voo1 = new Aviao();

		voo1.setModelo("Boing 787");
		voo1.setEmpresa("Gol");
		voo1.setCapacidade(280);
		voo1.setHrPartida(14.15);

		System.out.println("Informações do voo");
		System.out.println("Modelo: " + voo1.getModelo());
		System.out.println("Empresa: " + voo1.getEmpresa());
		System.out.println("Capacidade de pessoas: " + voo1.getCapacidade());
		System.out.println("Horario de partida: " + voo1.getHrPartida());

		System.out.println();

		voo1.decolar();

		System.out.println();

		voo1.pousar();

	}

}
