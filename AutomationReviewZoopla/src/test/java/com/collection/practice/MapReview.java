package com.collection.practice;

import java.util.HashMap;
import java.util.Map;

public class MapReview {
	
	// Age =40, salary =5000 >>> map and print it
	
	public static void main(String[] args) {
		
		Map<String,Integer> mymap = new HashMap<>();
		mymap.put("Age", 40);
		mymap.put("Salary", 5000);
//		System.out.println(mymap);
//		System.out.println(mymap.keySet());
//		System.out.println(mymap.values());
		//Java8 foreach loop
		mymap.forEach((k,v) ->{
			if(k.contains("Age")) {
				System.out.println(k +"==="+v);
			}
			if(v==5000) {
				System.out.println(k +"==="+v);
			}
			
		});
	
		
		//old java condition=> if else ,ternary , CASE statement
		//New Java condition => filter(Stream API)
		}
		
		
		
		
		
		
		
		
		
		

//		
//		//basic for loop = not a good way for map
//		//advance for loop>>>whole map
//		
//		for(Map.Entry<String,Integer> i: mymap.entrySet()) {
//			
//			System.out.println(i.getKey() +"===="+ i.getValue());
//		}
//		// key looping
//		for(String k: mymap.keySet()) {
//			
//			System.out.println(k);
//		}
//		// value looping
//		for (int v : mymap.values()) {
//					
//					System.out.println(v);
//				}
//	}

}
