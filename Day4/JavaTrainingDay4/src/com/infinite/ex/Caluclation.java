package com.infinite.ex;

import java.util.Scanner;

public class Caluclation {
	public void calc(int a, int b) throws NegativeException, NumberZeroException{
		if(a < 0 || b < 0){
			throw new NegativeException("Negative nos not allowed");
		}else if (a==0 || b==0){
			throw new NumberZeroException("zero is invalid");
		}else {
			int c = a+b;
			System.out.println("sum is "+c);
		}
	}

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		try {
			new Caluclation().calc(a, b);
		} catch (NegativeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberZeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
