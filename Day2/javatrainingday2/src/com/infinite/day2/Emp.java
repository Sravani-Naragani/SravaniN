package com.infinite.day2;

public class Emp {
	int empno;
	String name;
	double basic;
	

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}


	public Emp(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
