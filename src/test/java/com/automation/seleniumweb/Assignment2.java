package com.automation.seleniumweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args)  
	
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		String name ="Jo";
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("jo@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("password");
		driver.findElement(By.className("form-check-input")).click();
		driver.findElement(By.cssSelector("select[id='exampleFormControlSelect1']")).click();
		WebElement staticDropDown = driver.findElement(By.cssSelector("select[id='exampleFormControlSelect1']"));
		Select dropDown = new Select(staticDropDown);
		dropDown.selectByIndex(1);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("1990-07-26");
		driver.findElement(By.cssSelector("input[class='btn btn-success']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
			
		
	}

}
