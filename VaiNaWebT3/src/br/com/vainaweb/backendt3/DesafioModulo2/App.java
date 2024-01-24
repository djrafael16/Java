package br.com.vainaweb.backendt3.DesafioModulo2;

public class App {

	public static void main(String[] args) {
		
		Colaborador devBackEndJunior = new DevBackEnd("Felpudo", "1234-0", 10000.0);
		Colaborador devFrontEndJunior = new DevFrontEnd("Luccas", "9875-9", 10000.0);
		Colaborador designerJunior = new Designer("Klayvem", "4563-6", 12000.0);
		Colaborador techLead = new TechLeader("João Pedro Belo", "222.356.790.23", 25000.0);
		
		System.out.println("-----------Antes------------------");
		System.out.println(devBackEndJunior.visualizar());
		System.out.println("----------------------------------");
		System.out.println(devFrontEndJunior.visualizar());
		System.out.println("----------------------------------");
		System.out.println(designerJunior.visualizar());
		System.out.println("----------------------------------");
		System.out.println(techLead.visualizar());
		System.out.println();
		System.out.println("-----------Depois------------------");
		devBackEndJunior.aumentarSalario();
		devFrontEndJunior.aumentarSalario();
		designerJunior.aumentarSalario();
		techLead.aumentarSalario();
		devFrontEndJunior.aumentarSalario();
	
		
		System.out.println(devBackEndJunior.visualizar());
		System.out.println("----------------------------------");
		System.out.println(devFrontEndJunior.visualizar());
		System.out.println("----------------------------------");
		System.out.println(designerJunior.visualizar());
		System.out.println("----------------------------------");
		System.out.println(techLead.visualizar());
	}

}
