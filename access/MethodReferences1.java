package com.infinite.access;
interface Talkable{
	void talk();
}

public class MethodReferences1 {
	public static void Mrtalk(){
		System.out.println("i can talk for  longtime");
	}
	public static void main(String[] args) {
//		MethodReferences1 m = new MethodReferences1();
//		Talkable t = m::Mrtalk;
		Talkable t = MethodReferences1::Mrtalk;
		t.talk();
	}

}
