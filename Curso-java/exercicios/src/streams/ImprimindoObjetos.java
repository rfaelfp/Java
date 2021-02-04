package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
		System.out.println("Usando for...");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		System.out.println("\nUsando foreach...");
		
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando Iterator...");
		// Necessário criar a interface iterator e depois controlar o laço utilizando o while;
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nUsando stream...");
		// Stream é uma sequncia de dados que é definido na interface stream;
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); // Laço interno;
		
	}

}
