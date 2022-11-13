package ExerciciosPOO;

public class MainContaBancaria {

	public static void main(String[] args) {
		ContaBancaria cb1 = new ContaBancaria();

		cb1.setNomeUsuario("Carlos");
		cb1.setNomeBanco("Nubank");
		cb1.setConta(8573829-1);
		
		System.out.println("Os dados do usuario é");
		System.out.println("");
		
		System.out.println("Nome: "+cb1.getNomeUsuario());
		System.out.println("Banco: "+cb1.getNomeBanco());
		System.out.println("Conta: " +cb1.getConta());
		System.out.println();
		
		cb1.transferencia();
		
		System.out.println();
		
		cb1.deposito();
			
	}

}
