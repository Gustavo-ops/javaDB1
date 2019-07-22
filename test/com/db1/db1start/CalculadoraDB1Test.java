package com.db1.db1start;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculadoraDB1Test {
	@Test
	public void deveSomarDoisValores() {
		CalculadoraDB1 calculadora = new CalculadoraDB1(12,13);
		int soma  = calculadora.somar();
		assertEquals(25, soma);
		
	}
	@Test
	public void deveMultiplicarDoisValores() {
		CalculadoraDB1 calculadora = new CalculadoraDB1(10,2);
		int multiplica = calculadora.multiplicar();
		assertEquals(20, multiplica);
		
	}
	@Test 
	public void retornarPar() {
		CalculadoraDB1 calculadora = new CalculadoraDB1(10,2);
		boolean parImpar = calculadora.numeroPar();
		assertTrue(parImpar);
		
	}
	@Test
	public void deveRetornarMaior() {
		CalculadoraDB1 calculadora = new CalculadoraDB1(20,17);
		double retornarMaior = calculadora.maiorMenor();
		assertEquals(20, retornarMaior, 0.0001);	
	}
	@Test
	public void retornarImparesDeNAte100() {
		CalculadoraDB1 calculadora =  new CalculadoraDB1(90,100);
		double retornarImpares = calculadora.imparesDeNAte100();
		assertEquals(5, retornarImpares, 0.0001);
	}


	
	

}
