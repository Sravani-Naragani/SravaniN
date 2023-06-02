package com.infinite.collections;



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RexSca {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your rejex pattern");
		Pattern p = Pattern.compile(sc.nextLine(),Pattern.CASE_INSENSITIVE);
		System.out.println("Enter Text");
		Matcher m = p.matcher(sc.nextLine());
		boolean found = false;
		while(m.find()){
			found=true;
			System.out.println("I found the text  "+m.group()+" Starting from "+m.start()+" ending from "+(m.end()-1));

		}
		if(!found){
			System.out.println("No matches found");
		}
//		System.out.println("Enter phone Number");
//		System.out.println(sc.next());
//		
//		while(m.find()){
//			System.out.println("Enter number is "+Pattern.matches(sc.next(),"[789]{1}[0-9]{8}"));
//			found=true;
//		}
//		if(!found){
//			System.out.println("Enter wrong pattern");
//		}

	}

}

