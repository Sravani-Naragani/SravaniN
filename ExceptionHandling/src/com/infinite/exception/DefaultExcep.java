package com.infinite.exception;

public class DefaultExcep {
	public static void main(String[] args) {
		doStuff();
	}

	public static void doStuff() {
		
		domoreStuff();
		System.out.println(10/0);
	}

	public static void domoreStuff() {
		System.out.println("hello");
		
		
	}
	

}
