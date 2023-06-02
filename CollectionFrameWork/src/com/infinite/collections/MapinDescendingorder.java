package com.infinite.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeMap;

public class MapinDescendingorder {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(Collections.reverseOrder());
		tm.put(5, "sravani");
		tm.put(1, "pavani");
		tm.put(3, "Hari");
		tm.put(4, "siri");
		Set<Integer> s = tm.keySet();
				System.out.println(s);
				Collection<String> c = tm.values();
				System.out.println(c);
				
		}

	}


