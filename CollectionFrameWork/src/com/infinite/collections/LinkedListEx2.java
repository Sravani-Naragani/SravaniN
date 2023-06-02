package com.infinite.collections;

import java.util.LinkedList;

public class LinkedListEx2 {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(232);
		ll.add(233);
		ll.add(243);
		ll.add(263);
		ll.add(253);
		ll.add(0, 111);
		ll.remove(0);
System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.isEmpty());
		System.out.println(ll.getLast());
		System.out.println(ll.get(3));
		System.out.println(ll.size());
		}
		}
