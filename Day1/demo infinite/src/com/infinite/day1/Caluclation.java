package com.infinite.day1;

public class Caluclation {
	public void calc(int a, int b){
		int c=a+b;
		System.out.println("sum is "+c);
	}

	public static void main(String[] args) {
		int a,b;
		a=5; 
		b=7;
		Caluclation obj= new Caluclation();
		obj.calc(a, b);

	}

}
