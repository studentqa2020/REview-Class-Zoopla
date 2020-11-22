package com.practice.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.util.BaseConfig;

public class CrossbrowserTesting {
	
	@Test
	@Parameters(value="browser")
	public void getmybrowser(String value) {
		
	System.out.println(value);	
	
	if(value.equals("chrome")) {//true
		//open chrome browser
		System.out.println("Found chrome browser");
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.quit();
		
	}else if(value.equals("ie")) {//true
		//open ie browser
		System.out.println("Found ie browser");
		System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.close();
	}else if(value.equals("firefox")) {//false
		//open firefox browser
		System.out.println("Found firefox browser");
		System.setProperty("webdriver.gekho.driver", " path");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}else {//never go
		
		System.out.println("Not found my browser");
	}
	}

}
