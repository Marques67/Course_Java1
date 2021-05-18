package entities;

public class Client {

	private Integer numConta;
	private Integer senha;
	
	public Client(Integer numConta, Integer senha) {
		this.numConta = numConta;
		this.senha = senha;
	}

	public Integer getNumConta() {
		return numConta;
	}

	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}

	public Integer getSenha() {
		return senha;
	}

	public void setSenha(Integer senha) {
		this.senha = senha;
	}
}
