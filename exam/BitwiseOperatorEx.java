package com.infinite.exam;

public class BitwiseOperatorEx {
public static void main(String[] args) {
	
	int a = 12, b = 10; 
	
	//both are true ----> o/p is true  (Bitwise AND)
	// a = 1100 b = 1010  
	//o/p = 1000
	System.out.println(a & b); 
	
	
	// any one  i/p is true ----> o/p is true (Bitwise OR)
	// a = 1100 b = 1010   
	//o/p = 1110
	System.out.println(a | b);  
	
	
	// Either both inputs true or both inputs false ----> o/p is false (Bitwise XOR)
	// a = 1100 b = 1010   o/p = 0110
	
	System.out.println(a ^ b);
}
}
