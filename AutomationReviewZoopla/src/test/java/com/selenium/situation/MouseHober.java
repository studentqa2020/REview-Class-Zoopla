package com.selenium.situation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.util.Highlighter;

public class MouseHober {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting
		driver.manage().window().maximize();
		driver.get("https://www.costco.com/");
		WebElement membership = driver.findElement(By.xpath("(//*[@class='nav-item'])[4]"));
		Actions a = new Actions(driver);
		a.moveToElement(membership).perform();
		Highlighter.getcolor(driver, membership);//static
		
		
		

	}

}
