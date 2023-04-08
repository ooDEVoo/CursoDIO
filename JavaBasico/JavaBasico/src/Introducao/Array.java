package Introducao;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] array = new int[5];
		
		array[0] = 23;
		array[1] = 55;
		array[2] = 24;
		
		
		int[] arrays = {1, 4, 89, 43, 87};
		
		System.out.println(arrays[1]);
		
		for(int c = 0; c < arrays.length; c++) {
			System.out.println(arrays[c]);
		}
		System.out.println("---------------------------------------");
		
		int vt;
		System.out.println("Digite o número vetor: ");
		vt = input.nextInt();
		
		String[] letras = new String[vt];
		
		
		String d;
		System.out.println("Digite uma letra: ");
		d = input.next();
		letras[0] = d;
		System.out.println("Letra digitada: " + letras[3]);
		
		
		for(int g = 0; g < letras.length; g++) {
			System.out.println(letras[g] );
		}
		
		// LOOPING ESPECIAL PARA PERCORRER O ARRAY
		
		for(String n : letras) {  // A variável "n" tem que ser do mesmo tipo do array
			System.out.println(n);// ela vai percorrer todo o array
		}
	
		}
		
		}
	

