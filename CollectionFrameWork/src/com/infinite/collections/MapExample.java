package com.infinite.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//Hashtable is synchronized 

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("sravani", 426);
		map.put("sirisha", 411);
		map.put("madhu", 415);
		map.put("pradeep", 422);
		map.put("Haripriya", 530);
		map.put("Santha", 431);
		map.put("Santha", 451);

		Set<String> keys = map.keySet();
		
//		Collection<Integer> values = map.values();
//for (Integer integer : values) {
//	System.out.println(integer);
//	
//}
		
		for (String string : keys) {
			
	
        System.out.println(string);
		}
	}

}
