package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		int total = nums.stream().reduce(soma).get(); // O resultado do reduce � um optional, por isso � necess�rio utilizar o get.
		System.out.println(total);
		
		Integer total2 = nums.stream().reduce(100, soma); // como estamos passando o valor inicial n�o tem optional porque j� sabe que � um integer.
		System.out.println(total2);
		
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);

	}
}
