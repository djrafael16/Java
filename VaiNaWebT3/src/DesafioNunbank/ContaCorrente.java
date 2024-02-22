package DesafioNunbank;

public  class ContaCorrente extends Conta implements Operações {
	
	double saque;
	double credito;
	
	
	public ContaCorrente() {
		super();
		
	}
	public ContaCorrente(int conta, int agencia, double saldo, String nome, String cpf, int senha, double saque, double credito) {
		super(conta, agencia, saldo, nome, cpf, senha);
		this.saque = saque;
		this.credito = credito;
		
	}
	public double getSaque() {
		return saque;
	}
	public void setSaque(double saque) {
		this.saque = saque;
	}
	public double getCredito() {
		return credito;
	}
	public void setCredito(double credito) {
		this.credito = credito;
	}
	
	
	public String toString() {
		return "Conta [conta=" + getConta() + ", agencia=" + getAgencia() + ", saldo=" + getSaldo() + ", nome=" + getNome() + ", cpf=" + getCpf()
				+ ", senha=" + getSenha() + "]";
	}

	
	
	public void sacar(double saque) {
		setSaldo(getSaldo() - saque);
		 System.out.println("Seu saque foi de: " + saque);
		 System.out.println("Seu saldo atual e:" + getSaldo());
		
	}

	
	
	

}
