package com.infinite.day1;

public class Subjects {
	public void check(int a, int b, int c,int d, int e){
		int t =(a+b+c+d+e);
		int avg = (t/2);
	if(a>=35 && b>=35 && c>=35 && d>=35 && e>=35){
			System.out.println("student is passed");
			System.out.println("total marks" + t);
			System.out.println("average" + avg);
		}
	else{
		System.out.println("student is fail");
	}
		
	}

	public static void main(String[] args) {
		int a= 33;
		int b= 43;
		int c= 44;
		int d= 39;
		int e= 47;
		Subjects obj = new Subjects();
		obj.check(a,b,c,d,e);
		

	}

}
