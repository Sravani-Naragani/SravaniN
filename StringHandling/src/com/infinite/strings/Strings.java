package com.infinite.strings;

public class Strings {
	public static void main(String[] args) {
/* It is used to compare a certain string to the current string. 
As a result, the method returns 0, a positive or negative value after comparison.

0 when both strings are equal
positive if string s1 is greater than string s2
negative if string s1 is less than string s2.	*/

	String s1 = "sravani";
	String s2 = "chinni";
	String s3 = "sravani";
	String s4 = "AMMU";
	String s5 = "   Happy Journey:Hyd Happy Journey:Bglr  ";
	double value = 11.50;
    String s6 = String.valueOf(value);
    String s7 = "Sravani Naragani";
    String s8 = "ammu";
    String s9 = String.format("%s", "seetha");

   
//	
//	System.out.println(s1.compareTo(s2));
//	System.out.println(s1.compareTo(s3));
//	System.out.println(s4.compareTo(s1));
//    char c1 = s1.charAt(4);
//	System.out.println(c1);
//	System.out.println(s1.equals(s3));
//	System.out.println(s1.equals(s2));
//	System.out.println(s1.length());
//	System.out.println(s1.replace("a", "i"));
//	System.out.println(s4.toLowerCase());
//	System.out.println(s1.toUpperCase());
//	System.out.println(s5.trim());
//    System.out.println(s1.concat(s2));
//    System.out.println(s6+"%");
    System.out.println(s7.substring(8));
    System.out.println(s7.substring(0,7));
//    System.out.println(s7.indexOf("S"));
//    System.out.println(s7.endsWith("Naragani"));
//    System.out.println(s7.startsWith("sravani"));
//    System.out.println(s5.replaceAll("Happy Journey", "place"));
//    System.out.println(s4.equalsIgnoreCase(s8));
//    System.out.println(s9);
    
   
	}

    
    /*Value of() is used to convert the varied types into String,
    like int to string, long to string, Boolean to string, float to string, etc.*/







}


