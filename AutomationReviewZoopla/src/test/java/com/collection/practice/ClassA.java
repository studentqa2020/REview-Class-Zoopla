package com.collection.practice;

import java.util.Arrays;

public class ClassA {
	public static void main(String[] args) {
		int[] x = { 0, 0, 1, 1, 1, 1, 2,2,2, 3, 3,3,3 };//4x1 =2x1
		System.out.println("Input Array: " + Arrays.toString(x));
		int outArrLength = processArray(x);//7
		System.out.println(outArrLength);
		System.out.println("Output Array:");
		for (int i = 0; i < outArrLength; i++) {//7
			
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}

	public static int processArray(int[] arr) {
		int arrLength = arr.length;
		int j = 0;
		for (int i = 0; i < arrLength; i++) {//11
			if (i < arrLength - 2 				
					&& arr[i] == arr[i + 2]) { 
				// remove two position ==> length =7
				continue;
			}
			arr[j++] = arr[i];
		}
		System.out.println("Value of j=" +j);
		return j;
	}
}