package com.infinite.thread;
class ThreadC extends Thread{
	int total=0;
	public void run(){
		synchronized(this){
			for(int i = 1; i <=10; i++ )
				
				total=(total+i);
			this.notify();
		}
	}
}

public class InterThreadCom {

	public static void main(String[] args) throws InterruptedException {
		ThreadC c = new ThreadC();
		c.start();
		synchronized(c){
			System.out.println("dfgh");
			c.wait();
			System.out.println("calling threadc");
			System.out.println(c.total);
		}

	}

}
