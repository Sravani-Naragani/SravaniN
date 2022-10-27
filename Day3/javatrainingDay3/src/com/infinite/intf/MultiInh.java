package com.infinite.intf;

interface Ione{
	void name();
}
interface ITwo{
	void email();
}
class madhu implements  Ione,ITwo{

	@Override
	public void email() {
		System.out.println("emai is madhumail.com");		
	}

	@Override
	public void name() {
		System.out.println("name is madhu");
		
	}
	
}

public class MultiInh {
	public static void main(String[] args) {
		madhu obj = new madhu();
		obj.name();
		obj.email();
	}

}

