package com.infinite.strings;

import java.util.ArrayList;
import java.util.List;

public class ImprovedTypeInference1 {
	public static void main(String[] args) {
		// Java earlier versions
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(100);
		numbers.add(101);
		System.out.println(numbers);
		
	}
}
