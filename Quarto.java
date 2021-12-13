package br.com.generation.exercicios;

import java.util.Scanner;

public class Quarto {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double [][] matriz = new double [3][3];
		double soma = 0, diagonal = 0;
		
		for (int l = 0; l < 3; l++) {
		
			for (int c = 0; c < 3; c++) {
				
				System.out.println("Digite o valor para matrix 3x3 - linha: " + (l+1) + " coluna: " + (c+1));
				
					matriz[l][c] = leia.nextDouble();
					
				}
		}
		
		for (int l = 0; l < 3; l++) {
			
			for (int c = 0; c < 3; c++) {
				
				soma = soma + matriz[l][c];
					
				}
		}
		
		System.out.println("A soma dos valores inseridos corresponde à: " + soma);
		diagonal = matriz[0][0] + matriz[1][1] + matriz[2][2];
		System.out.println("A soma dos valores da diagonal corresponde à: " + diagonal);
		
		leia.close();
}
	
}
