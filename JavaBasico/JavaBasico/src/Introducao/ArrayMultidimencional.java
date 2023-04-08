package Introducao;

import java.util.Random;

public class ArrayMultidimencional {

	public static void main(String[] args) {
		
	
	
	Random random = new Random();
	
	int numeros = random.nextInt(10);
	
	int[][]mult = new int[numeros][numeros];
	
	
	
	for(int l = 0; l < mult.length; l++) {
		for(int c =0; c < mult.length; c++)
		System.out.println(mult[l][c]);
	}
	
	
	}
}
