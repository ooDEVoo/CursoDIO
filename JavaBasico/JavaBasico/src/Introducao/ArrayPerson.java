package Introducao;

public class ArrayPerson {

	public static void main(String[] args) {
		
		final int vetor = 5;
		Carro[] carros = new Carro[vetor];
		String[] nomeCarros = {"BMW", "Nissan", "Mercedez", "Toyota", "Crevolet"};
	
		/*
		carros[0] = new Carro("BMW");
		carros[1] = new Carro("Nissan");
		carros[2] = new Carro("Mercedez");
		carros[3] = new Carro("Toyota");
		carros[4] = new Carro("Chevrolet");
		*/
		
		
		for(int c = 0; c < carros.length; c++) {
			carros[c] = new Carro(nomeCarros[c]);
		}
		
		for(Carro c:carros) {
			c.imprimir();
			System.out.println("----------");
		}
	
	}

}
