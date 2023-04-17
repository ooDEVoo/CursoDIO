package EstruturaDeDados;

public class Main {

	public static void main(String[] args) {
		
		MeuObj objA = new MeuObj(1);
		MeuObj objB = objA;
		
		System.out.println("objA: " + objA);
		System.out.println("objB: " + objB);

		System.out.println("Num objA: " + objA.getNum());
		System.out.println("Num objB: " + objB.getNum());
		
		objA.setNum(2);
		System.out.println("Num objA: " + objA.getNum());
		System.out.println("Num objB: " + objB.getNum());
	}

}
