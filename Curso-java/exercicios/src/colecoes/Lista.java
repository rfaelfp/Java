package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3)); // Consegue acessar pelo �ndice.
		
		lista.remove(1); // Removendo pelo �ndice
		System.out.println(lista.remove(new Usuario("Manu"))); // Como est� usando o .equals e hashcode correto vai conseguir excluir
		System.out.println(lista.remove(new Usuario("Manu")));
		System.out.println(lista.remove(new Usuario("Manu")));
		
		System.out.println(lista.contains(new Usuario("Lia")));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		
	}

}
