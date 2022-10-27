package com.infinite.cols;

import java.util.ArrayList;
import java.util.List;

public class StudentA {

	public static void main(String[] args) {
		List studentlist = new ArrayList();
		studentlist.add(new StdA(1,"chittoor",8.60));
		studentlist.add(new StdA(2,"tirupati",8.60));
		studentlist.add(new StdA(3,"nellore",8.60));
		for (Object object : studentlist) {
			StudentA student = (StudentA) object;
			System.out.println(object);
		}

	}
}
