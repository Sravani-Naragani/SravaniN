package com.infinite.collections;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegExampleUsingScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text");
		Pattern p = Pattern.compile(sc.nextLine(),Pattern.CASE_INSENSITIVE);

	}

}
