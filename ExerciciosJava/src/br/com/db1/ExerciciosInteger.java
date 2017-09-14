package br.com.db1;

public class ExerciciosInteger {

	private Integer resultado;
	private Integer calculadora;
	private Integer valor1;
	private Integer valor2;
	private Integer exibirResultado;
	private Integer numerosImpares;

	public Integer somar(Integer valor1, Integer valor2) {
		return resultado = valor1 + valor2;
	}

	public Integer exibirResultado() {
		return resultado;

	}

	public Integer subtrair(Integer valor1, Integer valor2) {
		return resultado = valor1 - valor2;

	}

	public Integer multiplicar(Integer valor1, Integer valor2) {
		return resultado = valor1 * valor2;

	}

	public Integer dividir(Integer valor1, Integer valor2) {
		return resultado = valor1 / valor2;

	}

	public void numeroPar(Integer valor1) {
		resultado = valor1 % 2;

	}

	public Integer numeroMaior(Integer valor1, Integer valor2) {
		if (valor1 > valor2){
			return valor1;
		} else {
			return valor2;
		}
		
	}

	public Integer[] numerosImpares(Integer valorInicial) {
		Integer[] impares = new Integer[50];
		Integer contador = 0;
		for (Integer i = valorInicial; i <= 100; i++)

			if (i % 2 != 0) {
				impares[contador] = i;
				contador++;

			}

		return impares;

	}

}
