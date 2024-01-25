package br.com.vainaweb.backendt3.DesafioModulo2;



public abstract class Colaborador {

	private String nome;
	private String cpf;
	private double salario;
	private boolean isAtivo = true;
	private double fgts;
	private int tempo;
	
	// Construtores
	public Colaborador() {

	}

	public Colaborador(String nome, String cpf, double salario, int tempo) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.fgts =  salario * 0.08;
		this.tempo = tempo;
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
	
	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	// Métodos

	public String visualizar() {
		return "[Colaborador " + this.nome + ", do CPF: " + this.cpf + " ]" + "\nSalario: " + this.salario
				+"\n FGTS: " + this.fgts 
				+"\n Tempo de contrato: " + this.tempo +" meses"
				+ "\nStatus: " + (this.isAtivo? "Vinculado" : "Sem vinculo");
	}
	
	public abstract void aumentarSalario();
	
	public abstract void ferias();
	
	public void fgtsNovacontribuicao()
	{
		setFgts(getFgts() + getSalario()* 0.08);
		}  
	

    
    
    }
    
    

