package ExerciciosPOO;

public class Aviao {

	//atributos
	private String modelo;
	private String empresa;
	private int capacidade;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public double getHrPartida() {
		return hrPartida;
	}
	public void setHrPartida(double hrPartida) {
		this.hrPartida = hrPartida;
	}
	public double getTempoVoo() {
		return tempoVoo;
	}
	public void setTempoVoo(double tempoVoo) {
		this.tempoVoo = tempoVoo;
	}
	private double hrPartida;
	private double tempoVoo=2.15;
	
	
	void decolar() {
		System.out.println("O horario de partida do voo é: "+hrPartida);
		tempoVoo+=hrPartida;
		System.out.println("O voo tera como horario de chegada "+tempoVoo);
	}
	void pousar() {
	    System.out.println("Avião pousando as "+tempoVoo);
	}
	
}
