package com.infinite.ex;

public class EmployDemo {

	public static void main(String[] args) {
		Employ employ = new Employ(0, null, 0);
		employ.setEmpno(1);
		employ.setName("Madhu");
		employ.setBasic(4456.89);
		
		System.out.println(" Employ no " + employ.getEmpno());
		System.out.println(" Employ Name " + employ.getName());
		System.out.println(" Employ Basic " + employ.getBasic());


	}

}
