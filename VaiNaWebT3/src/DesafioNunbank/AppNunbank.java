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
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(sc.nextLine());

                switch (opcao) {
                    case 1:
                    	System.out.print("Seu nome");
                    	String nome = sc.nextLine();
                    	System.out.print("Seu CPF ");
            			String cpf = sc.nextLine();
            			System.out.print("Numero da conta");;
            			int numeroconta  = sc.nextInt();
            			System.out.print("Agencia ");
            			byte agencia =sc.nextByte();
            			System.out.print("Seua senha ");
            			int senha = sc.nextInt();
            			System.out.print("Seu deposito ");
            			double saldo = sc.nextDouble();
            			System.out.print("Seu credito e ");
            			double credito = sc.nextDouble();
            			System.out.print("");
            			
            			contas.add(new ContaCorrente(nome, cpf, numeroconta, agencia,senha, saldo, credito));
            			for(Conta conta : contas)
            				System.out.println(conta);
            			//ContaCorrente contaCorrente = new ContaCorrente(nome, cpf, numeroconta, agencia,senha, saldo, credito);
            			//criarContaCorrente(contaCorrente);
            			// confirma = true;
            			
            			
                        break;
                    case 2:
                       
                        break;
                    case 3:
                    
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
	
	


	public static Conta criarContaCorrente(Conta conta)  throws Exception {
		boolean cadastroSucesso = contas.add(conta);
		if(cadastroSucesso) {
			return conta;
		} else {
			throw new Exception("Erro ao cadastrar conta.");
		}
			
		contas.forEach(contas -> contas.
		
		
			
		
	 
	
	 
	
	
	}

}

