package com.infinite.gen;

import java.util.ArrayList;
import java.util.List;

import com.infinite.cols.Employ;

public class GenListEx2 {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "vaishu",410));
		employList.add(new Employ(2, "vaishnavi",411));
		employList.add(new Employ(3, "vishnu",412));
		for (Employ e : employList) {
	    System.out.println(e);
	}
	}
}
