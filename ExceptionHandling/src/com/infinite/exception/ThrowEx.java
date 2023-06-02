package com.infinite.exception;

public class ThrowEx {
	public  void checkNum(int num){
		if(num < 1){
			throw new Exception ("number is negative, with negative values we can't caluclate square");
		}
		else{
			System.out.println("square of" + num + (num*num));
		}
	}
public static void main(String[] args){
	ThrowEx t = new ThrowEx();
	t.checkNum(2);
	System.out.println("rest of the code");
}



}  

