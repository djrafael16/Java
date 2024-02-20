package DesafioNunbank;

public class ContaJuridica extends Conta {

	private String cnpj;

	private ContaJuridica() {
		super();
		
	}

	private ContaJuridica(int conta, int agencia, int saldo, String nome, String cnpj) {
		super(conta, agencia, saldo, nome);
		this.cnpj =cnpj;
		
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	
	
}
