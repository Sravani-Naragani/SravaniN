package com.infinite.oop;
class A {
	int a =10;
}
class B extends  A {
	int b =10;
	
}
class C extends  B {
	int c =10;
	void sum(){
		System.out.println(a+b+c);
	}
}

public class InheritanceSingle {
	public static void main(String[] args) {
		C b = new C();
		b.sum();
	}

}
//single and multilevel inheritance.