package com.infinite.exception;
class PrintTable{
	 void showTable(int x){
		 
			 
		
		for(int i =1; i<=10; i++){
			System.out.println(x*i);
		}
		try{
			Thread.sleep(400);
		}
		catch(Exception e){
			System.out.println(e);
		}
		 }
	}

class Threadsss extends Thread{
PrintTable t;
Threadsss(PrintTable t){
	this.t=t;
}
public void run(){
	t.showTable(5);
}
}
class Threadsss1 extends Thread{
	PrintTable t;
	Threadsss1(PrintTable t){
		this.t=t;
	}
	public void run(){
		t.showTable(7);
	}
	
}


public class Sync {
	public static void main(String[] args) throws InterruptedException {
		PrintTable t = new PrintTable();
		Threadsss ts = new Threadsss(t);
		Threadsss1 ts1 = new Threadsss1(t);
		ts.start();
		ts1.start();
		ts.join();
		ts1.join();
		
		
	}
	
		
	
	

}
