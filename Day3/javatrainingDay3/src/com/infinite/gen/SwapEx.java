package com.infinite.gen;

 class Data {
	public void swap(int a, int b){
		int t;
		t=a;
		a=b;
		b =t;
		System.out.println("A value is "+a+ "B value is "+ b);
		
		}

}
public class SwapEx {
	
	
	public static void main(String[] args) {
		Data obj = new Data();
		int a=5, b=3;
		obj.swap(a, b);
		
		
		
		
	}
}