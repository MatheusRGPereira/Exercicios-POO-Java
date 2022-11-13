package HerancaPolimorfismo;

public class Cachorro extends Animal {
	
	private String porte;


	void correr() {
		System.out.println("está correndo!");
	}
	
	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	@Override
	public void barulho() {
	 System.out.println("está latindo");
	}
	

}
