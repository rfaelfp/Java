package generics;

import java.util.TreeSet;

public class CompareblaTeste {

	public static void main(String[] args) {

		TreeSet<Integer> nums = new TreeSet<>();

		nums.add(10);
		nums.add(1);
		nums.add(3);
		nums.add(502);
		nums.add(7);
		nums.add(9);
		nums.add(-11);
		nums.add(13);

		for (Integer n : nums) {
			System.out.println(n);
		}

	}

}
