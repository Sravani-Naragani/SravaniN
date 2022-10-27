package com.infinite.cols;

import java.util.ArrayList;
import java.util.List;

public class Customer2 {
	public static void main(String[] args) {
	List CustomerList = new ArrayList();
	CustomerList.add(new Customer(1,"sravani","bng", 765));
	CustomerList.add(new Customer(1,"srivani","gnt", 766));
	CustomerList.add(new Customer(1,"sivani","vizag", 767));
	CustomerList.add(new Customer(1,"sravya","vijayanagar", 768));
	CustomerList.add(new Customer(1,"sravan","mtm", 769));
	for (Object object : CustomerList) {
		Customer Customer =(Customer)(object);
		System.out.println(Customer);
	}
	}

}
