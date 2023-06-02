package com.infinite.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Al1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(4);
		al.add(5);
		al.add(7);
		al.add(8);
		al.add(4);
		al.remove(1);
	
			Collections.sort(al);
			System.out.println(al);
	System.out.println(al.indexOf(7));
		System.out.println(al.contains(4));
		System.out.println(Collections.addAll(al, 89, 41));
		System.out.println(al);
	}

}
