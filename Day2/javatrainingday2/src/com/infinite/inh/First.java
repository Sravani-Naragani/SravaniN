package com.infinite.inh;

public class First {

	public void show(){
		System.out.println("showmethod fromclass First..");

	}

}
class Second extends First{
	public void display(){
		System.out.println("display methid from class second");
	}
}
public class inh{
	public static void main(String[] args){
		Second obj = new Second();
		obj.show();obj.display();
	}
}