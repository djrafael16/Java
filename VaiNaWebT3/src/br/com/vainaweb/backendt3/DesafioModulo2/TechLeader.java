package br.com.vainaweb.backendt3.classeabstrata;

public class TechLeader extends Colaborador {

	
	public TechLeader() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TechLeader(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aumentarSalario() {
		setSalario(getSalario() * 1.8);
	}
}
