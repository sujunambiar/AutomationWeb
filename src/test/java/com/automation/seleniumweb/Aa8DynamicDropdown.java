package com.automation.seleniumweb;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aa8DynamicDropdown {

	public static void main(String[] args) throws InterruptedException
	
	
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		//calendar current date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		//checking if calendar is enabled before selecting round trip(should be false but appearing as true)
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		
		//checking "is enabled" with style attribute
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		//selecting round trip
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		//checking "is enabled" with style attribute
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
			
		{
			
			
			System.out.println("its enabled");
			
			Assert.assertTrue(true);
		}
		
		else
			
		{
			
			Assert.assertTrue(false);
		}
		
		//checking if calendar is enabled after selecting round trip (should be true)
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		
		
		driver.close();
		
	}

}
