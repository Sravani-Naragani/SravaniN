package com.infinite.oop;

class Vehical{
	void go(){
		System.out.println("i am Vehical, parent class of all the classes");
	}
}
class Car extends Vehical{
	void go(){
		System.out.println("i am going by car");
	}
}
class Boat extends Vehical{
	void go(){
		System.out.println("i am going by boat");
	}
}
class Bike extends Vehical{
	void go(){
		System.out.println("i am going by bike");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		Vehical v = new Car();//over riding 
		Vehical v1 = new Boat();
		Vehical v2 = new Bike();
		v.go();
		v1.go();
		v2.go();
		
		

	}

}
