package com.infinite.strings;

public class MR2 {

	public void walkableDistance() {
		System.out.println("I can walk 15kms");
	}

	public static void main(String[] args) {
		MR2 mr2 = new MR2();
		Thread t = new Thread(mr2::walkableDistance);
		t.start();
	}

}
