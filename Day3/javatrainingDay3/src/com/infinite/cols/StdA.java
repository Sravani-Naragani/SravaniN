package com.infinite.cols;

public class StdA {
	int stdno;
	String name;
	double gpa;
	@Override
	public String toString() {
		return "StudentDemo [stdno=" + stdno + ", name=" + name + ", gpa=" + gpa + "]";
	}
	public StdA() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StdA(int stdno, String name, double gpa) {
		super();
		this.stdno = stdno;
		this.name = name;
		this.gpa = gpa;
	}
	

}
