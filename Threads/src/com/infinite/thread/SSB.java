package com.infinite.thread;
class MathTables{
	synchronized static void mathtabledisplay(int x){
		for(int i =1; i<=10; i++){
			System.out.println(x*i);
		}
	}
}
class Mt extends Thread{
	public void run(){
		MathTables.mathtabledisplay(7);
	}
}
class Mt2 extends Thread{
	public void run(){
		MathTables.mathtabledisplay(2);
	}
}class Mt3 extends Thread{
	public void run(){
		MathTables.mathtabledisplay(5);
	}
}

public class SSB{
	public static void main(String[] args) {
		Mt m = new Mt();
		Mt2 m2 = new Mt2();
		Mt3 m3 = new Mt3();
		m.start();
		m2.start();
		m3.start();

		
		
	}
}


