package EstruturaDeDados;

public class Generics {
	
	/*
	 * 			GENERICS
	 * 
	 * 	Lista<String>minhaLista = new Lista<>();
	 * 
	 * 	public class Lista<T> {
	 * 		private T t;
	 * 		.
	 * 		.
	 * 		.
	 * }
	 * 
	 * ------------------------------------------------------------
	 * 
	 * 			UNKNOW WILDCARD
	 * 
	 * 	public void imprimeLista(List<?>lista) {
	 * 		for(Object obj: lista) {
	 * 			System.out.println(obj);
	 * 	}
	 * }
	 * 	Lista<Aluno>minhaLista = new List<Aluno>();
	 * 	imprimeLista(minhaLista)
	 * 
	 * ------------------------------------------------------
	 * 
	 * 			UPPERBOUNDED WILDCARD
	 * 
	 * Neste caso, só conseguimos passar listas de pessoas e decendentes
	 * de pessoas, no caso, Aluno
	 * 
	 * 	public void imprimeLista(List<? extends Pessoa>listaPessoas) {
	 * 		for(Pessoa p: listaPessoas) {
	 * 			System.out.println(p);
	 * 
	 * Lista<Aluno>minhaLista = new List<Aluno>();
	 * 	imprimeLista(minhaLista)
	 * 
	 * ------------------------------------------------------
	 * 
	 * 			LOWERBOUNDED WILDCARD
	 * 
	 * Neste caso, só podemos passar lista que sejam da classe pessoa
	 * ou superior
	 * 
	 * public void imprimeLista(List<? superextends Pessoa>listaPessoas) {
	 * 		for(Pessoa p: listaPessoas) {
	 * 			System.out.println(p);
	 * 	
	 * 	Lista<Aluno>minhaLista = new List<Aluno>();
	 * 	imprimeLista(minhaLista)
	 * 
	 * --------------------------------------------------------
	 * 
	 * 		CONVENÇÃO
	 * 
	 * 	K para "Key", ex: Map<K,V>
	 * 	V para "Value" ex: Map<K<V>
	 * 	E para "Element" ex: List<E>
	 * 	T para "Type" ex: Collections#addAll
	 * 	? quando genérico
	 */

}
