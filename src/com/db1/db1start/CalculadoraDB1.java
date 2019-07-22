package com.db1.db1start;

public class CalculadoraDB1 {
	
		private int numero1;
		
		private int numero2;
		

		public CalculadoraDB1(int numero1, int numero2) {
			this.numero1 = numero1;
			this.numero2 = numero2;
			
		}
		public int somar() {
			return numero1 + numero2;
			
		}

		public int subtrair() {
			return numero1 - numero2;
		}
		public int multiplicar() {
			return numero1 * numero2;
		}
		public int dividir() {
			return numero1 / numero2;
		}
		 public boolean numeroPar() {
			 if(numero1 %2 == 0) {
				 return true;
			}
			 else {
				 return false;
			 }
		}
		 public double maiorMenor() {
			 double maior = Math.max(numero1, numero2);
			 return maior;
		 }
		 public double imparesDeNAte100() {
			 double i, contador=0;
			 for (i=numero1;i<100;i++) {
				 if(i%2!=0) {
					 	contador++;
				 }
			 }
			 return contador;
		 }
		 
}


