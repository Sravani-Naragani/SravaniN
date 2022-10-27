package com.infinite.gen;

import java.util.Comparator;

public class NameComparator  implements Comparator<Employ5>{

	@Override
	public int compare (Employ5 o1,  Employ5 o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
      
}
