package com.infinite.oop;

public class WrapperclassesExample {

	public static void main(String[] args) {
		//SBD---small t0 big downcasting
//POB---Primitive to objective---> Boxing..
		int a = 15;
		Integer o = Integer.valueOf(a);
		System.out.println(o);
		//obj to primitive---->Unboxing
		Float f = new Float(2345.87654);
		int a2 =f.intValue();
		System.out.println(a2);
		
		char c = 'a';
		Integer z = Integer.valueOf(c);
		System.out.println(z);
		
		Double d = new Double(3456.234567);
		float f1 = d.floatValue();
		System.out.println(f1);
		
		
	}

}
