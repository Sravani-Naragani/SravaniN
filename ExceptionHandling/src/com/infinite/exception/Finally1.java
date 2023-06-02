package com.infinite.exception;

public class Finally1 {
	public static void main(String[] args) {
		try {
			System.out.println("try");
			System.exit(0);//It is a Status code.
			//System.exit() method exits current program by terminating running Java virtual machine
		}
		catch (ArithmeticException e) {
			System.out.println("catch");
			// TODO: handle exception
		}
		finally {
			System.out.println("finally");
		}
	}



}
