package com.infinite.collections;

import java.util.LinkedList;

public class LinkedListExample {
	  public static void main(String[] args) {
		    // Create a LinkedList of Strings
		    LinkedList<String> list = new LinkedList<String>();

		    // Add elements to the LinkedList
		    list.add("Atp");
		    list.add("55");
		    list.add("Uk");
		    list.add("usa");
		    list.add("amd");
		    list.add("amd");


		    // Print the LinkedList
		    System.out.println("LinkedList: " + list);

		    // Access an element of the LinkedList
		    System.out.println("Second element: " + list.get(1));

		    // Remove an element from the LinkedList
		    list.remove(2);
		    System.out.println("LinkedList after removing an element: " + list);

		    // Check if the LinkedList is empty
		    System.out.println("Is the LinkedList empty? " + list.isEmpty());

		    // Find the size of the LinkedList
		    System.out.println("Size of the LinkedList: " + list.size());
		    

		    System.out.println("First Element is"  +list.getFirst());
		    System.out.println("First Element is"  +list.getLast());
		  }
		}

