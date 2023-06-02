package com.infinite.oop;
class A1{
	void father(){
		System.out.println("I am father");
	}
}
class B1 extends A1{
	void son(){
		System.out.println("I am son");
	}
}
class C1 extends A1{
	void daughter(){
		System.out.println("I am daughter");
	}
}

public class HirarchealInheritance {
	public static void main(String[] args) {
		
	
	C1 c = new C1();
	B1 b = new B1();
	b.son();
	b.father();
	c.daughter();
	c.father();
	

	}
}
