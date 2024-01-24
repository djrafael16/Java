package br.com.vainaweb.backendt3.DesafioModulo2;

public class DevFrontEnd extends Colaborador {

	
	
	
	public DevFrontEnd() {
		super();
	}

	public DevFrontEnd(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	@Override
	public void aumentarSalario() {
		setSalario(getSalario() * 1.2);
	}

}
