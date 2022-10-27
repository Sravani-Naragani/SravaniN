package com.infinite.cols;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
		Comparator c = new NameComparator();
		SortedSet  employList = new TreeSet(c);
		employList.add(new Employ(1, "vaishu",410));
		employList.add(new Employ(2, "vaishnavi",411));
		employList.add(new Employ(3, "vishnu",412));
		for (Object object : employList) {
			Employ employ=(Employ)object;
			System.out.println(object);
		}

	}
}
