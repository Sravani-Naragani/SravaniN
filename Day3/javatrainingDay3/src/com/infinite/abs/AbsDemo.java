package com.infinite.abs;
abstract class Training {
	abstract void name();
	abstract void email();
}
class Javed extends Training{	

	@Override
	void name() {
		System.out.println("Name is Javed... ");
	}

	@Override
	void email() {
		System.out.println("email is javed@gmail.com... ");
		
	}

	class Yeswanth extends Training{

	@Override
	void name() {
        System.out.println("Name is Yeswanth... ");		
	}

	@Override
	void email() {
		System.out.println("email is yeswanth@gmail.com");
		
	}

}
class Sindu extends Training{
@Override
void name() {
    System.out.println("Name is Sindu... ");		

}

@Override
void email() {
	System.out.println("email is sindu@gmail.com");

}
}

public class AbsDemo{
	public void main(String[] args) {
		Training[] arr = new Training[]{
				new Yeswanth(),
				new Javed(),
				new Sindu(),	
		};
	}
}
}
