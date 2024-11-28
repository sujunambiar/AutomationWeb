package com.automation.seleniumweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Assignment7 {

	public static void main(String[] args) 
	
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js=  (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,690)");
		
		List<WebElement> rows = driver.findElements(By.cssSelector("table[name ='courses'] tr"));
		
		System.out.println("Number of rows "+ rows.size());
			
		System.out.println("Number of columns " + driver.findElements(By.xpath("//table/tbody/tr[1]/th")).size());
			
		System.out.println( driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[3]")).getText());
				
				
		
		/*
		 


WebDriver driver=new ChromeDriver();



driver.get("http://qaclickacademy.com/practice.php");



WebElement table=driver.findElement(By.id("product"));



System.out.println(table.findElements(By.tagName("tr")).size());



System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());



List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));



System.out.println(secondrow.get(0).getText());



System.out.println(secondrow.get(1).getText());



System.out.println(secondrow.get(2).getText());

}

}




		 */
	}
		
}

