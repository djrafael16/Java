package br.com.vainaweb.backendt3.DesafioModulo2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Colaborador devBackEndJunior = new DevBackEnd("Felpudo", "1234-0", 10000.0, 13, " Java", " O+");
		Colaborador devFrontEndJunior = new DevFrontEnd("Luccas", "9875-9", 10000.0, 24, " CSS", " O-");
		Colaborador designerJunior = new Designer("Klayvem", "4563-6", 12000.0, 28, " Blender", " AB");
		Colaborador techLead = new TechLeader("João Pedro Belo", "222.356.790.23", 25000.0, 6, " Java - CSS", " AB");
		 
		    Scanner op = new Scanner(System.in);
			System.out.println("Escolha uma opçao \n"
			  		+ "1 - Visualizar Funcionarios\n"
			  		+ "2 - Visualiar Funcionario com aumento\n"
			  		+ "3 - Habilitado para Ferias\n");
			
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
				    
				     devBackEndJunior.aumentarSalario();
					 devFrontEndJunior.aumentarSalario();
					 designerJunior.aumentarSalario();
					 techLead.aumentarSalario();
				     devFrontEndJunior.aumentarSalario();
				     
				     devBackEndJunior.fgtsNovacontribuicao();
				     devFrontEndJunior.fgtsNovacontribuicao();
					 designerJunior.fgtsNovacontribuicao();
					 techLead.fgtsNovacontribuicao();
				     devFrontEndJunior.fgtsNovacontribuicao();
				     
					System.out.println("-----------Depois------------------");
					System.out.println(devBackEndJunior.visualizar());
					System.out.println("----------------------------------");
					System.out.println(devFrontEndJunior.visualizar());
					System.out.println("----------------------------------");
					System.out.println(designerJunior.visualizar());
					System.out.println("----------------------------------");
					System.out.println(techLead.visualizar());
					
					break;
				
			  case 3:
				  
				     System.out.println("Escolha o colaboador\n"
				    		 + "1 - DevBackJuniro\n"
				    		 + "2 - DesignerJunior\n"
				    		 + "3 - TechLead\n"
				    		 + "4 - DevFrontEndJunior\n");
				    
				     Scanner escolha = new Scanner(System.in);
				     int es = escolha.nextInt();
				     
				     if(es == 1) {
				    	 devBackEndJunior.ferias(); 
				    	    }
				     if(es == 2) {
				    	 designerJunior.ferias(); 
				    	    }
				     if(es == 3) {
				    	 techLead.ferias();
				    	    }
				    
				     if(es == 4) {
				    	 devFrontEndJunior.ferias();
				     }
				     if(es != 1 && es != 2 && es !=3 && es !=4)
				     {
				    	 System.out.println(" Você digitou algo errado");
				     }
				    	 
					 break; 
					 
					 
			  default:
			   System.out.println(" Você digitou algo errado");  
			  
			  }
		}	

	}


