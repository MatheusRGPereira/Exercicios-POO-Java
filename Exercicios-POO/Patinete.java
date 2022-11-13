package ExerciciosPOO;

public class Patinete {

	private String marca;
	private String Nome;
	private int ano;
	private String cor;
	
	
	void andar(){
		System.out.println("O patinete esta se movimentando");
		
	}
	void parar() {
		System.out.println("O patinete está freando");
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
}
