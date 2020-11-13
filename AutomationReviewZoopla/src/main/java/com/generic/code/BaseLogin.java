package com.generic.code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.page.object.model.MasterPageFactoryLoginPage;
import com.util.BaseConfig;
import com.util.Highlighter;

public class BaseLogin {

	public static WebDriver getLogin() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		//implicit wait = HTML loaded
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(BaseConfig.getConfigValue("url"));
		MasterPageFactoryLoginPage pf = new MasterPageFactoryLoginPage(driver);
		pf.getAcceptCookies().click();
		Highlighter.getcolor(driver, pf.getLogin());
		pf.getLogin().click();
		Highlighter.getcolor(driver, pf.getEmail());
		pf.getEmail().sendKeys(BaseConfig.getConfigValue("email"));
		Highlighter.getcolor(driver, pf.getPass());
		pf.getPass().sendKeys(BaseConfig.getConfigValue("pass"));
		Highlighter.getcolor(driver, pf.getSubmit());
		pf.getSubmit().click();
		
		return driver;
	}
}
