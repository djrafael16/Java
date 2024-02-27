package DesafioNunbank;

public class ContaPoupança extends Conta {



	public  ContaPoupança(String nome, String cpf, int numeroconta, byte agencia, int senha, double saldo) {
		super(nome, cpf, numeroconta, agencia, senha, saldo);
		
	}

	@Override
	public String toString() {
		return "Conta [nome=" + getNome() + ", cpf=" + getCpf() + ", numeroconta=" + getNumeroconta() + ", agencia=" + getAgencia()
				+ ", senha=" + getSenha() + ", saldo=" + getSaldo();
	}

	@Override
	public void sacar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar() {
		// TODO Auto-generated method stub
		
	}
}
