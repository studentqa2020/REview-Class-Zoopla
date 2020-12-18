package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ExceptionTesting {

	public static void main(String[] args) {
		
		System.out.println("Good morning");
		Animal obj = new Animal();
		//obj.getCheckedException();
		//obj.getuncheckedException();
		System.out.println("Have a nice day");// never run

	}

}
