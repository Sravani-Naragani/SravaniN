package com.infinite.strings;

public class EnsureCapacity {
	public static void main(String args[]){
		StringBuilder mystring = new StringBuilder();
		mystring.append("Great learning");
		System.out.println("The capacity of the string is: " + mystring.capacity());
		mystring.append("Academy");
		System.out.println("The capacity of the string is: "+ mystring.capacity());
		mystring.ensureCapacity(15);
		System.out.println("Now the capacity of the string is same as: " + mystring.capacity());
		mystring.ensureCapacity(44);
		System.out.println("The capacity of the string is now: " + mystring.capacity());
		}

}
