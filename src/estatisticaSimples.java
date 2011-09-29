import static org.junit.Assert.*;

import org.junit.Test;

public class estatisticaSimples {

	@Test
	public void menorValor() {
		int[] valores = { 6, 9, 15, -2, 92, 11 };
		int menorvalor = Calcula.MenorValor(valores);
		assertEquals(-2, menorvalor);
	}

	@Test
	public void maiorValor() {
		int[] valores = { 6, 9, 15, -2, 92, 11 };
		int maiorvalor = Calcula.MaiorValor(valores);
		assertEquals(92, maiorvalor);
	}

	@Test
	public void qtdadeValor() {
		int[] valores = { 6, 9, 15, -2, 92, 11 };
		int qtidadevalor = Calcula.QtidadeValor(valores);
		assertEquals(6, qtidadevalor);
	}

	@Test
	public void mediaValor() {
		int[] valores = { 6, 9, 15, -2, 92, 11 };
		double mediavalor = Calcula.mediaValor(valores);
		assertEquals(21.833333333333332, mediavalor, 0);
	}
}
