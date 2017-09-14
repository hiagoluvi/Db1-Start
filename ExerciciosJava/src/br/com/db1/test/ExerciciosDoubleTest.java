package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosDouble;

public class ExerciciosDoubleTest {

	@Test
	public void valorMaiorTest() {
		Assert.assertTrue(ExerciciosDouble.valorMaior(5d, 8d) == 5d);

	}

	@Test
	public void valorMaiorMenorTest() {
		Assert.assertTrue(ExerciciosDouble.valorMaiorMenor(5d, 6d, 7d) == 5d);

	}

	@Test
	public void mediaTest() {
		Assert.assertTrue(ExerciciosDouble.media(3d, 3d, 3d) == 3d);
	}

	

	@Test
	public void trianguloTest() {
		Assert.assertTrue(ExerciciosDouble.triangulo(10d, 10d) == 50d);
	}
	
	

}
