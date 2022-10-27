package com.infinite.cols;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set names= new LinkedHashSet<>();
		names.add("Bhargavi");
		names.add("srav");
		names.add("siri");
		names.add("hari");
		names.add("priya");
		names.add("kalpana");
		names.add("akanksha");
		names.add("santhi");
		names.add("jaan");
		names.add("jyosthna");
		names.add("hema");  
		for (Object object : names) {
			System.out.println(object);
		}
     

	}

}
