package com.selenium.situation;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class AlertPoPupInSelenium {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting
		
		driver.manage().window().maximize(); //

		driver.get("http://demo.guru99.com/selenium/delete_customer.php");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("123456");
		
		Thread.sleep(2000);
		
		//selenium click
		driver.findElement(By.xpath("//*[@name='submit']")).click();
		Thread.sleep(2000);

		//>>>>>>>>>>>got alert pop up or pop up window === Alert interface
		
		//Alert obj = new Alert(); XXXXXXXXXXXXXXXXX
		
		Alert alert = driver.switchTo().alert();// move from main window to alert window
		 System.out.println( "Before clcik ="+alert.getText());
		 alert.accept();// click ok btn
		Thread.sleep(2000);
		// alert.dismiss();// click cancel btn
		 System.out.println("After click = "+ alert.getText());
		
		driver.quit();
		 


	}

}
