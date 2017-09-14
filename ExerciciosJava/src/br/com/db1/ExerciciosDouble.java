package br.com.db1;

public class ExerciciosDouble {

	public static Double valorMaior(Double valor1, Double valor2) {
		if (valor1 < valor2) {
			return valor1;
		} else {
			return valor2;

		}
	}

	public static Double valorMaiorMenor(Double valor01, Double valor02, Double valor3) {
		if (valor01 < valor02 && valor01 < valor3) {
			return valor01;
		} else if (valor02 > valor01 && valor02 > valor3) {
			return valor02;
		} else if (valor3 < valor01 && valor3 > valor02) {
			return valor3;
		} else {
			return 0d;

		}

	}

	public static Double media(Double valor1, Double valor2, Double valor3) {
		return (valor1 + valor2 + valor3) / 3;

	}
	
	public static Double triangulo(Double altura, Double largura) {
		return (altura * largura)/2;
		
		
	}
}
