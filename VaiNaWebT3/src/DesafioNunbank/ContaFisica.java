package DesafioNunbank;

public class ContaFisica extends Conta{
	
	private String cpf;
	

	public ContaFisica() {
		super();
	}

	

	public ContaFisica(String cpf; int conta; int agencia; int saldo; String nome) {
		super(conta;);
		this.cpf = cpf;
	}



	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
}
