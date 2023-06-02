package com.infinite.exception;

//The Java throw keyword is used to explicitly throw a single exception.

//When we throw an exception, the flow of the program moves from the try block to the catch block.


public class JavathrowEx {
	public static void divideByZero() {

	    // throw an exception
	    throw new ArithmeticException("Trying to divide by 0");
	  }

	  public static void main(String[] args) {
	    divideByZero();
	  }
	}


