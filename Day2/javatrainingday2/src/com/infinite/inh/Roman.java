package com.infinite.inh;

public class Roman {
	
	public static void main(String[]args){
		String num1="567";
		String[] nums={"one","two","three","four","five","six","seven","eight","nine"};
		String[] sec = {"tens", "twenty", "thirty", "fourty", "fifty", "sixty","seventy", "eighty","ninety"};
		String[] ones = {"one","two","three","four","five","six","seven","eight","nine"};
		int len= num1.length();
		System.out.println(len);
		String result="";
		if (len==3){
			switch(num1.charAt(0)){
			case '1':
				result+=nums[0];
				break;
			case '2':
				result+=nums[1];
				break;
			case '3':
				result+=nums[2];
				break;
			case '1':
				result+=nums[3];
				break;
			case '1':
				result+=nums[4];
				break;
			case '1':
				result+=nums[];
				break;
			case '1':
				result+=nums[0];
				break;
			}
		}
		
	}
}