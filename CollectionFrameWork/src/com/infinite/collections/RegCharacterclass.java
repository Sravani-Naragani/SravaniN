package com.infinite.collections;

import java.util.regex.Pattern;

public class RegCharacterclass {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("sss", "sss"));
		System.out.println(Pattern.matches("hari","ggg"));
		System.out.println(Pattern.matches("XYZ", "WBCD"));
		System.out.println(Pattern.matches("XXX", "XXX"));
		System.out.println(Pattern.matches("XXY", "XYZ"));
	}

}
