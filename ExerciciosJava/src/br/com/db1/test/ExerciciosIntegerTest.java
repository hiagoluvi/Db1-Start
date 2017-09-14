package br.com.db1.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.ExerciciosInteger;

public class ExerciciosIntegerTest {
	
	private ExerciciosInteger exercicioInteger = new ExerciciosInteger();
	
	
	@Test
	public void somarTest() {
	exercicioInteger.somar(2, 3);
	Assert.assertTrue(exercicioInteger.exibirResultado() == 5);
	}
	
	@Test
	public void subtrairTest() {
	exercicioInteger.subtrair(4, 3);
	Assert.assertTrue(exercicioInteger.exibirResultado() == 1);
	}
	
	@Test
	public void multiplicarTest() {
	exercicioInteger.multiplicar(2, 2);
	Assert.assertTrue(exercicioInteger.exibirResultado() == 4);
	}
	
	@Test
	public void dividirTest() {
	exercicioInteger.dividir(2, 2);
	Assert.assertTrue(exercicioInteger.exibirResultado() == 1);
	}
	
	@Test
	public void numeroParTest() {
		exercicioInteger.numeroPar(8);
		Assert.assertTrue(exercicioInteger.exibirResultado() == 0);
	}
	
	public void numeroMaiorTest() {

		Assert.assertTrue(exercicioInteger.numeroMaior(10, 50) == 50);
	}
	
	public void numerosImparesTest() {
		Integer[] impares =	exercicioInteger.numerosImpares(95);
		
		Assert.assertTrue(impares[0] == 95);
		Assert.assertTrue(impares[1] == 97);
		Assert.assertTrue(impares[2] == 99);
	}
	
	
	
	
		
		
		
		
	}
	
	
	

	

	
	
	
	
	
	






