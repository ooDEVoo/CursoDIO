package Introducao;



public class SmartTV {

		private boolean ligadaDesligada;
		private int canal;
		private int volume;
		
		public SmartTV() {
			this.ligadaDesligada = false;
			this.canal  = 10;
			this.volume = 5;
		}

		public void ligarTv() { 
			
			ligadaDesligada = true;
			System.out.println(ligadaDesligada);
			System.out.println("A TV está ligada: " );
		}
		
		public void desligarTv() {
		
			ligadaDesligada = false;
			System.out.println(ligadaDesligada);
			System.out.println("A TV está desligada: " + ligadaDesligada );
		}
		
		public void mudarCanal(int novoCanal) {
			
			canal = novoCanal;
		}
		
		public void aumentarCanal() {
			canal++;
		}
		
		public void diminuirCanal() {
			canal--;
		}
		
		public void mudarVolume(int novoVolume) {
			volume = novoVolume;
		}
		
		public void aumentarVolume() {
			volume++;
		}
		
		public void diminuirVolume() {
			volume--;
		}
		
		public boolean getLigaDesliga() {
			return ligadaDesligada;
		}

		public void setLigaDesliga(boolean LigaDesliga) {
			this.ligadaDesligada = LigaDesliga;
		}

		public int getCanal() {
			return canal;
		}

		public void setCanal(int canal) {
			this.canal = canal;
		}

		public int getVolume() {
			return volume;
		}

		public void setVolume(int volume) {
			this.volume = volume;
		}
		
		
}
