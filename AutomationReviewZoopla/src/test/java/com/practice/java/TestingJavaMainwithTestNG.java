package com.practice.java;

import java.util.Arrays;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestingJavaMainwithTestNG {

	@Test
	//@Parameters(value="browser")
	public void gettest() {//@parameter= no []// @dataprovider = []
		
		int age =4;
		
		// int & double equal mean ==
		// int & double not equal mean !=
		// int & double AND mean &&
		// int & double or mean ||
		
		if(age<16 || age >5 ) {//true OR false = true
			//true 
			System.out.println("Sweet 16");
		}else if(age ==21) {//false
			//true
			System.out.println("Sweet 21");
		}else if(age == 40) {//false
			//true
			System.out.println("Sweet 40");
		}else {
			//false
			System.out.println("My age not match with any condition");
		}
		
		
	}

	@Test
	//@Parameters(value="browser")
	public void gettestStringValue() {//@parameter= no []// @dataprovider = []
		
		String age ="4";
		
		// String equal mean ==> equal() method
		// String not equal mean !equal() method
		// String and  mean &&
		// String or mean ||
		
		if(! age.equals("16")|| age.equals("5")) {// false 
			//true 
			System.out.println("Sweet 16");
		}else if(age.equals("21")) {//false
			//true
			System.out.println("Sweet 21");
		}else if(age.equals("41")) {//false
			//true
			System.out.println("Sweet 40");
		}else {
			//false
			System.out.println("My age not match with any condition");
		}
		
		
	}


	
}
