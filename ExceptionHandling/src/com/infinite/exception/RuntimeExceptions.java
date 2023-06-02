package com.infinite.exception;
class Except{
	void display(){
		try{
			//int a[] = new int[3];
			//a[5]=20;
			String s = "sravani";//--> StringIndexOutOfBoundException
			System.out.println(s.charAt(9));
		}
		catch(Exception e ){
			System.out.println(e);
		}
		
		System.out.println("hello");
	}
	
}
public class RuntimeExceptions {
public static void main(String[] args) {
//	String s=null;  
//	System.out.println(s.length());//NullPointerException  
//	String s="abc";  
//	int i=Integer.parseInt(s);//NumberFormatException 
//	int a=50/0;//ArithmeticException 
//	System.out.println(a);
	//int a[]=new int[5];  
	//a[10]=50; //ArrayIndexOutOfBoundsException
	//string = "sravani";-----
	//System.out.println(s.length(9));
	Except e = new Except();
	e.display();
}
}
