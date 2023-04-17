package EstruturaDeDados;

public class MainNo {

	public static void main(String[] args) {
	
		No no1 = new No("No 1");
		No no2 = new No("No 2");
		
		// Encadeamento
		
		no1.setProximoNo(no2);
		
		No no3 = new No("No 3");
		
		no2.setProximoNo(no3);
		
		No no4 = new No("No 4");
		
		no3.setProximoNo(no4);
		
		System.out.println(no1);
		
		System.out.println(no2);
		System.out.println(no1.getProximoNo());
		
		System.out.println("---------");
		
		System.out.println(no1.getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
	
	}

}
