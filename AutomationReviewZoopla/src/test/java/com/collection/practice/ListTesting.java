package com.collection.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTesting {
//min
	public static void main(String[] args) {
		// List<Integer> mylist = new List<>(); ==>wrong
		List<Integer> mylist1 = new ArrayList<>();
		mylist1.add(2);
		mylist1.add(3);
		mylist1.add(6);
		mylist1.add(4);

		System.out.println("Initial list =" + mylist1);
//negative loop also same
		Collections.reverse(mylist1);

		System.out.println("Reverse list =" + mylist1);

		int maxValue = Collections.max(mylist1);
		System.out.println("My max List value = " + maxValue);

		int minValue = Collections.min(mylist1);
		System.out.println("My min List value = " + minValue);

	}

}
