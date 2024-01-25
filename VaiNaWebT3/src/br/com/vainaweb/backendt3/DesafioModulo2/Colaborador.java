package br.com.vainaweb.backendt3.DesafioModulo2;

import java.util.Scanner;

public abstract class Colaborador {

	private String nome;
	private String cpf;
	private double salario;
	private boolean isAtivo = true;
	private double fgts;
	
	// Construtores
	public Colaborador() {

	}

	public Colaborador(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.fgts =  salario * 0.08;
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
	
	public double getFgts() {
		return fgts;
	}
	

	protected void setSalario(double salario) {
		this.salario = salario;
		}	
	
	public void setFgts(double fgts) {
		this.fgts = fgts;
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
				+"\n FGTS: " + this.fgts
				+ "\nStatus: " + (this.isAtivo? "Vinculado" : "Sem vinculo");
	}
	
	public abstract void aumentarSalario();
	
	public void fgtsNovacontribuicao()
	{
		setFgts(getFgts() + getSalario()* 0.08);
		}

	}

