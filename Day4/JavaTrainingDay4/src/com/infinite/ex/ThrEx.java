package com.infinite.ex;

import java.util.Scanner;

public class ThrEx {
	
	public void show(int n){
		if (n < 0){
			throw new ArithmeticException("Negative numbers not allowed");
		}else if(n==0){
			throw new ArrayIndexOutOfBoundsException("Zero is invalid value");
		}else {
			System.out.println("N value is " +n);
		}
	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter N value");
		n = sc.nextInt();
		ThrEx obj = new ThrEx();
		try {
			obj.show(n);
		} catch (ArithmeticException e) {
			System.out.println("e.getMessage()");
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}
