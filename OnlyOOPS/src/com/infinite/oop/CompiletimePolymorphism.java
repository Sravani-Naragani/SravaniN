package com.infinite.oop;
class overload{
	int num1;
	int num2;
	int result;
	void sum(int a, int b){
		num1=a;
		num2=b;
		result = num1+num2;
		System.out.println(result);
		
	}
	void sum(double a, double b){
		num1=(int)a;
		num2=(int)b;
		result = num1+num2;
		System.out.println(result);

	}
	void sum(int a, double b){
		num1=a;
		num2=(int)b;
		result = num1+num2;
		System.out.println(result);

		
	}
}

public class CompiletimePolymorphism {

	public static void main(String[] args) {
		overload ol = new overload();
		ol.sum(10, 34);
		ol.sum(19, 23.27);
		ol.sum(15.78, 17.67);

	}

}
