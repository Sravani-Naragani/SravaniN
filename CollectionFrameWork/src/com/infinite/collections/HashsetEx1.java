package com.infinite.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetEx1 {
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<>();
		h.add("Hi");
		h.add("I am");
		h.add("sravani");
		h.add("from banglore");
		h.add("Hi");

		//h.remove("from banglore");
		//h.clear();
		//h.isEmpty();
		
		Object[] j = h.toArray();
		System.out.println(j[2]);
		
		//System.out.println(h.remove("from banglore"));
		Iterator it = h.iterator(); 
		while(it.hasNext()){
			System.out.println(it.next());
	}
		}
	}


