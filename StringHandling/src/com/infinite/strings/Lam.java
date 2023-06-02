package com.infinite.strings;
@FunctionalInterface
interface A1{
	void say();
}
//FI interface must implement Lambda functions as a target type.
//lambda functions are instance of FI these are used to pass the block of code.
public class Lam {

	public static void main(String[] args) {
		A1 obj;
		obj = () ->{
			System.out.println("Hi");
			System.out.println("Hello");
		};
		obj.say();
//		A1 obj = new A1(){
//			public void say(){
//				System.out.println("hi");
//			}
//		};
//		obj.say();

	}

}
