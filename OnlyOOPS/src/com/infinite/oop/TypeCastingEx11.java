package com.infinite.oop;

public class TypeCastingEx11 {

	public static void main(String[] args) {
		
//		int i = 17;
//		float f = 15.62f;
		
		//small to big ---downcasting(Automatically converted)--widening casting
		byte b = 3;
		int i1 =b;
		System.out.println(i1);
		
		short s = 2;
		int i2 = s;
		System.out.println(i2);
		
//  Narrowcasting--Upcasting it should be done Manually
		
		double d = 23.4532;
		int i3 = (int)d;
		System.out.println(i3);
		
		
		long l = 1345674567852L;
		int i4 = (int)l;
		System.out.println(i4);
		
		char c = 'E';//---Downcasting
		int i5= c;
		System.out.println(i5);
		
		double d1= 345.34523456743564567;
		float f1 =(float)d1;
		System.out.println(f1);
		
		int x = 12;
		float f5 = x;
		System.out.println(f5);
		
		
		// int to String---		Narrowcasting

		int y = 10;
		String s1 =String.valueOf(y);
		System.out.println(s1);
		
		//String to int---Narrow Casting
		
		String s9 = "123";
		int n = Integer.parseInt(s9);
		float n1 = Float.parseFloat(s9);
		System.out.println(n);
		System.out.println(n1);

	

	}

}
