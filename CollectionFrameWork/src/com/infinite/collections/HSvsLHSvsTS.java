package com.infinite.collections;

import java.util.Collections;
import java.util.HashSet;//1.2version
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HSvsLHSvsTS {
	public static void main(String[] args) {
		
		HashSet<String> myset = new HashSet<String>();
		myset.add("Fresher");
		myset.add("Experienced");
		myset.add("TechnicalManager");
		myset.add("Manager");
		myset.add("Fresher");
		System.out.println("Hashset " + myset);
		
		Object[] o = myset.toArray();
		System.out.println(o[3]);
		
		if(myset.isEmpty())
		{
			System.out.println("empty");
		}else{
			System.out.println("NotEmpty");
		}
		

		
			LinkedHashSet<String> mylhset = new LinkedHashSet<String>();
			mylhset.add("Fresher");
			mylhset.add("Experienced");
			mylhset.add("TechnicalManager");
			mylhset.add("Manager");
			mylhset.add("Fresher");
			System.out.println("LinkedHashset " + mylhset);
			
			
			Object[] o1 = mylhset.toArray();
			System.out.println(o1[3]);
			
			if(mylhset.contains("e")){
				System.out.println("found");
			}else{
				System.out.println("Not found");
			}
			
			
			TreeSet<String> mytset = new TreeSet<String>();//
			mytset.add("Fresher");
			mytset.add("Experienced");
			mytset.add("TechnicalManager");
			mytset.add("Manager");
			mytset.add("Fresher");
		System.out.println(Collections.addAll(mytset,"FresherBatch2", "ExperiencedBatch2"));
			System.out.println("treeset " + mytset);
			
//			Object[] o2 = mytset.toArray();
//			System.out.println(o2[3]);
				Object[] o3 = mytset.toArray();
				System.out.println(o3[4]);


	}

}
