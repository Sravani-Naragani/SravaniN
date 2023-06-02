package com.infinite.exception;

public class ResoveExInCatch {
public static void main(String[] args) {
	int a = 50;
	int b = 0;
	int data;

	try{
	 data = a/b;

	}
	catch(Exception  e)
	{
	System.out.println(a/(b+5));	
	}
	finally{
		System.out.println("executed");
	}
}
}
