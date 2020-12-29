package com.collection.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.emory.mathcs.backport.java.util.Arrays;

public class ReviewCollection {
	// Poly, susmita, Afifa==> array,List,set then print
	
	public static void main(String[] args) {
		String [] a= {"Poly","susmita","Afifa"};
		System.out.println("My Array values ="+Arrays.toString(a));
		
		List<String> mylist = new ArrayList<>();
		//ArrayList<Integer> mylist2 = new ArrayList<>();
		mylist.add("Poly");
		mylist.add("susmita");
		mylist.add("Afifa");
		
		System.out.println("My List values = "+mylist);
		
		Set<String> myset = new HashSet<>();
		//HashSet<Integer> mySet2 = new HashSet<>();
		myset.add("Poly");
		myset.add("susmita");
		myset.add("Afifa");
		
		System.out.println("My Set values = "+myset);
		
	}

}
