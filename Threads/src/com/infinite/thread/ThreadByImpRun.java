package com.infinite.thread;
class MyRunnable implements Runnable{
	public void run(){
		for(int i=0; i<10; i++)
		{
			System.out.println("child thread");
		}
	}
}
public class ThreadByImpRun {
	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);//r is called target runnable
		t.start();
		for(int i=0; i<10; i++){
			System.out.println("main thread");
		}
	}

}

