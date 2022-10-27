package com.infinite.day2;

public class StringArray {
	public void show(){
		String[] names = new String[]{
				"sachin","sirisha","vaibhav","sowmya","sravani"
		};
		for (String s : names){
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		StringArray obj = new StringArray();
		obj.show();

	}

}
