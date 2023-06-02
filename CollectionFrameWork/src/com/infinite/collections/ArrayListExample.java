package com.infinite.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		
	
		ArrayList<String> fruitlist = new ArrayList<String>();
		fruitlist.add("Watermelon");
		fruitlist.add("strawberry");
		System.out.println(fruitlist);
		
		//fruitlist.clear();
		System.out.println(fruitlist.contains("Raspberry"));
		System.out.println(fruitlist.remove("Grapes"));
		System.out.println(fruitlist.remove("strawberry"));
		

	}

}
