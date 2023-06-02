package com.infinite.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
//collections-1.2v
//Dynamic array
//to print collections we have 2 ways
//1. iterator
//2.enhanced for loop
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionExample {
	public static void main(String[] args) {
	
		Collection<Integer> values = new ArrayList<Integer>();
		
		values.add(1);
	//	values.add("sravani");
		//values.add(5.8);
		values.add(7);
		values.add(9);
		values.add(11);
		values.add(1);
		values.add(5);
		values.remove(5);
		
		//Collections.sort(values);// We can't add the values in b/w and sort..
		//this is the problem with collections so we go for List.

		
		
//		for(int i :values ){
//			System.out.println(i);
//		}
//		
//		Iterator i = values.iterator();
//		while(i.hasNext()){
//		System.out.println((i.next()); //--old technique
	System.out.println(values);

		}
		
	
	
}
/*
//we can use collection for set also

Collection<Integer> val = new TreeSet<Integer>();
val.add(1);
val.add(9);
val.add(90);
val.add(10);
val.add(9);
for (Integer integer : val) {
System.out.println(integer);

}		*/