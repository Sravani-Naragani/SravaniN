package com.infinite.thread;

class Is extends Thread{
	public void run(){
		for(int i = 1; i<=10; i++)
		
			System.out.println("sdfghj");
			
	}
}
public class Td123 {

	public static void main(String[] args) throws InterruptedException {
		Is i11 = new Is();
		i11.start();
		for(int i = 1; i<=10; i++)
			
			System.out.println("fghj");
			
			i11.join();
		

	}

}
