package Introducao;

import java.util.Scanner;

public class ArrayCompararElementos {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			String[] letras = new String[5];
			
			String letra;
			int count = 0;
			
			do {
			
			System.out.print("Digite uma letra: ");
			letra = input.next();
			
			if( ! (letra.equalsIgnoreCase("a") |
					letra.equalsIgnoreCase("e") |
					letra.equalsIgnoreCase("i") |
					letra.equalsIgnoreCase("o") |
					letra.equalsIgnoreCase("u"))) {
				letras[count] = letra;
				
			}
			
					count++;
			}while(count < letras.length);
			
			for(int c = 0; c < letras.length; c++) {
				System.out.println(letras[c]);
			}
				
				}
					
				}
			
		
		

