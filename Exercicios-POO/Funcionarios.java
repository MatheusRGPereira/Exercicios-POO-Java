package ExerciciosPOO;

public class Funcionarios {

	
	//atributos
	private String nome;
	private int idade;
	private String funcao;
	private int codigofuncionario;
	
	public int getCodigofuncionario() {
		return codigofuncionario;
	}
	public void setCodigofuncionario(int codigofuncionario) {
		this.codigofuncionario = codigofuncionario;
	}
	void Entrada() {
		System.out.println(nome+" está entrando na empresa");
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	void saida() {
		System.out.println(nome+" está saindo da empresa");
		
	}
}
