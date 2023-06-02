package com.infinite.collections;

import java.util.ArrayList;

public class ALExample {
public static void main(String[] args) {
	ArrayList<String> mylist = new ArrayList<String>();
	mylist.add("Tom");
	mylist.add("jerry");
	mylist.add("Krish");
	mylist.add("balaram");
	mylist.add("ChotaBheem");
	mylist.add("Tom");
	mylist.add(0, "Micky");

	mylist.remove(3);
	
	for (String string : mylist) {
		System.out.println(string);
		
	}
	
		System.out.println(mylist.size());
	
}
}
