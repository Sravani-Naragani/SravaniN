package com.infinite.day1;

public class Min3 {
	public void check(int a,int b,int c){
		int m=a;
		if(m>b ){
			m=b;
		}
		if(m>c) {
			m=c;
		}
		System.out.println("minimum value" +m);
	}


	public static void main(String[] args) {
		int a,b,c;
		a=3;
		b=7;
		c=5;
		Min3 obj=new Min3();
		obj.check(a, b, c);
		}

}
