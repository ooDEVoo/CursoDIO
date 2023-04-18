package EstruturaDeDados;

public class No<T> {
	
	// <T> : A classe passa a aceitar um dados de Tipo genérico
	
	// private String conteudo;
	
	private T conteudo; // neste momento, passamos a ter a possibilidade
						// de termos nós de qualquer tipo: int, String, float..
	private No<T> proximoNo;  // <T> especifica que o Nó é do mesmo tipo do anterior
	
	public No(T conteudo) {
		this.conteudo = conteudo;
		this.proximoNo = null;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No<T> getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(No<T> proximoNo) {
		this.proximoNo = proximoNo;
	}

	@Override
	public String toString() {
		return "No [conteudo = " + conteudo + "]";
	}
	
	

}
