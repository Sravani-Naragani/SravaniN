package com.infinite.day1;

public class CaseExample {
	public void show(int n){
		switch(n){
		case 1:
			System.out.println("Hi i am sravani");
			break;
		case 2:
			System.out.println("Hi i am sirisha");
			break;
		case 3:
			System.out.println("Hi i am santhi");
			break;
		case 4:
			System.out.println("Hi i am hari");
			break;
		default:
			System.out.println("invalid choice");
		}
	}

	public static void main(String[] args) {
        int n=4;
        CaseExample obj = new CaseExample();
        obj.show(n);
        
	}

}
