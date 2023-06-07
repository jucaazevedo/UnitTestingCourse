import java.util.List;
import java.util.stream.Collectors;

import exceptions.ExcecaoDeListaVazia;

public class ArrayUtils {

	public static int maiorValor(List<Integer> lista) throws ExcecaoDeListaVazia {
		if (lista == null || lista.isEmpty()) throw new ExcecaoDeListaVazia("Lista não pode estar vazia");

		int maior = Integer.MIN_VALUE;
		for (int valor: lista) {
			if (valor > maior) {
				maior = valor;
			}
		}
		return maior;
	}

	public static int menorValor(List<Integer> lista) throws ExcecaoDeListaVazia {
		if (lista == null || lista.isEmpty()) throw new ExcecaoDeListaVazia("Lista não pode estar vazia");

		int menor = Integer.MAX_VALUE;
		for (int valor: lista) {
			if (valor < menor) {
				menor = valor;
			}
		}
		return menor;
	}

	public static int media(List<Integer> lista) {
		if (lista == null || lista.isEmpty()) return 0;
		int sum = 0;
		for (int valor: lista) {
			sum += valor;
		}
		return sum / lista.size();
	}

	public static double mediana(List<Integer> lista) {
		List<Integer> listaOrdenada = lista.stream().sorted().collect(Collectors.toList());
		boolean eImpar = lista.size() % 2 == 1;
		int indiceDoMeio = (lista.size() / 2);
		if (eImpar) {
			return listaOrdenada.get(indiceDoMeio);
		}
		int indiceDoMeio2 = (lista.size() / 2) -1;
		double resultado = (listaOrdenada.get(indiceDoMeio) + listaOrdenada.get(indiceDoMeio2).doubleValue()) / 2;
		return resultado;
	}
}
