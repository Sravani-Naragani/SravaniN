package com.infinite.thread;
//over riding start method then our start method will execute like a normal method call 
// new thread won't be created
class Mythread1 extends Thread{
	public void start(){
super.start();

		System.out.println("start method");
	}
	public void run(){
		System.out.println("hi");
	}
}


public class Demon1 {
	public static void main(String[] args) {
		Mythread1 o = new Mythread1();
		o.start();
		System.out.println("hello");
		
	}

}
