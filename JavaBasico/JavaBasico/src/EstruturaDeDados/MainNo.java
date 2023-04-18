package EstruturaDeDados;

public class MainNo {

	public static void main(String[] args) {
	
		No<String> no1 = new No<>("No 1"); // <String> : denomina o tipo do nó
		No<String> no2 = new No<>("No 2");
		
		// Encadeamento
		
		no1.setProximoNo(no2);
		
		No<String> no3 = new No<String>("No 3");
		
		no2.setProximoNo(no3);
		
		No<String> no4 = new No<>("No 4");
		
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
