package com.infinite.collections;

import java.util.regex.Pattern;

public class RegexQuant {
	public static void main(String[] args) {
		System.out.println("? Quantifier ");
		System.out.println(Pattern.matches("[ayz]?","a" ));
		System.out.println(Pattern.matches("[ayz]?", "aaa"));
		System.out.println("+ Quantifier");
		System.out.println(Pattern.matches("[aaa]+", "aa"));
		System.out.println(Pattern.matches("[aaa]", "yz"));
		System.out.println("* Quantifier ");
		System.out.println(Pattern.matches("[ggg]*", "ggggg"));	

}
}