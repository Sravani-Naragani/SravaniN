package com.infinite.cols;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo1 {
	public static void main(String[] args) {
		SortedSet names= new TreeSet();
		names.add("sravani");
		names.add("sri");
		names.add("siri");
		System.out.println(names);
        for (Object object : names) {
        	System.out.println(object);
	
}
	}
	
	

}
