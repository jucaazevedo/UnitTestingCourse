import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import Excecoes.ExcecaoDeListaVazia;


public class ArrayUtilsTest {

	@Test
	public void deveRetornar5QuandoOMaiorValorFor5() throws ExcecaoDeListaVazia{
		List<Integer> lista = Arrays.asList(1,2,5,3);
		int maiorValor = ArrayUtils.maiorValor(lista);
		assertEquals(5, maiorValor);
	}

	@Test
	public void deveRetornarMaiorValorMesmoQuandoHouverNumerosNegativos() throws ExcecaoDeListaVazia{
		List<Integer> lista = Arrays.asList(-1,-2,-5,-3);
		int maiorValor = ArrayUtils.maiorValor(lista);
		assertEquals(-1, maiorValor);
	}

	@Test(expected = ExcecaoDeListaVazia.class)
	public void deveRetornarExcecaoDeListaVaziaQuandoListaForVazia() throws ExcecaoDeListaVazia{
		List<Integer> lista = Arrays.asList();
		int maiorValor = ArrayUtils.maiorValor(lista);

	}

	@Test
	public void deveRetornarExcecaoDeListaVaziaQuandoListaForNula() {
		try {
			int maiorValue = ArrayUtils.maiorValor(null);
		}
		catch (ExcecaoDeListaVazia e) {
			assertEquals("Lista não pode ser vazia.",e.getMessage());
		}

	}

	/**	@Test - usado no JUnit 5
	public void deveRetornarExcecaoDeListaVaziaQuandoListaForNula() throws ExcecaoDeListaVazia{
		assertThrows(ExcecaoDeListaVazia.class, ()-> {
			ArrayUtils.maiorValor(null);
		});
	}
*/

	@Test
	public void deveRetornar1QuandoOMenorValorFor1() throws ExcecaoDeListaVazia{
		List<Integer> lista = Arrays.asList(1,2,5,3);
		int menorValor = ArrayUtils.menorValor(lista);
		assertEquals(1, menorValor);
	}


	@Test
	public void deveRetornarMenorValorMesmoQuandoHouverNumerosNegativos() throws ExcecaoDeListaVazia{
		List<Integer> lista = Arrays.asList(-1,-2,-5,-3);
		int menorValor = ArrayUtils.menorValor(lista);
		assertEquals(-5, menorValor);
	}

	@Test(expected = ExcecaoDeListaVazia.class)
	public void menorValorDeveRetornarExcecaoDeListaVaziaQuandoListaForVazia() throws ExcecaoDeListaVazia{
		List<Integer> lista = Arrays.asList();
		int menorValor = ArrayUtils.menorValor(lista);

	}


}
