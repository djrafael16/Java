package DesafioNunbank;

public class Conta {
	
	private String nome;
	private String cpf;
	private int numeroconta;
	private byte agencia;
	private int senha;
	private double saldo;
	
	
	public Conta ()
	{
		
	}
	
	public  Conta(String nome, String cpf, int numeroconta, byte agencia, int senha, double saldo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.numeroconta = numeroconta;
		this.agencia = agencia;
		this.senha = senha;
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

	public int getNumeroconta() {
		return numeroconta;
	}

	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}

	public byte getAgencia() {
		return agencia;
	}

	public void setAgencia(byte agencia) {
		this.agencia = agencia;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", cpf=" + cpf + ", numeroconta=" + numeroconta + ", agencia=" + agencia
				+ ", senha=" + senha + ", saldo=" + saldo + "]";
	}
	
	

}
