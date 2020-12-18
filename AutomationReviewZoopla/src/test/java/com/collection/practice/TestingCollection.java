package com.collection.practice;

import java.util.Arrays;

public class TestingCollection {

	static int [] a = {2,3,4,5,6 };// variable handle only one value at a time
	//Array follow index theory

	public static void main(String[] args) {
	
		System.out.println(Arrays.toString(a));
		System.out.println(a.length);
		System.out.println(a[4]);
		//looping of a array
//for (start point;end point;++) {}// basic for loop <== Must for all
		for(int i= 0; i<a.length; i++) {//must	
			System.out.println(a[i]);
		}
// Advance or enhance for loop	
	//	for(datatype anyName : ArrayName) {}
		for(int value:a) {
			System.out.println(value);
		}
// foreach loop = Best & fastest loop in java ==> Java 8 & latest	
	Arrays.stream(a).forEach(value -> System.out.println(value));
		//stream = java api
		// -> = lambda sign ==> similar like method
	}
}
