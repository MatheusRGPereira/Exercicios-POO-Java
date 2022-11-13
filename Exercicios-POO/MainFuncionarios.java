package ExerciciosPOO;

public class MainFuncionarios {

	public static void main(String[] args) {
		
		Funcionarios f1 =new Funcionarios();
		
		f1.setNome("Joaquim");
		f1.setIdade(32);
		f1.setFuncao("Dev -- Java");
		f1.setCodigofuncionario(58322);
		
		
		System.out.println("As informações do funcionario é ");
		System.out.println();
		System.out.println("Nome: "+f1.getNome());
		System.out.println("Idade: "+f1.getIdade());
		System.out.println("Função: "+f1.getFuncao());
		System.out.println("Codigo: "+f1.getCodigofuncionario());
		
		System.out.println();
		f1.Entrada();
		System.out.println();
		f1.saida();
		
		
	}

}
