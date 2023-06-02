package com.infinite.thread;
class Srav implements Runnable{

	@Override
	public void run()
	{
		
for(int i =0; i<10; i++)	{
	System.out.println("hello");

}
	}
	
}
class Pavani implements Runnable{
	public void run(){
		for(int i = 0; i<10; i++){
			System.out.println("sravani");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class Wee2 {
	public static void main(String[] args) {
		Srav s = new Srav();
		Pavani p = new Pavani();
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(p);
		
		t1.start();
		t2.start();
		for(int i = 0; i <10; i++)
			System.out.println("hi");
	}

}
/*class sravani extends Thread{

public void run(){
	for(int i = 0; i<=10; i++){
		System.out.println("Hello sravani");
	}
	
}
}
public class Wee {
public static void main(String[] args) {
	sravani s = new sravani();
	s.start();
	for(int i=1; i<10; i++){
		System.out.println("she works in infinite");
	}
}

}
*/