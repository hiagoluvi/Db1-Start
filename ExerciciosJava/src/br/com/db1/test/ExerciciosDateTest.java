package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosDate;

public class ExerciciosDateTest {
	
	private ExerciciosDate exerciciosDate = new ExerciciosDate();
	
	
	@Test
	public void anoBissextoTest() {
		Assert.assertTrue(exerciciosDate.anoBissexto(2016));
		
	}

}
