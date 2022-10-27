package com.infinite.inh;
class C1 {
	C1(){
		System.out.println("c1 class constructor");
	}
}
class C2 extends C1{
	C2(){
		System.out.println("c2 class constructor");
	}
	public class Inhc{
		
	}
	public static void main(String[] args) {
	   new C2();

	}

}
