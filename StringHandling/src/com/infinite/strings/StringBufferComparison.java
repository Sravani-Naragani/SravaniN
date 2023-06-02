package com.infinite.strings;

public class StringBufferComparison {

	    public static void main(String[] args)
	    {
	    	
	        StringBuffer sb1 = new StringBuffer("Hello");
	        StringBuffer sb2 = new StringBuffer("Hello");
	        StringBuffer sb3 = new StringBuffer("World");

	        // Compare sb1 and sb2 using equals() method
	        
	        if (sb1.toString().equals(sb2.toString())) {
	        	
	//in stringBuffer objects method there are two child classes String and StringBuffer
	//in String StringBuffer are pointing to the refernce comparision.
//toString() method of StringBuffer class to convert it into String
	        	//and then using equals() method to compare it.
	        	
	            System.out.println("sb1 and sb2 are equal.");
	        } else 
	        	
	        {
	            System.out.println("sb1 and sb2 are not equal.");
	            
	        }

	        // Compare sb1 and sb3 using equals() method
	        if (sb1.toString().equals(sb3.toString())) {
	            System.out.println("sb1 and sb3 are equal.");
	        } else {
	            System.out.println("sb1 and sb3 are not equal.");
	        }

	        // Compare sb1 and sb2 using == operator
	        if (sb1 == sb2) {
	            System.out.println("sb1 and sb2 are equal.");
	        } else
	        {
	            System.out.println("sb1 and sb2 are not equal.");
	        }

	        // Compare sb1 and sb3 using == operator
	        if (sb1 == sb3)
	        {
	            System.out.println("sb1 and sb3 are equal.");
	        } 
	        
	        else 
	        {
	            System.out.println("sb1 and sb3 are not equal.");
	        }
	    }
	}


