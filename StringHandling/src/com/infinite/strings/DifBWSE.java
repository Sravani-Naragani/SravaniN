package com.infinite.strings;
//Difference between == and .equals() method
public class DifBWSE {
	public static void main(String[] args)
    {
        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 =  new String("Hello");
 
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false
    }
}

//We can use == operators for reference comparison (address comparison) 
//and .equals() method for content comparison. 
//In simple words, == checks if both objects point to the same memory location
//whereas .equals() evaluates to the comparison of values in the objects.
