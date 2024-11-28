package com.automation.seleniumweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5Frames {

	public static void main(String[] args) throws InterruptedException 
	
	
	{
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");	
		driver.findElement(By.linkText("Nested Frames")).click();
		//driver.switchTo().frame(driver.findElement(By.cssSelector("(frameset[frameborder='1']")));
		driver.findElement(By.tagName("frame")).getSize();
		
		System.out.println(driver.findElement(By.id("content")).getText());
		
		
		

	}

}
