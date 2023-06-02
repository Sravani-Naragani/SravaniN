package com.infinite.strings;

//Demonstarte the example of one sample example of StringBuffer

public class StringBufferExample {
  public static void main(String[] args) {
      StringBuffer sb = new StringBuffer("Hello");
      sb.append(" World");
      System.out.println(sb); // prints "Hello World"

      sb.insert(5, " My");
      System.out.println(sb); // prints "Hello My World"

      sb.replace(5, 8, "Your");
      System.out.println(sb); // prints "Hello Your World"

      sb.delete(5, 11);
      System.out.println(sb); // prints "Hello orld"

      sb.reverse();
      System.out.println(sb); // prints "dlroW olleH"
  }
}
