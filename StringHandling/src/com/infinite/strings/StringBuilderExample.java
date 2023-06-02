package com.infinite.strings;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        // Append " World" to the end of the string
        sb.append(" World");
        System.out.println(sb); // prints "Hello World"

        // Insert "Java" at index 5
        sb.insert(5, " Java");
        System.out.println(sb); // prints "Hello Java World"

        // Delete characters from index 5 to 9
        sb.delete(5, 10);
        System.out.println(sb); // prints "Hello World"

        // Reverse the order of the characters
        sb.reverse();
        System.out.println(sb); // prints "dlroW olleH"

        // prints the current capacity of the StringBuilder
        System.out.println("Capacity : " + sb.capacity());

        // sets the length of the StringBuilder to 10
        sb.setLength(10);
        System.out.println("New Length : " + sb.length());
    }
}



