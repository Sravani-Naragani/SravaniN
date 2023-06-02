package com.infinite.exam;
abstract class Examp{
public void workq(){
		System.out.println("i am working");
	}
	
	public abstract void read();
}
class c extends Examp{
	public void read(){
		System.out.println("i am reading");
	}
	
}
public class AbsExample {

	public static void main(String[] args) {
		c s = new c();
		s.read();
		s.workq();

	}

}
