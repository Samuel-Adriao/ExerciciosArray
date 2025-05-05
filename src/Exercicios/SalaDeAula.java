package Exercicios;
import java.util.Scanner;

public class SalaDeAula {
	public static void main(String[] args) {
	
	Scanner entradaDados = new Scanner(System.in);
	
	int[][] matriz = new int[3][4];
	
	System.out.println("Forneça 9 números para preencher uma matriz 3x3!");
	
	for(int i = 0; i < matriz.length; i++) {
		for(int j = 0; j < matriz[0].length; j++) {
			System.out.println("Número equivalente a linha: " + (i + 1) + " e coluna: " + (j + 1) );
			matriz[i][j] = entradaDados.nextInt();
		}
	}
	
	
	System.out.println("Sua Matriz ficou assim:");
	
	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[0].length; j++) {
	        System.out.print(matriz[i][j] + " "); 
	    }
	    System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
