package DesafioNunbank;

import java.util.List;




public class ContaCorrente extends Conta {
	
	
	double credito;
	

	

	public ContaCorrente(String nome, String cpf, int numeroconta, byte agencia, int senha, double saldo, double credito) {
		super(nome, cpf, numeroconta, agencia, senha, saldo);
		this.credito = credito;
		
		
	}



	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}
	
	

	@Override
	public String toString() {
		return "Conta [nome = " + getNome() 
		          + " cpf = " + getCpf() 
		          + " numeroconta = " + getNumeroconta() 
		          + " agencia = " + getAgencia()
				  + " senha = " + getSenha() 
				  + " saldo = " + getSaldo() 
				  + "credito = " + credito;
	}



	@Override
	public Conta sacar(double sacar) {
		// TODO Auto-generated method stub
		setSaldo(getSaldo()-sacar);
		return null;
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
