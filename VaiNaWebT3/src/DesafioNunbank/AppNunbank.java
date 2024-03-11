package DesafioNunbank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppNunbank {

	static List<Conta> contas = new ArrayList<Conta>();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		
		int opcao;
		boolean confirma = false;
		do {
            System.out.println("\nMenu:");
            System.out.println("1. Criar Conta Corrente");
            System.out.println("2. Criar Conta Poupança");
            System.out.println("3. Editar Conta");
            System.out.println("4. Buscar Conta pelo número");
            System.out.println("5. Excluir conta");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(sc.nextLine());

                switch (opcao) {
                    case 1:
                    	System.out.print("Seu nome");
                    	String nome = sc.nextLine();
                    	System.out.print("Seu CPF ");
            			String cpf = sc.nextLine();
            			System.out.print("Digite os 6 primeiros digitos do seu CPF");
            			int numeroconta  = sc.nextInt();
            			byte agencia = 00001;
            			System.out.print("Seua senha de 6 digitos ");
            			int senha = sc.nextInt();
            			System.out.print("Seu deposito ");
            			double saldo = sc.nextDouble();
            			double credito = saldo*0.05;
            			System.out.print("Seu credito e ");
            			System.out.print("");
            			
            			contas.add(new ContaCorrente(nome, cpf, numeroconta, agencia,senha, saldo, credito));
            			System.out.println("conta criada");
            			
            			//ContaCorrente contaCorrente = new ContaCorrente(nome, cpf, numeroconta, agencia,senha, saldo, credito);
            			//criarContaCorrente(contaCorrente);
            			confirma = true;
            			
            			
                        break;
                    case 2:
                    	System.out.print("Seu nome");
                    	String nomepop = sc.nextLine();
                    	System.out.print("Seu CPF ");
            			String cpfpop = sc.nextLine();
            			System.out.print("Digite os 6 primeiros digitos do seu CPF");
            			int numerocontapop  = sc.nextInt();
            			byte agenciapop = 00001;
            			System.out.print("Seua senha de 6 digitos ");
            			int senhapop = sc.nextInt();
            			System.out.print("Seu deposito ");
            			double saldopop = sc.nextDouble();
            			System.out.print("");
            			
            			contas.add(new ContaPoupança(nomepop, cpfpop, numerocontapop, agenciapop,senhapop, saldopop));
            			System.out.println("conta criada");
            			
            			confirma = true;
                        break;
                    case 3:
                    	 for (Conta conta : contas)
                      	   System.out.println(conta);
                             confirma = true;
                        break;
                    case 4:
                    	
                        break;    
                    case 5:
                    	
                        break;    
                    case 6:
                        System.out.println("Obrigado por usar os nossos serviços.");
                        confirma = true;
                        return;
                    default:
                        System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido!");
            }
        } while (confirma);

	
		}
	
	


	
	
	}



