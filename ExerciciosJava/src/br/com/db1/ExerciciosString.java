package br.com.db1;

public class ExerciciosString {

	public static String maiusculo(String palavra) {
		return palavra.toUpperCase();

	}

	public static String minusculo(String palavra) {
		return palavra.toLowerCase();
	}

	public static Integer contagemPalavras(String DB1Start) {
		return DB1Start.length();

	}

	public static Integer contagemPalavrasComEspaco(String DB1Start) {
		return DB1Start.trim().length();
	}

	public static String exibirLetras(String palavra) {
		return palavra.substring(0, 4);

	}

	public static String exibirLetras1(String palavra) {
		return palavra.substring(3, 24);
	}

	public static String exibirLetras2(String palavra) {
		return palavra.substring(20, 24);
	}

	public static String mudarNome(String palavra) {
		return palavra.replace("Hiago", "Aluno");
	}

	public static String[] frutas1(String frutas) {
		return frutas.split(",");

	}

	public static int vogais(String texto) {
		int vogais = 0;
		texto = texto.toLowerCase();
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

				vogais++;
			}

		}
		return vogais;

	}
	
	public static String inverterTexto(String texto) {
		String textoInvertido = new StringBuilder(texto).reverse().toString();
		return textoInvertido;
	
	}

}
