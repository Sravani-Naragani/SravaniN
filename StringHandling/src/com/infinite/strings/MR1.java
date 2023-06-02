package com.infinite.strings;
interface C{
	void talk();
}

public class MR1 {
	public static void talkable(){
		System.out.println("I can talk for 15min");
	}
	public static void main(String[] args) {
		C c = MR1::talkable;
		c.talk();
		
	}

}
