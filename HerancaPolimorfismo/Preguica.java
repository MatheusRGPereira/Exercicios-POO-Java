package HerancaPolimorfismo;

public class Preguica extends Animal {

	private String habitat;
	
	
	public String getHabitat() {
		return habitat;
	}


	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}


	void escalar() {
		
		System.out.println("esta subindo na arvore!");
	}


	@Override
	public void barulho() {
		System.out.println("está emitindo som");
	}
}
