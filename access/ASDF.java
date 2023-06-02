package com.infinite.access;



public class ASDF {
	 String name;
	 int rno;
	 
	

	public ASDF(String name, int rno) {
		this.name = name;
		this.rno = rno;
	}



	public static void main(String[] args) {
		ASDF v = new ASDF("safdgh", 345);
		System.out.println(v.name +" "+v.rno);
		

	}

}
