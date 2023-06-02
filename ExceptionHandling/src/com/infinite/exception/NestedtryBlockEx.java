package com.infinite.exception;

public class NestedtryBlockEx {

	public static void main(String[] args) {
		try{
			try{
				int a[] = new int[4];
				a[5]=4;
				
				
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}
			try{
				String s = null;
				System.out.println(s.length());
				
				
			}catch(NullPointerException e){
				System.out.println(e);
			}
			int a = 10/0;
		}
		
		catch(ArithmeticException e){
			System.out.println(e);
		}

	}

}
