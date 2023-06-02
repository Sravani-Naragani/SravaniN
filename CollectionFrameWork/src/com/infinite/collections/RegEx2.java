package com.infinite.collections;

import java.util.regex.Pattern;

public class RegEx2 {
	public static void main(String[] args) {
		/*Pattern Class
		Matcher Class
		PatternSyntaxException Class
		MatchResult Interface*/
		System.out.println(Pattern.matches(".s", "as"));
		System.out.println(Pattern.matches("[amn]", "ammu"));
		System.out.println(Pattern.matches("[amn]", "a"));
		System.out.println(Pattern.matches("[amn]?", "ammu"));//a or m or n must come 1 time
		System.out.println(Pattern.matches("[amn]?", "a"));//a or m or n must come 1 time
		System.out.println(Pattern.matches("[^amn]", "siri"));//---
		System.out.println(Pattern.matches("[A-Z,a-z,0-9]{6}", "Sravani3"));
		System.out.println(Pattern.matches("[789]{2}[0-9]{8}", "9866236768"));



	}

}
