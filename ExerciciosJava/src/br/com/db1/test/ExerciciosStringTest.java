package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosString;

public class ExerciciosStringTest {


	@Test
	public void maiusculoTest() {

		Assert.assertTrue(ExerciciosString.maiusculo("fusca").equals("FUSCA"));

	}

	@Test
	public void minusculoTest() {
		Assert.assertTrue(ExerciciosString.minusculo("FUSCA").equals("fusca"));

	}

	@Test
	public void contagemPalavrasTest() {
		Assert.assertTrue(ExerciciosString.contagemPalavras("DB1Start") == 8);
	}

	@Test
	public void contagemPalavrasComEspacoTest() {
		Assert.assertTrue(ExerciciosString.contagemPalavras(" DB1Start ") == 10);
	}

	@Test
	public void contagemPalavrasTirandoEspacoTest() {
		Assert.assertTrue(ExerciciosString.contagemPalavrasComEspaco(" DB1Start ") == 8);
	}

	@Test
	public void exibirLetrasTest() {
		Assert.assertTrue(ExerciciosString.exibirLetras("Hiago Luvizutto Teixeira").equals("Hiag"));
	}

	@Test
	public void exibirLetras1Test() {
		Assert.assertTrue(ExerciciosString.exibirLetras1("Hiago Luvizutto Teixeira").equals("go Luvizutto Teixeira"));
	}

	@Test
	public void exibirLetras2Test() {
		Assert.assertTrue(ExerciciosString.exibirLetras2("Hiago Luvizutto Teixeira").equals("eira"));
	}

	@Test
	public void mudarNomeTest() {
		Assert.assertTrue(ExerciciosString.mudarNome("Hiago Luvizutto Teixeira").equals("Aluno Luvizutto Teixeira"));
	}

	@Test
	public void frutasTest() {
		String[] frutas = ExerciciosString.frutas1("banana,maca,melancia");

		Assert.assertTrue(frutas[0].equals("banana"));
		Assert.assertTrue(frutas[1].equals("maca"));
		Assert.assertTrue(frutas[2].equals("melancia"));

	}
	
	@Test
	public void vogaisTest() {
		Assert.assertTrue(ExerciciosString.vogais("hiago") == 3);	

	}
	
	@Test
	public void inverterTexto() {
		Assert.assertTrue(ExerciciosString.inverterTexto("hiago").equals("ogaih"));
	}
	

}
