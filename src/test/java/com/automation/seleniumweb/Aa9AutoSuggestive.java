package com.automation.seleniumweb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aa9AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(2000);
		List<WebElement> options=driver.findElements(By.cssSelector("ul[class='ui-menu-item'] a"));
		for (WebElement option: options)
			
		{
			if (option.getText().equalsIgnoreCase("India"))
					{
				
				option.click();
					}
			break;
				
		}
		
		
		
		

	}

}
