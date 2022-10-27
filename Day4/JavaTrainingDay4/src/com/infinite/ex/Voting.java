package com.infinite.ex;

import java.util.Scanner;

public class Voting {
	
	public void check(int age) throws VotingException{
		if (age < 18){
			throw new VotingException("you r not eligible");
		}else{
			System.out.println("you can vote..");
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ur age");
		int age = sc.nextInt();
		Voting obj = new Voting();
		obj.check(age);

	}

}
