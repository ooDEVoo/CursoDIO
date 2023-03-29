package Introducao;

public class Testes {

	public static void main(String[] args) {
		
		
		
		SmartTV Tv = new SmartTV();
		
		System.out.println(Tv.getLigaDesliga());
		System.out.println(Tv.getVolume());
		System.out.println(Tv.getCanal());
		
		Tv.mudarCanal(25);
		System.out.println(Tv.getCanal());
		Tv.setCanal(45);
		System.out.println(Tv.getCanal());
		
		Tv.aumentarVolume();
		System.out.println(Tv.getVolume());
		
		Tv.mudarVolume(14);
		System.out.println(Tv.getVolume());
		
		
		
	}
}
