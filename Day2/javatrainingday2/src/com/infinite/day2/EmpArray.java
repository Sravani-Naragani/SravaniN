package com.infinite.day2;

public class EmpArray {

	public static void main(String[] args) {
		Emp[] arr =new Emp[]{
				new Emp(1,"sai kamala",84382),
				new Emp(2,"sai ",84381),
				new Emp(3,"kamala",84383),
				new Emp(4,"kranti",88224),
        };
		for (Emp emp : arr) {
			System.out.println(emp);
			
		}
	}

}
