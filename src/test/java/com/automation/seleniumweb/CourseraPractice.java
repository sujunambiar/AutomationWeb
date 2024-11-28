package com.automation.seleniumweb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CourseraPractice {

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.coursera.org/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerDriver= driver.findElement(By.className("page-footer-container"));
		
		System.out.println("The number of links present in the footer section is "+ footerDriver.findElements(By.tagName("a")).size());
		
		WebElement sectionDriver= driver.findElement(By.className("css-i75m7l"));
		
		System.out.println("The number of links present in the section  is "+ sectionDriver.findElements(By.tagName("a")).size());
		
		
	}

}
