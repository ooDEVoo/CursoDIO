package Introducao;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a;
		int opcao;
		
		do {
		System.out.println("tabuada de qual número?");
		a = input.nextInt();
		
		for(int b = 1; b < 11; b++) {
			int resultado = a * b;
			System.out.println( a + "*" + b + ":" + resultado );
		}
			System.out.println("Deseja sair? 1-sim ou 0-não ");
			opcao = input.nextInt();
			
			}while(opcao == 0);
		
		System.out.println("FIM");
	}
}
