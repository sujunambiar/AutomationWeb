package com.automation.seleniumweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Pagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Scenario check for the price of rice which is in a different page
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.cssSelector("a[href='#/offers']")).click();

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();

		String parentWindow = it.next();
		String childWindow = it.next();

		driver.switchTo().window(childWindow);

		// click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();

		// capture all WebElements into List
		
				List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
		

		// capture text of all WebElements into new (original) list
		List<String> originalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());

		// sort on the original list of step 3-> sorted list

		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

		// compare original list vs sorted list

		Assert.assertTrue(originalList.equals(sortedList));
		
		//Scenario 2: Get price of each vegetable
		
		//Scan the name column with getText-> Beans->print the price of the Beans
		
		List<String>price;
		do 
		
		
		{
		List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
		price = rows.stream().filter(s->s.getText().contains("Rice")).
		map(s ->getPriceVeggie(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
	
	
		if(price.size()<1)
		{
			
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		
	}while (price.size()<1);
		
	}

	
	private static String getPriceVeggie(WebElement s) 
	
	{
		// TODO Auto-generated method stub
		
	String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		
		return priceValue ;
	}



}
