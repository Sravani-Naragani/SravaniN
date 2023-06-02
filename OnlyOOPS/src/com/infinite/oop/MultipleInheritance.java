package com.infinite.oop;
interface A11{
	int a = 10;
}
interface B11 extends A11{
	int b = 10;
	
}
interface C11 extends A11,B11{
	void sum();
	
}
class D11 implements C11{
	public void sum(){
		System.out.println(a+b);
	}
	
}

public class MultipleInheritance {
	public static void main(String[] args) {
		D11 d = new D11();
		d.sum();
	}

}





