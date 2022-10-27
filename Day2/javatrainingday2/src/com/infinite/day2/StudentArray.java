package com.infinite.day2;

public class StudentArray {

	public static void main(String[] args) {
		Student[] arr = new Student[]{
				new Student(1,"sravani","vijayawada",9.5),
				new Student(2,"sanvi","vijayanagar",9.5),
				new Student(1,"sravani","vijayawada",9.5),
		for (Student student : arr) {
			System.out.println(student);
		}
			
		}

}
