package com.infinite.collections;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexassdfghjk {
	public static void main(String[] args) {
		//1st way 
		Pattern p = Pattern.compile("..b");
		Matcher m = p.matcher("nob");
		boolean b = m.matches();
		System.out.println(b);
		//2nd way
		boolean b1 = Pattern.compile(".s").matcher("as").matches();
		System.out.println(b1);
		//3rd way
		boolean b2 = Pattern.matches("sravani", "sravani");
		System.out.println(b2);
	}

}
