package ExerciciosPOO;

public class MainPaciente {
	public static void main(String[] args) {

		Paciente pa1 = new Paciente();
		
		pa1.setNome("Julia");
		pa1.setIdade(35);
		pa1.setTratamento("Dentario");
		
		System.out.println("Informações do /a paciente");
		System.out.println("Nome:" + pa1.getNome());
		System.out.println("Idade: "+ pa1.getIdade());
		System.out.println("Tipo de tratamento: "+pa1.getTratamento());
		
		System.out.println();
		pa1.tomarRemedio();
		System.out.println();
		pa1.altaMedica();
		
		
	}

}
