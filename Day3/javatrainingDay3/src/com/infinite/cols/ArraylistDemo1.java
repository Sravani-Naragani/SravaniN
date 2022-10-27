package com.infinite.cols;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo1 {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("kishore");
		names.add("srav");
		names.add("siri");
		names.add("hari");
		names.add("priya");
		System.out.println("names are  ");
		for (Object object : names) {
			System.out.println(object);
	
}
	}

}