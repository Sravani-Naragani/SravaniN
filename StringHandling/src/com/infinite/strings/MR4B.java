package com.infinite.strings;

import java.util.function.BiFunction;

class Subtraction{
	public int sub(int a, int b){
		return a - b;
	}
}

public class MR4B {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer>Subtractor = new Subtraction()::sub;
		BiFunction<Integer, Integer, Integer>subtractor1 = new Subtraction()::sub;
		int result = Subtractor.apply(15, 4);
		int result1 = subtractor1.apply(200, 100);
		System.out.println(result);
		System.out.println(result1);
	}

}
