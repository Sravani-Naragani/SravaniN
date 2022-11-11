package com.infinite.lambdaoperator;

import java.util.ArrayList;
import java.util.List;

public class LambdaEmploy {
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1,"Swathi",99323));
		employList.add(new Employ(2,"Madhu",99326));
		employList.add(new Employ(3,"Lashareef",99327));
		employList.add(new Employ(4,"UshaSree",99320));
		employList.add(new Employ(5,"Javed",99322));
		employList.add(new Employ(6,"Krishna",99324));
		employList.add(new Employ(7,"Sravani",89328));
		System.out.println("Employ List ");
		employList.forEach(x -> {
			System.out.println(x);
		});
		employList.forEach(System.out::println);
	}

}
