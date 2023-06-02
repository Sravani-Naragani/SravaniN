package com.infinite.collections;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//There are three ways to write the regex example in Java
public class PatternMatches {
	public static void main(String[] args) {

		//1St  Way
		Pattern p =Pattern.compile(".H");
		Matcher m = p.matcher("dH");
		boolean b = m.matches();

		//2nd Way
		boolean b1 = Pattern.compile("..H").matcher("jjH").matches();

		//3rd Way
		boolean b2 = Pattern.matches("H", "iH");

		System.out.println(b+" " +b1+" "+b2);

		// The . (dot) represents a single character.

		System.out.println(Pattern.matches(".h", "gh"));//true (2nd char is h)
		System.out.println(Pattern.matches(".h", "gj"));//false(2nd char is not h)
		System.out.println(Pattern.matches(".h", "ghur"));//false(morethan 2 characters)
		System.out.println(Pattern.matches("..h", "gkh"));//true(3rd char is h)
		System.out.println(Pattern.matches("...h", "gkuh"));//true(4th char is h)



	}

}

