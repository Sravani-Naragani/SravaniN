package com.infinite.modifiers;

import com.infinite.am.Access1;

public class Access3 extends Access1{
	public static void main(String[] args) {
		Access3 a1 = new Access3();
		
	System.out.println(a1.hours);
	System.out.println(a1.getHours());

	System.out.println(a1.minutes);
//for protected and private other doesn't work.
	//protected can be accessed through subclass.
	}


}
