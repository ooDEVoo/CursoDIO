package Introducao;

import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class SmartTV.
 */
/**
 * @author Diego
 *
 */
public class SmartTV {

		/** The ligada desligada. */
		private boolean ligadaDesligada;
		
		/** The canal. */
		private int canal;
		
		/** The volume. */
		private int volume;
		
		/**
		 * Instantiates a new smart TV.
		 */
		public SmartTV() {
			
			this.ligadaDesligada = false;
			this.canal  = 10;
			this.volume = 5;
		}
		
		/** The input. */
		Scanner input = new Scanner(System.in);

		/**
		 * Comandar.
		 */
		public void comandar() {
			
			System.out.println();
			
		}
		
		
		
		/**
		 * Ligar tv.
		 */
		public void ligarTv() { 
			
			ligadaDesligada = true;
			System.out.println(ligadaDesligada);
			System.out.println("A TV está ligada: " );
		}
		
		/**
		 * Desligar tv.
		 */
		public void desligarTv() {
		
			ligadaDesligada = false;
			System.out.println(ligadaDesligada);
			System.out.println("A TV está desligada: " + ligadaDesligada );
		}
		
		/**
		 * Mudar canal.
		 *
		 * @param novoCanal the novo canal
		 */
		public void mudarCanal(int novoCanal) {
			
			canal = novoCanal;
		}
		
		/**
		 * Aumentar canal.
		 */
		public void aumentarCanal() {
			canal++;
		}
		
		/**
		 * Diminuir canal.
		 */
		public void diminuirCanal() {
			canal--;
		}
		
		/**
		 * Mudar volume.
		 *
		 * @param novoVolume the novo volume
		 */
		public void mudarVolume(int novoVolume) {
			volume = novoVolume;
		}
		
		/**
		 * Aumentar volume.
		 */
		public void aumentarVolume() {
			volume++;
		}
		
		/**
		 * Diminuir volume.
		 */
		public void diminuirVolume() {
			volume--;
		}
		
		/**
		 * Gets the liga desliga.
		 *
		 * @return the liga desliga
		 */
		public boolean getLigaDesliga() {
			return ligadaDesligada;
		}

		/**
		 * Sets the liga desliga.
		 *
		 * @param LigaDesliga the new liga desliga
		 */
		public void setLigaDesliga(boolean LigaDesliga) {
			this.ligadaDesligada = LigaDesliga;
		}

		/**
		 * Gets the canal.
		 *
		 * @return the canal
		 */
		public int getCanal() {
			return canal;
		}

		/**
		 * Sets the canal.
		 *
		 * @param canal the new canal
		 */
		public void setCanal(int canal) {
			this.canal = canal;
		}

		/**
		 * Gets the volume.
		 *
		 * @return the volume
		 */
		public int getVolume() {
			return volume;
		}

		/**
		 * Sets the volume.
		 *
		 * @param volume the new volume
		 */
		public void setVolume(int volume) {
			this.volume = volume;
		}
		
		
}
