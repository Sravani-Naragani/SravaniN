package com.infinite.day1;

public class Voting {
	public void check(int age){
		if(age >= 18){
			System.out.println("eligible to vote");
		}
		else {
			System.out.println("not eligible");
			
		}
	}

	public static void main(String[] args) {
		int age = 17;
		Voting obj = new Voting();
		obj.check(age);

	}

}
