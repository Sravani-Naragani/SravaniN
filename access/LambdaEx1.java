package com.infinite.access;
interface Z{
	void run();
}

public class LambdaEx1 {
	public static void main(String[] args) {
		Z obj;
		obj = () ->{
			System.out.println(" i am currently using lambda expressions");
		};
		obj.run();
	}

}
