package Introducao;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		// Fatorial 
		// Ex: 5! = 128 = (5 x 4 x 3 x 2 x 1);
		
		Scanner input = new Scanner(System.in);
		
		
		int resultado = 1;
		int b;
		
		System.out.println("Fatorial de qual número?");
		b = input.nextInt();
		
		for(int c = b; c > 0; c--) {
			System.out.println("C: " + c);
			System.out.println(resultado);
			resultado = resultado * c;
			System.out.println(resultado);
		}
			
		} 
		}
	

