package com.automation.seleniumweb;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aa7UpdatedDropDown {

	public static void main(String[] args) throws InterruptedException
	
	{
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		Thread.sleep(1000);
		
	
		
		
		/*
		int i=1;
		
		 
       while (i<5)
    	  
			
		{
			
    	   driver.findElement(By.id("hrefIncAdt")).click();
			
		i++;
		
		}
		*/
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=1;i<5;i++)
			
			
		{
			
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
	
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
		
		driver.close();
		
		
		
		
		
		
		

	

	
	}
	
		
}
