package com.infinite.access;

public class ConstructorEx {
	private String name;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	ConstructorEx(){
		String name;
	}


	public static void main(String[] args) {
		ConstructorEx c = new ConstructorEx();
		c.setName("sravani");
		
		System.out.println(c.getName());
		
	}
}
