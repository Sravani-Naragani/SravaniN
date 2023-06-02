package com.infinite.collections;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Whitespace characters..
/*\t - Horizontal tab
\n - New line
\x0B - Vertical tab
\f - form feed
\r - carriage return
*/
public class RegxEx123 {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile(".XX.");
		Matcher matcher = pattern.matcher("AXXB");
		System.out.println("Regx Expression "+matcher.matches());
	
Pattern p1 = Pattern.compile(".s");
Matcher matcher1 = p1.matcher("as");
System.out.println("regex pattern" + matcher1.matches());
}}