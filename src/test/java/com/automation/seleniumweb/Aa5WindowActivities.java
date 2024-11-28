package com.automation.seleniumweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aa5WindowActivities {

	public static void main(String[] args)
	
	{
		// Maximize, minimize, navigate to, navigate back, navigate forward
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://rahulshettyacademy.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		

	}

}
