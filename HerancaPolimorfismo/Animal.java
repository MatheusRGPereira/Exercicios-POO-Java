package HerancaPolimorfismo;

public abstract class Animal {

	private String nome;
	private int idade;
	private String Familia;
	private String raca;
	
	
	
	public abstract void barulho();
	
	
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
	public String getFamilia() {
		return Familia;
	}
	public void setFamilia(String familia) {
		Familia = familia;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
}
