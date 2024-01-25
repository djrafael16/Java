package br.com.vainaweb.backendt3.DesafioModulo2;

public class Designer extends Colaborador{

	
	
	public Designer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Designer(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aumentarSalario() {
		setSalario(getSalario() * 1.20);
		
	}

}
