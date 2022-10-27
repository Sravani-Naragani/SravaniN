package com.infinite.day1;

public class Currentbill {
	public void check(int units){
		double rate, bill=0;
		if(units <=90){
			rate=1;
			bill=rate*units;
		}
		if(units > 90){
			rate=1.5;
			bill=rate*90;
			if(units-90 > 60){
				rate=1.5;
				bill=bill+(rate*60);
			}
			else{
				rate=1.5;
				bill=bill+((units-90)*rate);
			}
		}
		if(units > 150){
			rate=2;
			bill=rate*50;
			if(units-150 > 40){
				rate=2;
				bill=bill+(rate*40);
			}
			else{
				rate=2;
				bill=bill+((units - 50)*rate);
			}
		}
		if(units > 200){
			rate=2.5;
		    if(units-200 > 40 ){
		    	bill += (rate * 40);
		    }
		    else{
		    	bill += rate * (units-200);
		    }
			
		}
		System.out.println(bill);
	}

	public static void main(String[] args) {
		int units =235;
		Currentbill obj= new Currentbill();
		obj.check(units);
				
		
		

	}

}
