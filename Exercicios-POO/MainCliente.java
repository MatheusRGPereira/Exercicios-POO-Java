package ExerciciosPOO;

public class MainCliente {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		cliente1.setNome("Lucas");
		cliente1.setEndereco("Rua itamb� n� 423");
		cliente1.setCpf(924920394);
		cliente1.setBandeiraCartao("Visa");
		
		cliente2.setNome("Jorge");
		cliente2.setEndereco("Rua alura n� 227");
		cliente2.setCpf(923844244);
		cliente2.setBandeiraCartao("Maestro");
		
		

		System.out.println("Informa��es do cliente");
		System.out.println("Nome:" + cliente1.getNome());
		System.out.println("Endere�o: " + cliente1.getEndereco());
		System.out.println("Cpf: " + cliente1.getCpf());
		System.out.println("Bandeira do cart�o: " + cliente1.getBandeiraCartao());
		System.out.println();
		cliente1.procurar();
		System.out.println();
		cliente1.compra();
		System.out.println();
		
		
		System.out.println("Informa��es do cliente 2");
		System.out.println("Nome:" + cliente2.getNome());
		System.out.println("Endere�o: " + cliente2.getEndereco());
		System.out.println("Cpf: " + cliente2.getCpf());
		System.out.println("Bandeira do cart�o: " + cliente2.getBandeiraCartao());
		System.out.println();
		cliente2.procurar();
		System.out.println();
		cliente2.compra();
		System.out.println();
	}

}
