package ExerciciosPOO;

public class Paciente {

	
	private String nome;
	private int idade;
	private String tratamento;
	
	
	void tomarRemedio() {
		System.out.println(nome+ " est� se medicando conforme a recomenda��o medica");
		
	}
	void altaMedica() {
		System.out.println(nome+ " est� recebendo alta medica");
		
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
	public String getTratamento() {
		return tratamento;
	}
	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}
}
