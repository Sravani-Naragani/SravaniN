package com.infinite.thread;
class Sravani11 implements Runnable{
	public void run(){
		System.out.println("hello");
	}
}
class Sravani1 implements Runnable{
	public void run(){
		System.out.println("iam sravani");
	}
}

public class SravT {
	public static void main(String[] args) throws InterruptedException {
		Sravani11 s = new Sravani11();
		Sravani1 s1 = new Sravani1();
		Thread t = new Thread(s);
		Thread t1 = new Thread(s1);
t.start();
t1.start();
t.join();
t1.join();
		
		
	}
}
