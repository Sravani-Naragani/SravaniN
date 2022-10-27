package com.infinite.sup;

class sravani{
	
	int empno;
	String name;
	double basic;
	
public sravani(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
}
@Override
public String toString() {
	return "sravani [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
}

}

class Bhagya extends sravani{

	public Bhagya(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	}
public class Supcon{
	  public static void main(String[] args) {
		Bhagya obj = new Bhagya(1,"Bhagya",99423);
		System.out.println(obj);
	}
}

