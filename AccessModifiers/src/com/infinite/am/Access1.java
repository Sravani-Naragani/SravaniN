package com.infinite.am;

public class Access1 {
	//default, public, protected, private
	
//	public int hours = 3;
//	public int minutes = 47;
	
	//public and default can be accessed in same package and other package also
	//private only inside the class
	
	
	
//	private int hours ;
//	private int minutes ;
	
	
	//protected works only when it has same package..
	
	protected int hours = 3;
	protected int minutes = 47;
	
	protected int getHours(){
		return hours;
	}
	
	

}
