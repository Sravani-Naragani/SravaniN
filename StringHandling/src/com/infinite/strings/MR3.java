package com.infinite.strings;

interface Workable{
	void getmsg(String text);
}
class Workupdate{
	Workupdate(String text){
	
	System.out.println(text);
	}}
public class MR3{
	public static void main(String[] args) {
		Workable w = Workupdate::new;
		w.getmsg("working for 8 to 9 hours");
	}
}