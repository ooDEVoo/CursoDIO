package Introducao;

import java.util.Random;

public class ArrayMultidimencional {

	public static void main(String[] args) {
		
	Random random = new Random();
	
	int[][]mult = new int[4][4];
	
	mult[0][0] = 12;
	
	for(int l = 0; l < mult.length; l++) {
		for(int c = 0; c < mult.length; c++)
			mult[l][c] = random.nextInt(10);
	}
	for(int[] linha : mult) {
		for(int coluna : linha) {
			System.out.print(coluna + " ");
		}
			System.out.println();
		
	}
	
	}
}
