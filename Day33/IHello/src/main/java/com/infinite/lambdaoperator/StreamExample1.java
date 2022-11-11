package com.infinite.lambdaoperator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
public class StreamExample1 {
	
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1,"Swathi",99323));
		employList.add(new Employ(2,"Madhu",99326));
		employList.add(new Employ(3,"Lashareef",99327));
		employList.add(new Employ(4,"UshaSree",99320));
		employList.add(new Employ(5,"Javed",99322));
		employList.add(new Employ(6,"Krishna",99324));
		employList.add(new Employ(7,"Sravani",89328));
		Stream<Employ> employFilter =
				employList.stream().filter(x -> x.getBasic() >= 90000);
		System.out.println("Filtered Data  ");
		employFilter.forEach(System.out::println);
		
	}

}
