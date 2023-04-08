package Introducao;

public class Carro {
	
	private String nome;
	private boolean ligado;
	private boolean destruido;
	private int blindagem;
	private boolean armamento;
	
	public Carro(String nome) {
		this.nome = nome;
		this.ligado = false;
		this.destruido = false;
		this.blindagem = 0;
		this.armamento = false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isDestruido() {
		return destruido;
	}

	public void setDestruido(boolean destruido) {
		this.destruido = destruido;
	}

	public int getBlindado() {
		return blindagem;
	}

	public void setBlindado(int blindado) {
		this.blindagem = blindado;
	}

	public boolean isArmamento() {
		return armamento;
	}

	public void setArmamento(boolean armamento) {
		this.armamento = armamento;
	}
	
	public void sofrerDano(int dano) {
		this.blindagem -= 0;
		if(this.blindagem <= 0) {
			this.blindagem = 0;
			this.ligado = false;
			this.destruido = true; 
		}
	}
	
	public void imprimir() {
		System.out.println("Nome: " + nome);
		System.out.println("Ligado: " + ligado);
		System.out.println("Destruido: " + destruido);
		System.out.println("Blindagem: " + blindagem);
		System.out.println("Armamento: " + armamento);

	}
	}
	

