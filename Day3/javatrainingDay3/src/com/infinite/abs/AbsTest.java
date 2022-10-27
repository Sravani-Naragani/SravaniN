package com.infinite.abs;
abstract class Vehical{
	abstract void name();
	abstract void type();
}
class passionpro extends Vehical{
	
@Override
void name() {
	System.out.println("name is Passionpro");
	
}
 
@Override
void type() {
	System.out.println("its 2wheeler");
}
}
class Scross extends Vehical{

	@Override
	void name() {
		System.out.println("name is Scross");

	}
	@Override
	void type() {
		System.out.println("its 4wheeler");
	}
		
	}
public class AbsTest{
	public static void main(String[] args) {
		Vehical[] arr= new Vehical[]{
				new Scross(),
				new passionpro(),
		};
		for (Vehical vehical : arr) {
			vehical.name();
			vehical.type();
		}
				
		}
				
}