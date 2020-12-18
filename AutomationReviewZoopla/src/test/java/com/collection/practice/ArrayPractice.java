package com.collection.practice;

import java.util.Arrays;

public class ArrayPractice {
	//variable, any collection
	 static int [] a = {5,6,7,8,98};
	
	public static void main(String[] args) {
		/*
		 * System.out.println(Arrays.toString(a));//10,20,30
		 * 
		 * System.out.println(a[1]);//20
		 * 
		 * System.out.println(a.length);//3
		 * 
		 * // Basic ==> for(start;end;++) {} for(int i=0;i<a.length;i++) {
		 * System.out.println(a[i]); } // Basic loop but in reverse order
		 * //for(endpoit-1; start;--) for(int i=a.length-1; i>=0;i--) {
		 * System.out.println(a[i]); }
		 */
		//Basic loop & find max number
		int maxNumner=0;//20
		System.out.println("Initial Max number ="+maxNumner);
		for(int i=0;i<a.length;i++) {//3==>1st(20)>>2nd(10)>>3rd(30)
			
			if(a[i]>maxNumner) {//true = 30>20
			//	System.out.println(a[i]);//1st=20,2nd =10,3rd=30
				maxNumner=a[i];//final =30
				System.out.println(" Max number inside loop ="+maxNumner);
			}
			
		}
		
		System.out.println("Final Max number ="+maxNumner);
	}

}
