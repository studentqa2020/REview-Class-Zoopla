package com.testng.practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class JavaTestNgParameterArgument {

	public static void main(String[] args) {
		
		System.out.println("Argument found ="+args[0]);

		
	}
	
	@Test
	@Parameters("browser")
	public void gettest(String par) {
		System.out.println(par);
	}
	
}
