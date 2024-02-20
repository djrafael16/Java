package DesafioNunbank;


public class Conta {

	private int conta;
	private int agencia;
	private int saldo;
    private String nome;
    
    public Conta()
    {
    	
    }
	
	public Conta(int conta, int agencia, int saldo, String nome) {
		
		this.conta = conta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
    
	
	
	
}
