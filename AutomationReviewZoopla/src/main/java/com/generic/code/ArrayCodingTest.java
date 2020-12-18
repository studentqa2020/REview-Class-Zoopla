package com.generic.code;

import java.util.Arrays;

public class ArrayCodingTest {

	// 2,3,4,5,6,7,8,9
	static int[] number = { 2, 3, 4, 5, 6, 7, 8, 9 };
	static int arr[] = {  66, 85,33,99, 14, 46, 47, 86, 92, 52, 48, 36, };

	public static void main(String[] args) {

		int largest = arr[0];
		int secondLargest = arr[0];
		int minValue = arr[0];
		int secondminValue = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];

			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];

			}
			if (arr[i] < minValue) {
				secondminValue = minValue;
				minValue = arr[i];

			} else if (arr[i] < secondminValue) {
				secondminValue = arr[i];
				System.out.println("====Old JAVA ====");
			}
		}
		System.out.println("Largest number is:" + largest);

		System.out.println("Second largest number is:" + secondLargest);
		System.out.println("Min number is:" + minValue);
		System.out.println("Second min number is:" + secondminValue);

		int higestNo = 0;
		for (int i = 0; i < number.length; i++) {// must
			if (number[i] > higestNo) {
				higestNo = number[i];
			}
		}
		System.out.println("Higest number =" + higestNo);
		int secondNo = 0;
		for (int i = 0; i < number.length; i++) {// must
			if (number[i] < higestNo) {
				secondNo = number[i];
			}
		}
		System.out.println("2nd Higest number =" + secondNo);
//		//reverse loop >>>> for(endpoint-1;startpoint;--) {}
//		for(int i=number.length-1; i>0 ; i--) {
//			System.out.println(number[i]);
//		}

		// find out max number = new
		int maxValue = Arrays.stream(number).max().getAsInt();
		System.out.println("Array max value =" + maxValue);
		// find min number
		int min = Arrays.stream(number).min().getAsInt();
		System.out.println("Array min value =" + min);
		// find out 2nd max
		// java condition = if else
		// java 8 = filter is the condition
		int secondmax = Arrays.stream(number).filter(v -> v < maxValue).max().getAsInt();
		System.out.println("Array 2nd max value =" + secondmax);
	}

}
