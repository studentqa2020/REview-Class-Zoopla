package com.java.looping;

public class ReverseNumber {

	public static void main(String[] args) {
		

	int someNumber = 1234567;
    int reversedDigitNumber = 0;
    System.out.println("Original Number: " + someNumber);
    for (; someNumber > 0;) {
        // extract last digit
        int digit = someNumber % 10;
        // shift number and add digit to the right
        reversedDigitNumber = (reversedDigitNumber * 10) + digit;
        // remove the digit processed
        someNumber = someNumber / 10;
    }
   
    System.out.println("Reversed Digit Number: " + reversedDigitNumber);
}
	
}
