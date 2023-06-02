package com.infinite.collections;

import java.util.regex.Pattern;

public class RegexMetacharacters {

	public static void main(String[] args) {
		System.out.println("metacharacters d....");//d means digits
		System.out.println(Pattern.matches("a", "abc"));
		System.out.println(Pattern.matches("1", "1"));
		System.out.println("metacharacters D.....");//D means non digits
		System.out.println(Pattern.matches("1", "abc"));
		System.out.println(Pattern.matches("abc", "abc"));
		System.out.println("metacharacters D with quantifiers ");
		System.out.println(Pattern.matches("D*", "DDDD"));//non digits 
		System.out.println(Pattern.matches("D*", "fgDD"));


	}

}
