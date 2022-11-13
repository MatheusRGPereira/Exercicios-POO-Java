package ExerciciosPOO;

public class ContaBancaria {
	
	private String nomeUsuario;
	private String nomeBanco;
	private int conta;
 
	
	void transferencia() {
		System.out.println(nomeUsuario+" está fazendo uma transferencia");
	}
	void deposito() {
		System.out.println(nomeUsuario+" está fazendo um deposito");		
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getNomeBanco() {
		return nomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	
}
