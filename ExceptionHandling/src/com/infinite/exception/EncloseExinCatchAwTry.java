package com.infinite.exception;

public class EncloseExinCatchAwTry {
	public static void main(String[] args) {
		try{
			int data = 100/0;
			System.out.println("A.E");
			
		}
		catch(Exception e){
			int b = 120/0;
		}
		System.out.println("rest of the code");
	}

}
