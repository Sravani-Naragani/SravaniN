package com.infinite.strings;

public class SbuffExamp {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("My Name");
		s.append("Sravani");
		System.out.println(s);
		s.insert(6, "  ");
		System.out.println(s);
		s.insert(7, "is");
		System.out.println(s);
		s.replace(3, 7, "Excellent");
		System.out.println(s);
		s.delete(3,3);
		System.out.println(s);
		System.out.println(s.reverse());
	}

}
