package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		// Fornecedor -> N�o recebe nenhum par�metro e devolve alguma coisa.
		// No supplier n�o tem a op��o de encadeamento.
		Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");

		System.out.println(umaLista.get());
	}
}
