package com.infinite.day1;

public class CtoK {

	public void calc(double C){
		double k = C+273;
		System.out.println("kelvin value "+k);
	}
	public static void main(String[] args) {
	  double c =37;
	  CtoK obj = new CtoK();
	  obj.calc(c);

	}

}
