package com.infinite.exam;

public class Student {
String name;
int rno;

//Default Constructor

 Student(){
	name="Shantha";
	rno=431;
}
 //parameterized Constructor
 
 Student(String str, int n){
		name=str;
		rno=n;
	}
 public static void main(String[] args) {
	Student s1 = new Student();
	Student s2 = new Student("Sravani",426);
	System.out.println(s1.name);
	System.out.println(s1.rno);
	System.out.println(s2.name);
	System.out.println(s2.rno);
 }
}

