package br.com.generation.exercicios;

import java.util.Scanner;

public class Terceiro_A {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double [][] N1 = new double [4][6];
		double [][] N2 = new double [4][6];
		double [][] M1 = new double [4][6];
				
		for (int l = 0; l < 4; l++) {
			
			for (int c = 0; c < 6; c++) {
				
				System.out.println("Digite valor para matriz N1 linha: " + (l+1) + " e coluna " + (c+1));
				
					N1[l][c] = leia.nextDouble();					
			}
		}
		
		for (int l = 0; l < 4; l++) {
			
			for (int c = 0; c < 6; c++) {
				
				System.out.println("Digite valor para matriz N2 linha: " + (l+1) + " e coluna " + (c+1));
				
					N2[l][c] = leia.nextDouble();					
			}
		}
		
	System.out.println("\n Matriz M1 (Soma de N1 com N2) \n");
	
	for (int l = 0; l < 4; l++) {
		
		for (int c = 0; c < 6; c++) {
			
			M1[l][c] = N1[l][c] + N2[l][c];
			
			System.out.print(M1[l][c] + " | ");
		}
		System.out.println("\n");
	}
	
	leia.close();
	}

}
