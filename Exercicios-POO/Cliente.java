package ExerciciosPOO;

public class Cliente {

	//atributos
	private String nome;
	private String endereco;
	private String bandeiraCartao;
	private int cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBandeiraCartao() {
		return bandeiraCartao;
	}
	public void setBandeiraCartao(String bandeiraCartao) {
		this.bandeiraCartao = bandeiraCartao;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	void compra() {
		System.out.println("O "+nome+ " est� finalizando a sua compra!");
		if (bandeiraCartao == "Visa" || bandeiraCartao == "Mastercard") {
		System.out.println(nome+ " ter� um desconto de 10% no cartao");
		}else {
			System.out.println(nome+" n�o ter� um desconto nessa compra");
		}
		
	}
	void procurar( ) {
		System.out.println("O "+nome+ " est� procurando a sua pe�a de roupa ideal");
		
		
	}
}
