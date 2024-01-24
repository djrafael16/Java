package br.com.vainaweb.backendt3.DesafioModulo2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Colaborador devBackEndJunior = new DevBackEnd("Felpudo", "1234-0", 10000.0);
		Colaborador devFrontEndJunior = new DevFrontEnd("Luccas", "9875-9", 10000.0);
		Colaborador designerJunior = new Designer("Klayvem", "4563-6", 12000.0);
		Colaborador techLead = new TechLeader("João Pedro Belo", "222.356.790.23", 25000.0);
		 
		  try (Scanner op = new Scanner(System.in)) {
			System.out.println("Escolha uma opçao \n"
			  		+ "1 - Visualizar Funcionarios\n"
			  		+ "2 - Visualiar Funcionario com aumento\n"
			  		+ "3 - Contribuição INSS\n"
			  		+ "4 - Saldo do FGTS \n"
			  		+ "5 - Demitir ");
			  int n = op.nextInt();
			  
			  switch(n) {
			   
			  case 1:
				  System.out.println("-----------Antes------------------");
					System.out.println(devBackEndJunior.visualizar());
					System.out.println("----------------------------------");
					System.out.println(devFrontEndJunior.visualizar());
					System.out.println("----------------------------------");
					System.out.println(designerJunior.visualizar());
					System.out.println("----------------------------------");
					System.out.println(techLead.visualizar());
					System.out.println();
					
					break;
					
			  case 2: 		
				    
					System.out.println("-----------Depois------------------");
					System.out.println(devBackEndJunior.visualizar());
					System.out.println("----------------------------------");
					System.out.println(devFrontEndJunior.visualizar());
					System.out.println("----------------------------------");
					System.out.println(designerJunior.visualizar());
					System.out.println("----------------------------------");
					System.out.println(techLead.visualizar());
					 devBackEndJunior.aumentarSalario();
					 devFrontEndJunior.aumentarSalario();
					 designerJunior.aumentarSalario();
					 techLead.aumentarSalario();
				     devFrontEndJunior.aumentarSalario();
					break;
				
			  case 3:
				  break;
				  
			  default:
			   System.out.println(" Você fechou sua analise ");  
			  
			  }
		}	
	
	}

}
