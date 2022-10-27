package com.infinite.day2;

public class Lengthofstring {
	public void show(){
		String str="welcome to java programming..trainer prasanna...";
		System.out.println("length of string is"+ str.length());
		System.out.println("occurance of char 'o' is"+ str.indexOf('o'));
		System.out.println("char at 5th position "+ str.charAt(5));
		System.out.println("Upper Case"+ str.toLowerCase());
		System.out.println("Lower Case"+ str.toUpperCase());
		String s1="sravani", s2="siri", s3="hari";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}

	public static void main(String[] args) {
		Lengthofstring obj = new Lengthofstring();
		obj.show();
		
		

	}

}
