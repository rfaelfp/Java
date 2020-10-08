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
		
		// O peek e o element retorna o primeiro elemento da fila, sem remover a diferen�a ocorre quando a fila est� vazia.
		System.out.println(fila.peek()); // retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element()); // retorna exce��o.
		System.out.println(fila.element());
		
		System.out.println(fila.size());
		
		// fila.clear();
		fila.isEmpty();
		
		// Pool e remove obtem o pr�ximo elemento da fila e remove.
		System.out.println(fila.poll()); // Retorna null
		System.out.println(fila.remove()); // Retorna exce��o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		
		// fila.contains(...)
		
	}

}
