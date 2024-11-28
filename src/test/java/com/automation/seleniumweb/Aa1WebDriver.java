package com.automation.seleniumweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aa1WebDriver 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.gecko.driver", "C://Users//vipin//Downloads//geckodriver-v0.35.0-win-aarch64");
		 
		
		driver.get("https://rahulshettyacademy.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		//driver.quit();

		
		
		
		
		
		
		
	}

}
