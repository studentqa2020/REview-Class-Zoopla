package com.selenium.situation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindBrokenLink {

	private static WebDriver driver = null;

//	Let see some of the HTTP status codes.
//
//	200  Valid Link
//	404  Link not found
//	400  Bad request
//	401  Unauthorized
//	500  Internal Error
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.softwaretestingmaterial.com");
		// Wait for 5 seconds

		// Used tagName method to collect the list of items with tagName "a"
		// findElements - to find all the elements with in the current page. It returns
		// a list of all webelements or an empty list if nothing matches
		List<WebElement> links = driver.findElements(By.tagName("a"));
		// To print the total number of links
		System.out.println("Total links are " + links.size());
		// used for loop to
		
		int badORbrokenLink =0;
		int goodLink =0;
		int malformlink =0;
		for (int i = 0; i < links.size(); i++) {
			WebElement element = links.get(i);
			// By using "href" attribute, we could get the url of the requried link
			String url = element.getAttribute("href");
			try {
				URL link = new URL(url);
				// Create a connection using URL object (i.e., link)
				HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
				// Set the timeout for 2 seconds
				httpConn.setConnectTimeout(2000);
				// connect using connect method
				httpConn.connect();
				// use getResponseCode() to get the response code.
				if (httpConn.getResponseCode() == 200) {
					System.out.println(url + " - " + httpConn.getResponseMessage());
					goodLink++;
				}
				else if (httpConn.getResponseCode() == 404) {
					System.err.println("**********************");
					System.err.println(url + "  Broken link  " + httpConn.getResponseMessage());
					System.err.println("**********************");
					badORbrokenLink++;
				}else {
					System.err.println("**********************");
					System.err.println(url + " Bad or Broken link  " + httpConn.getResponseMessage());
					System.err.println("**********************");
					badORbrokenLink++;
					
				}
				
				
			}
			// getResponseCode method returns = IOException - if an error occurred
			// connecting to the server.
			catch (Exception e) {
				malformlink++;
				 e.printStackTrace();
			}
			
			
		}
		System.out.println("Total malform link ="+malformlink);
		System.out.println("Total Broken link ="+badORbrokenLink);
		System.out.println("Total good link ="+goodLink);
	}

}
