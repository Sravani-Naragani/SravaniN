package com.infinite.oop;

public class Encapsulation {
	private int a;
	private int b;
	

	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.setA(10);
		e.setB(20);
		System.out.println("sum is "+(e.getA()+e.getB()));

	}

}
