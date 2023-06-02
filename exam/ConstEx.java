package com.infinite.exam;

//constructor overloading

class Examplee{
	String channel; // instance variable
	
	Examplee(){  //default Constructor
		channel = "Telugu Web Guru";
		
	}
	Examplee(String s){ // parameterized Constructor
		channel="sravani";
		
	}
}


 public class ConstEx {
	public static void main(String[] args) {
		Examplee e = new Examplee();
		System.out.println("channel name in e object is :" +e.channel);
		
		Examplee e1 = new Examplee("ggggggggg");
		System.out.println("channel name e1 object is :" +e1.channel);
			
	}

}
