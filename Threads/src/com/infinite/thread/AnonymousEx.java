package com.infinite.thread;

public class AnonymousEx {
public static void main(String[] args) throws Exception {
		
		Thread t1 = new Thread(() ->
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Hi");
				try { Thread.sleep(1000);
				} 
				catch(Exception e ) {}
			}	

		});

		Thread t2 = new Thread(() ->
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Hello");
				try { Thread.sleep(1000);} catch(Exception e ) {}
			}	

		});

		t1.start();
		try { Thread.sleep(1000);} 
		catch(Exception e ) {}
		System.out.println(t1.isAlive()); //its method to running or
		//not once the program has complete the alive method has been complete
        t1.join();
        t2.join();
		t2.start();
		System.out.println("Bye");
}

}
