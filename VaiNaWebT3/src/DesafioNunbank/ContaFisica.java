package DesafioNunbank;

public class ContaFisica extends Conta implements ContaCorrente, ContaPoupança{
	
	private String cpf;

	public ContaFisica() {
		super();
		
	}
        public ContaFisica(int conta, int agencia, int saldo, String nome, String cpf) {
		super(conta, agencia, saldo, nome);
		this.cpf = cpf;
		
		
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public void SaquePoupanca() {
		
		
	}
	@Override
	public void SaqueCorrente() {
		
		
	}

	
}
