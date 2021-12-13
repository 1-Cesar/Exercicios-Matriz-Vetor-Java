package br.com.generation.exercicios;

import java.util.Scanner;

public class Primeiro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double [] valores = new double [5];
		double maior = 0;
		
		System.out.println("Digite 5 valores: ");
		
		for (int i=0; i < valores.length; i++) {
			
			valores[i] = leia.nextDouble();
			
			if (maior < valores[i]) {
				
				maior = valores[i];
				
			}
							
		}
		
		System.out.print("\n Valores do Vetor: |");
		
		for (int i=0; i<valores.length;i++) {
			
			System.out.print(valores[i] + "|");
			
		}
		
		System.out.println("\n O maior valor foi: " + maior);
		
		leia.close();		
		
	}

}
