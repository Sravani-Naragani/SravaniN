package com.infinite.day2;

public class OverloadingEx1 {
	public void show(int x){
		System.out.println("show Method w.r.t Integer" + x);
	}
	public void show(double x){
		System.out.println("show Method w.r.t Double" + x);
	}
	public void show(String x){
		System.out.println("show Method w.r.t String" + x);
	}

	public static void main(String[] args) {
		OverloadingEx1 obj= new OverloadingEx1();
		obj.show(12);
		obj.show(12.5);
		obj.show("welcome");

	}

}
