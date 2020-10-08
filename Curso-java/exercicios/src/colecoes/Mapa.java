package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto"); // Adiciona ou substitui no map. Sentido de não ser .add
		usuarios.put(20, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebecca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet()); // Retorna as chave
		System.out.println(usuarios.values()); // Retorna os valores
		System.out.println(usuarios.entrySet()); // Retorna chave e valor
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Rebecca"));
		
		System.out.println(usuarios.get(4)); // retorna o valor a partir da chave indicada
		System.err.println(usuarios.remove(1));
		System.err.println(usuarios.remove(4, "Gui")); // Pode remover pela chave e pelo valor
		
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
				
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ===> ");
			System.out.println(registro.getValue());
		}
			
	}

}
