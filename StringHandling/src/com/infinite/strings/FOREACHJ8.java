package com.infinite.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//iterating over a list
public class FOREACHJ8 {
	public static void main(String[] args) {
		List<String> n = Arrays.asList("John", "Jane", "Alice");

		n.forEach(System.out::println);
		
		Map<String, Integer> scores = new HashMap<>();
		scores.put("John", 80);
		scores.put("Jane", 90);
		scores.put("Alice", 95);

		scores.forEach((name, score) -> System.out.println(name + "  "+ score));
		
		int[] numbers = {1, 2, 3, 4, 5};

		Arrays.stream(numbers).forEach(System.out::println);
	}

}
