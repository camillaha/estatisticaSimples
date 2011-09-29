public class Calcula {

	public static int MenorValor(int[] valores) {
		int[] valor = valores;
		int min = valor[0];
		for (int i = 1; i < valor.length; i++) {
			if (valor[i] < min) {
				min = valor[i];
			}
		}
		return min;
	}

	public static int MaiorValor(int[] valores) {
		int[] valor = valores;
		int max = valor[0];
		for (int i = 1; i < valor.length; i++) {
			if (valor[i] > max) {
				max = valor[i];
			}
		}
		return max;
	}

	public static int QtidadeValor(int[] valores) {
		int[] valor = valores;
		return valor.length;
	}

	public static double mediaValor(int[] valores) {
		int[] valor = valores;
		double soma = 0.0;
		for (int i = 0; i < valor.length; i++) {
			soma += valor[i];
		}
		return (soma / valor.length);
	}
}
