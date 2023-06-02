package com.infinite.strings;

import java.util.ArrayList;
import java.util.List;

public class ImprovedTypeInference2 {
	public static void main(String[] args) {
		addMore(new ArrayList<>(), 12, 12);
	}
	
	static void addMore(List<Integer> list, int a, int b) {
		list.add(a);
		list.add(b);
		System.out.println(list);
	}
}