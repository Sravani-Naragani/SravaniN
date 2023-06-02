package com.infinite.collections;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
	public static void main(String[] args) {
		int count=0;

		Pattern p = Pattern.compile("AB",Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher("ababbaba");
		while(m.find()){
			count++;
			System.out.println(m.start());
		}
			System.out.println("No of occurances" + count);
		
	}

}
