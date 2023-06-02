package com.infinite.thread;
interface ab{
	int ab = 15;
}
interface cd{
	int cd = 15;
}
interface ef extends ab,cd{
	 void sum();
}
class Sravani implements  ef{
	public void sum(){
		System.out.println("sum is "+(ab+cd));
	}
}
public class Inhwe {
	public static void main(String[] args) {
		Sravani s = new Sravani();
		s.sum();
	}

}
