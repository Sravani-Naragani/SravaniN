package com.infinite.exception;

public class ThrowsbyDs {
	public static void main(String[] args) throws InterruptedException  {
		doStuff();
	}

	public static void doStuff() throws InterruptedException  {
		
		domoreStuff();
		
	}

	public static void domoreStuff() throws InterruptedException {
		Thread.sleep(1000);
		
		
	}
	

}
