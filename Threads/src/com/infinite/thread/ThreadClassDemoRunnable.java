package com.infinite.thread;

public class ThreadClassDemoRunnable {
    public static void main( String args[] )  
    {  
               Runnable r = () -> {   
                             int a= 10;  
                             int b=12;  
                             int result = a+b;  
                             {
                             System.out.println("Thread started running..");  
                             System.out.println("Sum of two numbers is: "+ result);  
                             }
                          } ;

     // Creating instance of the class extend Thread class  
       
       //calling start method to execute the run() method of the Thread class 
      Thread th = new Thread(r);
       th.start();  
    }  
  }  



