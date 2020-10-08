package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno pr�ncipe"); // Retorna false
		livros.push("Harry Potter: A pedra filosofal"); // Retorna exce��o
		livros.push("O Hobbit");
		
		// Retorna o head
		System.out.println(livros.peek());
		System.out.println(livros.peek());
		
		// Retorna e remove
		System.out.println(livros.poll()); // retorna false
		System.out.println(livros.remove()); // retorna exce��o
		System.out.println(livros.pop()); // retorna exce��o
		System.out.println(livros.poll());
		
		System.out.println(livros.size());   
	}

}
