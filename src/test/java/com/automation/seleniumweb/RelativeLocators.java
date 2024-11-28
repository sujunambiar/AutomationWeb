package com.automation.seleniumweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement a = driver.findElement(By.className("form-control"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(a)).getText());//copy paste static package for Relative locators
		
		WebElement b = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(b)).click();		
		
		
		WebElement c = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(c)).click();
	
		WebElement d = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(d)).getText());
		

	}

}
