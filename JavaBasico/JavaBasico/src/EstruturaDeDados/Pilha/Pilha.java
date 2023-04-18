package EstruturaDeDados.Pilha;

public class Pilha {
	
	private No refNoEntredaPilha;
	
	public Pilha() {
		this.refNoEntredaPilha = null;
	}
	
	// método para incluir na pilha
	
	public void push(No novoNo) {
		No refAuxiliar = refNoEntredaPilha;
		refNoEntredaPilha = novoNo;
		refNoEntredaPilha.setReferenciaNo(refAuxiliar);
	}
	
	// método para exclusão do último elemento inserido na pilha
	
	public No pop() {
		if(! this.isEmpty()) { 					//faz referência ao método isEmpty para 
			No noPoped = refNoEntredaPilha;		// se tem agum elemento na pilha
			refNoEntredaPilha = refNoEntredaPilha.getReferenciaNo();
			return noPoped;
		}
		return null; // Se a pilha estiver vazia, retorna nulo
	}
	
	// método para retornar a referência da pilha
	
	public No top() {
		return refNoEntredaPilha;
	}
	
	// Método para retornar se o nó de 
	// referência de entrada está nulo ou não
	
	public boolean isEmpty() {
		
		if(refNoEntredaPilha == null) {
			return true;
		}
			return false;
			
			// outra forma de escrever este método seria:
			
			// retrun refrefNoEntredaPilha == null ? true : false
	}
	
	@Override
	public String toString() {
		
		String stringRetorno = "------------------\n"; 	 
		stringRetorno += "			Pilha\n";
		stringRetorno += "------------------\n";
	
		No noAuxiliar = refNoEntredaPilha;
		
		while (true) {
			if(noAuxiliar != null) {
				stringRetorno += "[No{dado =" + noAuxiliar.getDado() + "}]\n";
				noAuxiliar = noAuxiliar.getReferenciaNo();
				
			}
			else {
				break;
			}
		}
		stringRetorno += "==============\n";
		return stringRetorno;
	
	}
	
	
	
	

}
