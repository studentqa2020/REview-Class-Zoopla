package com.collection.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeCollection {
	int a=10;
	int[] b= {2,3,4,5};
	List<Integer> list= new ArrayList<>();
	Set<Double> set=new HashSet<>();
	Map<Integer,String> map = new HashMap<>();
	
	public static void main(String[] args) {
		int a=10;
		int[] b= {2,3,4,5};//new
		int[] c= new int[4];//old
		c[0]=2;
		c[1]=3;
		c[2]=4;
		c[3]=5;
		
		List<Integer> list= new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(4);
		
		Set<Double> set=new HashSet<>();
		set.add(2.5);
		set.add(3.3);
		set.add(4.6);
		
		Map<Integer,String> map = new HashMap<>();
//		Map<Integer,String> map2 = new HashMap<>();
//		Map<Double,String> map3 = new HashMap<>();
		
		map.put(2, "Sarower");
		map.put(5, "Ahmmed");
		System.out.println(map); 
	}
}
