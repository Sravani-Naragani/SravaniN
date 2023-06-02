package com.infinite.exam;

public class VariableEx {
	//instance variable
	int a = 10;
	
	
	public static void main(String[] args) {
		{
			// local variable
			int b = 20;
	     	
			System.out.println(b);
			
			VariableEx v = new VariableEx();
			System.out.println(v.a);

		}
	}

}