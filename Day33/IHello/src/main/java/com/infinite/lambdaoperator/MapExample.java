package com.infinite.lambdaoperator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
	public static void main(String[] args) {
		
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1,"Swathi",99323));
		employList.add(new Employ(2,"Madhu",99326));
		employList.add(new Employ(3,"Lashareef",99327));
		employList.add(new Employ(4,"UshaSree",99320));
		employList.add(new Employ(5,"Javed",99322));
		employList.add(new Employ(6,"Krishna",99324));
		employList.add(new Employ(7,"Sravani",89328));
		List<String> mapDemo = 
				employList.stream().map(x -> x.getName()).collect(Collectors.toList());
System.out.println("Employ Names");
mapDemo.forEach(System.out::println);
}
}