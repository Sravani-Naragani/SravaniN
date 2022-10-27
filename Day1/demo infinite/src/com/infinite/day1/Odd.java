package com.infinite.day1;

public class Odd {
	public void show(int n){
		int i=1;
		while(i<n){
			i=i+2;
			System.out.println("odd"+ i);
		}
	}

	public static void main(String[] args) {
		int n=20;
		Odd obj = new Odd();
		obj.show(n);

	}

}
