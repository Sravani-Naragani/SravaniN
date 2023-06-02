package com.infinite.exception;

public class Fff {
    final int x = 10; //the final keyword is used to declare a constant variable x with a value of 10. 

    public void display() {
      System.out.println("Value of x: " + x);
    }

    public static void main(String args[]) {
      Fff obj = new Fff();
      obj.display();

      try {
        int a = 10 / 0;
      } catch (ArithmeticException e) {
        System.out.println("Arithmetic Exception caught");
      } finally {                                           
    	  //The finally block contains code that is always executed, 
     //regardless of whether an exception was thrown or not.
        System.out.println("Inside finally block");
      }
    }

    @Override      //Finally, the finalize method is overridden from the Object class.
    //It is called by the garbage
        //collector when it determines that the object is no longer needed.
    protected void finalize() {
      System.out.println("Finalize method called");
    }
  }


