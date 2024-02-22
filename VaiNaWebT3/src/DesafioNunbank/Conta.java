package DesafioNunbank;


public class Conta {

	private int conta;
	private int agencia;
	private double saldo;
    private String nome;
    private String cpf;
    private int senha;
    
    public Conta()
    {
    	
    }
	
	public Conta(int conta, int agencia, double saldo, String nome, String cpf, int senha) {
		this.conta = conta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		
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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	
	
}
