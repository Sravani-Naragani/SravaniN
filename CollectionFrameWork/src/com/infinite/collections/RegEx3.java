package com.infinite.collections;

import java.util.regex.Pattern;

public class RegEx3 {
	public static void main(String[] args) {
		String s = "i1am2sravani3";
		String delimiter ="\\d";
		Pattern pattren = Pattern.compile(delimiter);
		
		String[] result = pattren.split(s);
		for (String hi : result) {
			System.out.println(hi);
		}
	}

}
