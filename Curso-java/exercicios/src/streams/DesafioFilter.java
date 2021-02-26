package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class DesafioFilter {
	
	public static void main(String[] args) {
		

	Cerveja c1 = new Cerveja("Heineken", 9.9, 600);
	Cerveja c2 = new Cerveja("Budweinser", 7.9, 600);
	Cerveja c3 = new Cerveja("Original", 9.9, 600);
	Cerveja c4 = new Cerveja("Stella", 8.5, 550);
	Cerveja c5 = new Cerveja("Amstel", 3.72, 473);
	Cerveja c6 = new Cerveja("Brahma", 3.2, 350);

	List<Cerveja> lista = Arrays.asList(c1, c2, c3, c4, c5, c6);
	
	Predicate<Cerveja> cervejaPremium = c -> c.preco >= 8;
	Predicate<Cerveja> garrafa = c -> c.qtdMililitros >= 550;
	Function<Cerveja, String> cervaInfo =  c -> c.nome + " ahhhhhh que delícia, senhor! R$ " + c.preco + " possui " + c.qtdMililitros + "ml.";
	
	
	lista.stream()
		.filter(cervejaPremium)
		.filter(garrafa)
		.map(cervaInfo)
		.forEach(System.out::println);

	}
}
