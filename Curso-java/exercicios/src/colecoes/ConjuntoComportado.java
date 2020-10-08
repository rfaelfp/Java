package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		// Set<String> listaAprovados = new HashSet<>(); 
											 // O <> define que o set será somente de um topo, no exemplo: String. Pode suprimir o String na frente do
											 // HashSet passando o "diamond" <>
		SortedSet<String> listaAprovados = new TreeSet<>(); // O TreeSet consegue manter a ordem da coleção do tipo Set. Possível usar também o SortedSet
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>(); 
		nums.add(1);
		nums.add(2);
		nums.add(33);
		nums.add(44);
		
		for(int n: nums) {
			System.out.println(n);
		}
	}
	

}
