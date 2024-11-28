package com.automation.seleniumweb;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Assignment6 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();

		String a = driver.findElement(By.id("checkBoxOption1")).getText();
		
		//driver.findElement(By.id("dropdown-class-example")).click();

		List<WebElement> options = driver.findElements(By.xpath("//option"));
		
		driver.findElement(By.id("dropdown-class-example")).click();
		for (WebElement option : options)

		{

			if (option.getText() == a)

			{
				option.click();

				// String b =option.getText();
				driver.findElement(By.id("name")).sendKeys(a);

				driver.findElement(By.id("alertbtn")).click();
				String c = driver.switchTo().alert().getText();
				driver.switchTo().alert().accept();

			}
			// assert.assertEquals(c, "Hello Option 1, share this practice page and share
			// your knowledge");

		}

	}

}
