package Introducao;

// Exempolo de Array com números aleatórios
// uma impressão de array e outro com os numeros sucessores

import java.util.Random;

public class ArrayNumerosAleatorios {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] numerosAleatorios = new int[20];
		
		for(int i = 0; i < numerosAleatorios.length; i++) {
			int numeros = random.nextInt(100);
			
			numerosAleatorios[i] = numeros;
			System.out.print(numerosAleatorios[i] + " ");
		}	
			System.out.println("\n");
		
		// imprimindo os sucessores
		for(int numeros : numerosAleatorios) {
			System.out.print(numeros + 1 + " ");
			}
			
		}
		
	}

