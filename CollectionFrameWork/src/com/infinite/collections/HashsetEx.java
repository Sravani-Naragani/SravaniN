package com.infinite.collections;

import java.util.HashSet;
import java.util.Iterator;

//program to demonstarte the hashset in java

public class HashsetEx {
	public static void main(String[] args) 
	{
		HashSet<String> names = new HashSet<String>();
		System.out.println(names.isEmpty());
		
		//addinng the elements/objects
		names.add("sravani");
		names.add("Naragani");
		if(names.isEmpty())
			System.out.println("names hashset is still Empty");
		else
			System.out.println("size of the hashset names:" +names.size());
		if(names.contains("Naragani"))
			names.remove("naragani");
		System.out.println("updated size of the hashset names: "+names.size());
		
		
		
		names.clear();
		System.out.println("names.isEmpty() after clear:"+names.isEmpty());
		
		
		names.add("pradeep");
		names.add("sathish");
		names.add("siri");
		names.add("sravani");
		names.add("santhi");
		names.add("Madhu");
		names.add("pavani");
		System.out.println(names);
		
		
		Iterator<String>newNames = names.iterator();
		while(newNames.hasNext())
		{
			String n = newNames.next();
			String newValue = "Welcome  "+n;
			System.out.println(newValue);
		}
		//ListIterator<E>
		
		 
	}

}
