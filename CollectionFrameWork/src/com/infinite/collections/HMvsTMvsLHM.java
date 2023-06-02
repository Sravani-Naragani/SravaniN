package com.infinite.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HMvsTMvsLHM {
	public static void main(String[] args) {
		//Hashmap---prints values without any order
		Hashtable<Integer, String> mymap = new Hashtable<Integer, String>();
		mymap.put(130, "Pizza");
		mymap.put(111, "Burger");
		mymap.put(123, "Noodles");
		mymap.put(135, "Manchuria");
		mymap.put(130, "Kabab");
		System.out.println(mymap);
		
		//TreeMap---Prints values in ascending order...which is sorting
		
		TreeMap<Integer, String> mytreemap = new TreeMap<Integer, String>();
		mytreemap.put(130, "Pizza");
		mytreemap.put(111, "Burger");
		mytreemap.put(123, "Noodles");
		mytreemap.put(135, "Manchuria");
		mytreemap.put(130, "Kabab");
		System.out.println(mytreemap);
		
		//LinkedHashmap prints values in insertion order
		
		LinkedHashMap<Integer, String> myhashmap = new LinkedHashMap<Integer, String>();
		myhashmap.put(130, "Pizza");
		myhashmap.put(111, "Burger");
		myhashmap.put(123, "Noodles");
		myhashmap.put(135, "Manchuria");
		myhashmap.put(130, "Kabab");
		System.out.println(myhashmap);
		
		Set myset = myhashmap.entrySet();
		System.out.println(myset);
		
		Iterator it = myset.iterator();
		
		while(it.hasNext()){
			Map.Entry entry= (Entry)it.next();
			System.out.println(entry.getKey());
		System.out.println(entry.getValue());
		

		}

	}

}
