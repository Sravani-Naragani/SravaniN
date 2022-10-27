package com.infinite.day1;

public class CtoR {
	public void calc(double c){
		double r= ((4*c)/5);
		System.out.println("radian value" +r);
	}

	public static void main(String[] args) {
		double r= 20;
		CtoR obj = new CtoR();
		obj.calc(r);

	}

}
