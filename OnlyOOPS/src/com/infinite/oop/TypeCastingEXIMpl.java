package com.infinite.oop;
class Parent{
	void read(){
		System.out.println("parent");
	}
}
class Child extends Parent{
	int no;
	void write(){
		System.out.println("child");
	}
}

public class TypeCastingEXIMpl {

	public static void main(String[] args) {
		Parent p = new Child();//--> Upcasting
		p.read();
		
		Child c = (Child)p;//sbd--downcasting 
		c.read();
		c.write();
		c.no=23;
		
		

	}

}
