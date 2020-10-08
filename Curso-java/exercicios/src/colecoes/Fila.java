package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana"); // Retorna uma exeption caso exeder uma fila de tamanho definitivo.
		fila.offer("Bia"); // Retorna verdadeira ou falso se exceder uma fila de tamanho definitivo.
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		// O peek e o element retorna o primeiro elemento da fila, sem remover a diferença ocorre quando a fila está vazia.
		System.out.println(fila.peek()); // retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element()); // retorna exceção.
		System.out.println(fila.element());
		
		System.out.println(fila.size());
		
		// fila.clear();
		fila.isEmpty();
		
		// Pool e remove obtem o próximo elemento da fila e remove.
		System.out.println(fila.poll()); // Retorna null
		System.out.println(fila.remove()); // Retorna exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		
		// fila.contains(...)
		
	}

}
