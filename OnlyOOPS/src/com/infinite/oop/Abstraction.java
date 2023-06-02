package com.infinite.oop;
abstract class Employ{
	//Abstract class have both defining and declaring a class.
	//Where is normal class/concret class have only defing a class
	abstract void work();
	void display(){
		System.out.println("display this method");
	}
}
class Servent extends Employ{
	public void work(){
		System.out.println("Abstract method in derived class");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		Servent s = new Servent();
		s.work();
		s.display();
		
	}
	

}
// Abstract classes can not be instantiated but they can have subclass.
//Abstract methods are declared with out declaration