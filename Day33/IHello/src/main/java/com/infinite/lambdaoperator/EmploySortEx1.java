package com.infinite.lambdaoperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmploySortEx1 {
	
	public static void main(String[] args) {
		
			List<Employ> employList = new ArrayList<Employ>();
			employList.add(new Employ(1,"Swathi",99323));
			employList.add(new Employ(2,"Madhu",99326));
			employList.add(new Employ(3,"Lashareef",99327));
			employList.add(new Employ(4,"UshaSree",99320));
			employList.add(new Employ(5,"Javed",99322));
			employList.add(new Employ(6,"Krishna",99324));
			employList.add(new Employ(7,"Sravani",89328));
			
			Collections.sort(employList, (e1, e2) -> {
				return e1.getName().compareTo(e2.getName());
			});
			System.out.println("sort by Name");
			employList.forEach(System.out::println);
			System.out.println("sort by Basic-Wise");
			Collections.sort(employList, (e1, e2)-> {
				return (int) (e1.getBasic() - e2.getBasic());
			});
			employList.forEach(System.out::println);

			}
	}


