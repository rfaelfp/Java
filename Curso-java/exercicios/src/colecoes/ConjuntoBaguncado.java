package colecoes;

import java.util.HashSet;
import java.util.Set;

/*
Coleção de coisas armazenadas dentro de uma estrutura.
As collections permitem um array que pode variar de tamanho.
Permite elementos heteregeneos (objeto,
Não permite tipos primitivos, mas sem a versão objetos dos tipos primitiros (Integer, Boolean, Char)

Tipos:

- Set 
	* Não ordenado (por padrão)
	* Não é indexado
	* Não aceita repetição - Não pode 2 elementos iguais no mesmo set
	
- List (parecido com array)
	* Indexada
	* Aceita repetição

- Map 
	* Estrutura Chave/valor
	* Chave não aceita repetição
	* Valor aceita repetição

- Queue (fila) 
	* Implementa fila
	* first in/first out (FIFO)
	
- Stack (pilha)
	* Implementa pilha 
	* Last in/first out (LIFO)
	* 
*/

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		// Foi dito que a colection não aceita tipo primitivo, no caso de ser adicionado haverá conversão de primitivo para Classe do primitivo. double p/ Double.
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		// Se for adicionado um elemento que já existe ele não será considerado.
		conjunto.add("Teste");
		System.out.println(conjunto.size()); // Não tem .length e sim .size
		
		System.out.println(conjunto.remove("teste")); // Retorna true ou false dependendo se conseguir remover
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println(conjunto.size()); 
		
		System.out.println(conjunto.contains('x')); // Retorna true ou false depenendeo se localizar o valor. 
		System.out.println(conjunto.contains(1));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		// conjunto.addAll(nums); // União entre duas coleções diferentes
		conjunto.retainAll(nums); // Retem somente os valores que existe no conjunto passado
		System.out.println(conjunto);
		
	}

}
