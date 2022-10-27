package com.infinite.intf;

interface ITraining{
	void name();
     void email();
}
class Vardhil implements ITraining{
@Override
public void name() {
    System.out.println("Name is Vardhil");	
}

@Override
public void email() {
    System.out.println("email is Vardhil@gmail.com");	

}
class Kishore implements ITraining{


@Override
public void name() {
    System.out.println("Name is Kishore");	

}

@Override
public void email() {
    System.out.println("email is Kishore@gmail.com");	

}
public class IntfDemo {
	

	public void main(String[] args) {
		ITraining[] arr= new ITraining[]{
				new Vardhil(),  new Kishore()				
		};
		for (ITraining iTraining : arr) {
			iTraining.name();
			iTraining.email();
		};
	}

	}
  }
}
