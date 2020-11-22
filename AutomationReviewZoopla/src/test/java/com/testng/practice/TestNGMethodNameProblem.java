package com.testng.practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGMethodNameProblem {

	WebDriver driver;


	@Test()//nothing
	public void dress() {
		System.out.println("This my dress selection test");
	}
	@Test(dependsOnMethods = {"dress"} )
	public void cart() {
		System.out.println("This is my Cart test");
	}
	@Test(dependsOnMethods = {"cart"})
	public void payment() {
		System.out.println("This is my payment test");
	}
	
}
