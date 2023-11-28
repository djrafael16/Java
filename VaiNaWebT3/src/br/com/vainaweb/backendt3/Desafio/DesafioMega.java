package br.com.vainaweb.backendt3.Desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DesafioMega {

	public static void main(String[] args) {

		List<Integer> numeroEscolhido = new ArrayList<>(); // armazena os dados em um array do tipo integer 
		List<Integer> numeroSorteado = new ArrayList<>();
		Boolean confirma = false;
		
		// enquanto o usuário não escolher 6 números coretos ele vai ficar no lup 
		do {
			confirma = false;
			try {
				cadastraNumero(numeroEscolhido);
			} catch (Exception e) {
				System.out.println("vc digitou algo errado tente de novo");
				confirma = true;
			}
		} while (confirma);
		
		System.out.println(" Os numeros sorteados foram ");
		geradorDeNumeros(numeroSorteado);
		
		// stream , percorre o array e pega apenas os números que o usuário acertou 
		List<Integer> numerosFiltrados = numeroEscolhido.stream().filter(x -> numeroSorteado.contains(x))
				.collect(Collectors.toList());
			
		    System.out.println("Você acertou " + numerosFiltrados);
		    int quant = numerosFiltrados.size();
		    ;
		    if(quant == 6) {
		    System.out.println("Voce acertou:"+ quant + " Prabens você e milionário");
		    	
		    }else if(quant == 5) {
		    	System.out.println("Voce acertou:"+ quant + " Prabens você você pode comprar um apartamento");
		    	
		    }else if(quant == 4) {
		    	System.out.println("Voce acertou:" + quant + " Prabens você e está rico");
		    }else System.out.println("Voce acertou:" + quant + " Mais sorte na proxima");
		    
	}

	public static List<Integer> geradorDeNumeros(List<Integer> list) {

		Random random = new Random();

		while (list.size() < 6) {
			int numAleatorio = random.nextInt(100) + 1; 

			// Verifica se o número já foi sorteado
			if (!list.contains(numAleatorio)) {
				System.out.println(numAleatorio);
				list.add(numAleatorio);
			}
		}
		return list;
	}

	// método pra salvar os numeros escolhidos pelo usúario e testar são validos 
	public static List<Integer> cadastraNumero(List<Integer> list) throws Exception { // qual quer exception gerada no método e tratada por quem chama ela 

		Scanner sc = new Scanner(System.in);
		Boolean correto;

		for (int x = 0; x <= 6; x++) {

			do {
				correto = false;
				System.out.println("escolha um número de 0 a 100");
				int escolha = sc.nextInt();
				
				//não permite que o numero seja maio que 100 e nem menor que 0 
				if (escolha >= 0 && escolha <= 100) {
					
				  // não permite numeros duplicados 
					if (!list.contains(escolha)) {
						list.add(escolha);
					} else {
						correto = true;
						System.out.println("Você digitou duas dezes o mesmo número , tente novamente");
					}
				} else {
					correto = true;
					System.out.println("Você digitou um número maior ou menor do que o esperado , tente novamente");
				}
			} while (correto);
		}

		sc.close();

		return list;
	}
	
}
