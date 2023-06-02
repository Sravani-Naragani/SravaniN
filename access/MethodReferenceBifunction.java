package com.infinite.access;

import java.util.function.BiFunction;

class Addition1{
public int sum(int a, int b){
return a+b;
}
}
public class MethodReferenceBifunction {
	

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer>adder = new Addition1()::sum;
		int result = adder.apply(35, 76);
		System.out.println(result);
		BiFunction<Integer, Integer, Integer>adder1 = new Addition1()::sum;
		int result1 = adder1.apply(345, 76);
		System.out.println(result1);
		BiFunction<Integer, Integer, Integer>adder2 = new Addition1()::sum;
		int result2 = adder2.apply(375, 76);

		System.out.println(result2);

	}

}
