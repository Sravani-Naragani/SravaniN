package com.infinite.day2;

public class Student {
	int sno;
	String name;
	String city;
	double cgp;

	public Student() {
		
		// TODO Auto-generated constructor stub
	}

	public Student(int sno, String name, String city, double cgp) {
		
		this.sno = sno;
		this.name = name;
		this.city = city;
		this.cgp = cgp;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", city=" + city + ", cgp=" + cgp + "]";
	}
}
