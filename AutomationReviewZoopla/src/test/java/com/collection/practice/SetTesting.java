package com.collection.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetTesting {
//2,3,2,6,3,5 max
	public static void main(String[] args) {
		
		Set<Integer> myset = new TreeSet<>();
		myset.add(2);
		myset.add(3);
		myset.add(2);
		myset.add(6);
		myset.add(3);
		myset.add(5);
		System.out.println("Initial set ="+myset);// no order

		List<Integer> mylist =new ArrayList<>();
		mylist.addAll(myset);
		
		Collections.reverse(mylist);
		System.out.println("reverse set value ="+mylist);
		
		int maxValue = Collections.max(mylist);
		System.out.println("My max Set value = " + maxValue);

		int minValue = Collections.min(mylist);
		System.out.println("My min Set value = " + minValue);
	}
	
	
}
