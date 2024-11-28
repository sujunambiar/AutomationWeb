package com.automation.seleniumweb;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2E {

	public static void main(String[] args) throws InterruptedException
	
	{

		WebDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value='DEL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		//driver.findElement(By.cssSelector("button[type='button']")).click();
		//driver.findElement(By.cssSelector("a[class='ui-state-default.ui-state-highlight']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
			
		{
			System.out.println("its disabled");
			
			Assert.assertTrue(true);
		}
		
		else
			
		{
			
			Assert.assertTrue(false);
		}
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
	
		for (int i=1;i<5;i++)
			
		{
			Thread.sleep(2000);
			driver.findElement(By.id("hrefIncAdt")).click();
				
		}
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
