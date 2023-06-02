package com.infinite.exam;

interface MyInterface {
    int id = 20;
    void print();
 }
 
class MyClass implements MyInterface {   
   public void print() {
      System.out.println("This is print method");
    }   
   public static void main(String args []) {
      MyClass obj = new MyClass();
      obj.print();
      System.out.println(obj.id);
    }
}      

