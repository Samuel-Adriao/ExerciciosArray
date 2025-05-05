package Exercicios;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) { 
		Scanner porta = new Scanner(System.in);
		
		System.out.println("ATIVIDADE: Escreva um programa em Java que leia uma matriz de mxn de números inteiros"
				+ " a partir da entrada do usuário e, em seguida, imprima a matriz transposta.");
		System.out.println();
	
		System.out.print("Informe a quantidade de linhas da Matriz: ");
		int m = porta.nextInt();
		
		System.out.print("Informe a quantidade de colunas da Matriz: ");
		int n = porta.nextInt();
		
		int[][] MatrizOriginal = new int[m][n];
		
		for(int i = 0; i < m ; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("Informe o valor da linha " + (i + 1) + " e coluna " + (j + 1) + " : ");
				MatrizOriginal[i][j] = porta.nextInt();
			}
		}

		System.out.println();
		System.out.println("A sua Matriz ficou assim:");
		System.out.println();
		
		for(int i = 0; i < m ; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(MatrizOriginal[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Já a sua Matriz transposta ficou assim:");
		System.out.println();
		
		for(int j = 0; j < n; j++) {
			for(int i = 0; i < m; i++) {
				System.out.print(MatrizOriginal[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();	
		
		System.out.println("Atividade: Verificar assentos em um cinema 10x12 consecutivos utilizando matriz em Java.");
		System.out.println();
		
		int[][] assentos = {
	//	              COLUNAS
	//	 0	1  2  3  4  5  6  7  8  9 10 11
		{1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0}, //0
		{1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0}, //1
		{0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, //2
		{0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0}, //3
		{0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1}, //4
		{0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0}, //5          FILEIRAS
		{0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0}, //6
		{0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0}, //7
		{0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1}, //8
		{1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}, //9
	};
		
	int contador = 0;
	int pare = 0;
	
	System.out.print("Informe quantos individuos deseja reservar assentos um ao lado do outro: ");
	int reserva = porta.nextInt();
	
	for(int i = 0; i < assentos.length; i++ ) {
		for(int j = 0; j < assentos[0].length; j++) {
			
			if(pare == -1) {
				break;
			}
			
			if(assentos[i][j] == 0) {
				contador++;
			}
			
			if(contador == reserva) {
				int assentoVago = assentos[i][j];
				pare = -1;
				System.out.println("O seu assento está na fileira " + i + " coluna " + ( j - ( reserva - 1)) );
			}
			
			if(assentos[i][j] == 1) {
				contador = 0;
			}
		}
	}
	
	if(contador < reserva) {
		System.out.println();
		System.out.println("------------------------------------------");
		System.out.println("                :(                        ");
		System.out.println("Desculpe, não temos assentos o suficiente.");
		System.out.println("------------------------------------------");
	}
	
	
	
	
	porta.close();
	}
}
