package com.infinite.lambdaoperator;
interface IHello{
	void sayHello();
	
}

public class Lambdaexpr1 {
	public static void main(String[] args) {
		IHello obj1= () -> {
			
		System.out.println("welcome to jdk 1.8 features");
	};
   obj1.sayHello();
}
}