package com.infinite.gen;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;


public class SortEmploy {
	
	public static void main(String[] args) {
		Comparator<Employ5> c = new NameComparator();
		SortedSet<Employ5> employList = new TreeSet<Employ5>();
		employList.add(new Employ5(1, "vaishu",410));
		employList.add(new Employ5(2, "vaishnavi",411));
		employList.add(new Employ5(3, "vishnu",412));
		for (Employ5 employ : employList) {
			System.out.println(employ);
		}
	}

}
