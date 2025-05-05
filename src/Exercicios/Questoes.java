package Exercicios;
import java.util.Random;
import java.util.Scanner;

public class Questoes {
	

	public static void main(String[] args) { 
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Exercícios Vetores (Arrays)"); 
		System.out.println(""); 
		System.out.println("Exercício 1: Soma dos Elementos"); 
		System.out.println("");
		
		int vetor[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		int somaVetores = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			somaVetores += vetor[i];
		}
		
		 System.out.println("A soma de cada número do vetor é de: " + somaVetores);
		 
		 System.out.println("------------------------------------"); 
		 System.out.println("Exercício 2: Encontrar o Maior Valor"); 	
		 System.out.println(""); 
		
		 int[] vetor2 = new int[15];

	     for (int i = 0; i < vetor.length; i++) {
	    	 System.out.print("Digite o número na posição " + (i + 1) + ": ");
	    	 vetor2[i] = teclado.nextInt();
	     }

	     int maior = vetor2[0];
	     int posicao = 0;

	     for (int i = 1; i < vetor2.length; i++) {
	    	 if (vetor2[i] > maior) {
	         maior = vetor2[i];
	         posicao = i;
	     }
	        }

	        System.out.println("Maior valor: " + maior);
	        System.out.println("Posição (índice): " + posicao);			        System.out.println("------------------------------------"); 
			System.out.println("Exercício 3: Contar Números Pares"); 	
			System.out.println("");
		
			int[] vetor3 = new int[20];
		    int contadorVetoresPares = 0;

		     
		    for (int i = 0; i < vetor3.length; i++) {
		    	System.out.print("Digite o número " + (i + 1) + ": ");
		        vetor3[i] = teclado.nextInt();

		    if (vetor3[i] % 2 == 0) {
		    	contadorVetoresPares++;
		    }
		       }

		    System.out.println("Quantidade de números pares é: " + contadorVetoresPares);
			
		    System.out.println("------------------------------------"); 
			System.out.println("Exercício 4: Vetor Invertido"); 	
			System.out.println("");
			
			int[] vetor4 = new int[8];
			
			System.out.println("Forneça 8 números inteiros. ");
			
			for(int i = 0; i < vetor4.length; i++) {
				System.out.println("Número " + (i + 1) + ": ");
				vetor4[i] = teclado.nextInt();
			}
			
			for(int i = vetor4.length - 1; i >= 0; i--) {
				System.out.println("Os vetores fornecidos em ordem reversa é: " + vetor4[i]);
			}
		
			System.out.println("------------------------------------"); 
			System.out.println("Exercício 5: Média e Acima da Média"); 	
			System.out.println("");
			
			int[] vetor5 = new int[12];
			int soma = 0;
			
			System.out.println("Digite 12 dígitos para calcular a média.");
			
			for(int i = 0; i < vetor5.length; i++) {
				System.out.println("Número " + (i + 1) + ": ");
				vetor5[i] = teclado.nextInt();
				soma =+ vetor5[i];
			}
			
			double calcMediaVetores = soma / vetor.length;
			
			System.out.println("A média dos vetores é: " + calcMediaVetores);
			
			int maiorMedia = 0;
			
			for (int i = 0; i < vetor5.length; i++) {
		           if (vetor5[i] > calcMediaVetores) {
		               maiorMedia++;
		           }
			 }
			 
			System.out.println("A quantidade de números maiores que a média é: " + maiorMedia);
			
			System.out.println("------------------------------------"); 
			System.out.println("Exercício 6: Remover Elemento"); 	
			System.out.println("");
			 
			int[] vetor6 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			int[] vetor6Removido = new int[vetor6.length - 1];
			
			System.out.println("O vetor é: ");
			for(int i = 0; i < vetor6.length; i++) {
				System.out.print(vetor6[i] + " ");
			}
			
			System.out.println("");
			System.out.print("Escolha um número para ser excluído: ");
			int vetor6Remover = teclado.nextInt();
			
			System.out.println("");
			System.out.println("O  Vetor agora é: ");
			
			for(int i = 0, j = 0; i < vetor6.length; i++) {
				if(i != vetor6Remover) {
					vetor6Removido[j] = vetor6[i];
					j++;
				}
			}
			
			for(int j = 0; j < vetor6Removido.length; j++) {
				System.out.print(vetor6Removido[j] + " ");
			}
			
			System.out.println();
			
			System.out.println("------------------------------------"); 
			System.out.println("Exercício 7: Contar Ocorrências"); 	
			System.out.println("");
			 
			int[] vetor7 = new int[15];
			Random aleatorizador = new Random();
			
			for(int i = 0; i < vetor7.length; i++ ) {
				vetor7[i] = aleatorizador.nextInt(9); 
			}
			
			System.out.print("Forneça um número entre 0 e 9 para verificar quantas vezes ele se repete no Vetor: ");
			int repetiu = teclado.nextInt();
			
			int contadorRepetiu = 0;
			
			System.out.println("O vetor é: ");
			for(int i = 0; i < vetor7.length; i++) {
				System.out.print(vetor7[i] + " ");
				if(vetor7[i] == repetiu) {
					contadorRepetiu++;
				}
			}
			
				System.out.println();
				System.out.println("O número " + repetiu + " apareceu " + contadorRepetiu + " vezes!");
			
				System.out.println();
				
				System.out.println("------------------------------------"); 
				System.out.println("Exercício 8: União de Vetores"); 	
				System.out.println("");
			 
				int[] vetorA = {1, 2, 3, 4, 5};
		        int[] vetorB = {6, 7, 8, 9, 10};
				int[] vetorC = new int[vetorA.length + vetorB.length]; 
				
				for(int i = 0; i < vetorA.length; i++) {
					vetorC[i] = vetorA[i];
				}
					
					for(int j = 0; j < vetorB.length; j++) {
						vetorC[vetorA.length + j] = vetorB[j]; 
				}
				
				System.out.println("A união dos vetores A e B ficaria assim: ");
				for(int k = 0; k < vetorC.length; k++) {
					System.out.print(vetorC[k] + " ");
				}
				System.out.println();
				
				System.out.println("------------------------------------"); 
				System.out.println("Exercício 9: Interseção entre Vetores"); 	
				System.out.println("");
		        
				int interseção = 0;
				int[] vetor8 = new int[6];
				int[] vetor9 = new int[6];
				int[] vetorInterseção = new int[vetor8.length];
				Random gerador = new Random();
				
				System.out.print("O primeiro vetor é: ");
				for(int i = 0; i < vetor8.length; i++) {
					vetor8[i] = gerador.nextInt(9);
					System.out.print(vetor8[i] + " ");
				}
				
				System.out.println();
				
				System.out.print("O segundo vetor é: ");
				for(int j = 0; j < vetor9.length; j++) {
					vetor9[j] = gerador.nextInt(9);
					System.out.print(vetor9[j] + " ");
				}
				
				System.out.println("");
				System.out.println("O vetor resultate dele(es) é:");
			    for (int q = 0; q < vetor8.length; q++) {
		            if (vetor8[q] == vetor9[q]) {
		                vetorInterseção[q] = vetor8[q];
		            } else {
		                vetorInterseção[q] = 0;
		            }
		        }

		        System.out.print("Vetor com valores iguais nas mesmas posições: ");
		        for (int w = 0; w < vetorInterseção.length; w++) {
		            System.out.print(vetorInterseção[w] + " ");
		        }
				
				for (int k = 0; k < vetor8.length; k++ ) {
					int valorVetor8 = vetor8[k];
					int valorVetor9 = vetor9[k];
					
					if(valorVetor8 == valorVetor9) {
						interseção++; 
					}
				}
					
					System.out.println();
					System.out.print("Logo, o indice se repetiu " + interseção + " vez(es)!");
					System.out.println();
					
					System.out.println("------------------------------------"); 
					System.out.println("Exercício 10: Ordenação Simples"); 	
					System.out.println("");
		
					int[] vetor10 = new int[10];
					System.out.println("Forneça 10 números para preencher um vetor de 10 indices.");
					
					for(int i = 0; i < vetor10.length; i++) {
						System.out.print("Índice " + i + " : ");
						vetor10[i] = teclado.nextInt();
					}
					System.out.println();
					
					System.out.println("O vetor fornecido foi:");
					for(int j = 0; j < vetor10.length; j++) {
						System.out.print(vetor10[j] + " ");
					}
					
					 for (int i = 0; i < vetor10.length - 1; i++) {
						 for (int j = 0; j < vetor10.length - 1 - i; j++) {
							 if (vetor10[j] > vetor10[j + 1]) {
								 int temp = vetor10[j];
				                 vetor10[j] = vetor10[j + 1];
				                 vetor10[j + 1] = temp;
				          }
				       }
				    }
					System.out.println();
					
					System.out.println("O vetor em ordem crescente então é:");
					for (int i = 0; i < vetor10.length; i++) {
					    System.out.print(vetor10[i] + " ");
					}
				
	}
}