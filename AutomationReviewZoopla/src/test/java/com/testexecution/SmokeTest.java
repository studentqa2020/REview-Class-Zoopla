package com.testexecution;

import org.openqa.selenium.WebDriver;

import com.generic.code.BaseLogin;

public class SmokeTest {

	static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {

		driver=	BaseLogin.getLogin();
		
		driver.quit();
	}
	
}
