package DesafioNunbank;

public class ContaPoupanca extends Conta implements Operações {
	

	public  ContaPoupanca() {
		super();
		
	}
	public ContaPoupanca(int conta, int agencia, double saldo, String nome, String cpf, int senha) {
		super(conta, agencia, saldo, nome, cpf, senha);
			
		
		
	}

	public String toString() {
		return "Conta [conta=" + getConta() + ", agencia=" + getAgencia() + ", saldo=" + getSaldo() + ", nome=" + getNome() + ", cpf=" + getCpf()
				+ ", senha=" + getSenha() + "]";
	}
	@Override
	public void sacar(double saque) {
		setSaldo(getSaldo() - (saque*1.02));
		 System.out.println("Seu saque acresido de 2% foi: " + saque*1.02);
		 System.out.println("Seu novo saldo e: " + getSaldo());
		
	}
	
     
}
