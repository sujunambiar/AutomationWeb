package com.automation.seleniumweb;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) 
	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.className("blinkingText")).click();
		Set<String> windows= driver.getWindowHandles();//[parentID and childID]
		
		Iterator<String> it=windows.iterator();
		String parentID = it.next();
		String childID  = it.next();
		driver .switchTo().window(childID);
		String text = driver.findElement(By.cssSelector(".im-para.red")).getText();
		String emailID = text.split("at")[1].trim().split(" ")[0];
		System.out.println(emailID);
		driver.switchTo().window(parentID);
		driver.findElement(By.id("username")).sendKeys(emailID);
		

		                                              

	}

}
