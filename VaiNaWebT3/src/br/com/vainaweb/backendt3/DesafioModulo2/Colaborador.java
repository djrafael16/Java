package br.com.vainaweb.backendt3.DesafioModulo2;

import java.util.Scanner;

public abstract class Colaborador {

	private String nome;
	private String cpf;
	private double salario;
	private boolean isAtivo = true;
	
	// Construtores
	public Colaborador() {

	}

	public Colaborador(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

//	public void setCpf(String cpf) {
//		this.cpf = cpf;
//	}

	public double getSalario() {
		return salario;
	}

	protected void setSalario(double salario) {
		this.salario = salario;
	}

	public boolean isAtivo() {
		return isAtivo;
	}

	public void setAtivo(boolean isAtivo) {
		this.isAtivo = isAtivo;
	}
	
	// Métodos

	public String visualizar() {
		return "[Colaborador " + this.nome + ", do CPF: " + this.cpf + " ]" + "\nSalario: " + this.salario
				+ "\nStatus: " + (this.isAtivo? "Vinculado" : "Sem vinculo");
	}
	
	public abstract void aumentarSalario();
	public abstract void contribuiçãoInss();
	
	public void demitir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tem certeza que deseja desvincular " + this.nome);
		Character resposta = sc.next().toLowerCase().charAt(0);
		if(resposta.equals('s')) {
			System.out.println("Você está demitido, promovido a usuário");
			this.isAtivo = false;
			salario = 0.0;
		}
		
		sc.close();
	}
}
