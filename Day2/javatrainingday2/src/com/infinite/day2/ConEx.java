package com.infinite.day2;

public class ConEx {
	static{
		System.out.println("static Constructor");
	}
	ConEx(){
		System.out.println("Instance Constructor");

		
	}

	public static void main(String[] args) {
		new ConEx();

	}

}
