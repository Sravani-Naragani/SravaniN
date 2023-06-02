package com.infinite.thread;
//a thread is paused in running its critical section and another thread is allowed to enter
//in the same critical section to be executed 
//object class methods are
//wait()
//notify()
//notifyall()

class Customer{
	int amount=10000;    

	     synchronized void withdraw(int amount){    
		System.out.println("going to withdraw...");    

		if(this.amount<amount){    
			System.out.println("Less balance; waiting for deposit...");    
			try{
				wait();
				}catch(Exception e){}    
		}    
		this.amount-=amount;    
		System.out.println("withdraw completed...");    
	}    

	     synchronized    void deposit(int amount){    
		System.out.println("going to deposit...");    
		this.amount+=amount;    
		System.out.println("deposit completed... ");   
		notify();    
	}    
}    

public class InterThreadComm{    
	public static void main(String args[]){    
		 Customer c=new Customer();    
		new Thread(){    
			public void run(){
				c.withdraw(7000);
			}    
		}
		.start();    
		new Thread(){    
			public void run(){
				c.deposit(10000);
			}    
		}.start();    

	}
}
