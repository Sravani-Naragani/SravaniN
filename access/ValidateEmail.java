package com.infinite.access;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[A-za-z0-9._%+-]+@[A-Za-z.-]+.[com]{3}");
		Matcher m = p.matcher("sravaninaragani23@gmail.com");
		System.out.println(m.matches());

	}

}
