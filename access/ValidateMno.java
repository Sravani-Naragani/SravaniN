package com.infinite.access;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateMno {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[987][0-9]{9}");
		Matcher m = p.matcher("9345456578");
		System.out.println(m.matches());

	}

}
