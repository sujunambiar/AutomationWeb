package com.automation.seleniumweb;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) 
	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		String name = "rahulshettyacademy";
		driver.findElement(By.id("username")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys("learning");	
		driver.findElement(By.xpath("//input[@value='user']")).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement staticDropdown = driver.findElement(By.cssSelector("select[class='form-control']"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByValue("consult");	
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn-info")));
		String [] phoneList= {"iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry"};
		
		List<WebElement> cart =driver.findElements(By.cssSelector("button.btn-info"));
	
		
		for(int i=0; i<cart.size(); i++)
		{
			
			
			driver.findElements(By.cssSelector("button.btn-info")).get(i).click();
		}
		
		WebDriverWait w2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn-info")));
		
		driver.findElement(By.xpath("//*[@id='navbarResponsive']/ul/li/a")).click();		
		//driver.findElement(By.cssSelector("button.btn-success")).click();
		}
		
		}
			

		
	


