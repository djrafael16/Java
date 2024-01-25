package br.com.vainaweb.backendt3.DesafioModulo2;

public class DevBackEnd extends Colaborador {

	public DevBackEnd() {
		super();
	}

	public DevBackEnd(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	@Override
	public void aumentarSalario() {
		setSalario(getSalario() * 1.2);
	}
	
}
