package br.com.generation.exercicios;

import java.util.Scanner;

public class Segundo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double [] dado = new double[10];
		
		double soma = 0, media = 0, maior = 0;
		int ocorrencia = 0, controle = 0;
		
		for (int contador = 0; contador < 10; contador ++) {
							
			System.out.println("Digite o " + (contador+1) + "º valor.");
				dado[contador] = leia.nextDouble();
				
					
			if (dado[contador] < 1 || dado[contador] > 6) {
													
					controle = 1;
					
					while (controle == 1) {
						System.out.println("Digite um valor válido. Digite o: " + (contador+1) + "º valor");
							dado[contador] = leia.nextDouble();
							
							if (dado[contador] >= 1 && dado[contador] <= 6 ) {
								controle = 0;
							}
					}
			}
			
		soma = (dado[contador] + soma);
		
		if (maior < dado[contador]) {
		
			maior = dado[contador];
		}		

	}
		
	for (int contador = 0; contador < 10; contador++) {
		
		if (dado[contador] == maior) {
				
			ocorrencia = ocorrencia + 1;
		}
		
	System.out.println("O valor do dado na jogada " + (contador+1) + " é " + dado[contador]);
	
	}
	
	media = (soma/10);
	
	System.out.println("\n O maior valor digitado foi: " + maior + " e ele apareceu " + ocorrencia + " vezes.");
	System.out.println("\n A média dos valores é: " + media);
	
	leia.close();
	
	}
	
}
