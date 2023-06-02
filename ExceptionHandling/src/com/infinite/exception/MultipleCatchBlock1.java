package com.infinite.exception;

public class MultipleCatchBlock1 {
	
	public static void main(String[] args) {  
        
        try{    
             int a[]=new int[5];    
             a[7]=70;    
             //a[5]=30/0;---Arithmetic exception //
             //string s = null;---parent Exception occurs
          //   System.out.println(s.length());
            }    
            catch(ArithmeticException e)  
               {  
                System.out.println("Arithmetic Exception occurs");  
               }    
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
               }    
            catch(Exception e)  
               {  
                System.out.println("Parent Exception occurs");  
               }             
            System.out.println("rest of the code");    
 }  
}  


