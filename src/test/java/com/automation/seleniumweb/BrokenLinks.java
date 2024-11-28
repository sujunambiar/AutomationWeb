package com.automation.seleniumweb;



import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	

	public static void main(String[] args) throws IOException, IOException 
	
	{

		WebDriver driver = new ChromeDriver ();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		/*HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respCOde= conn.getResponseCode();
		System.out.println(respCOde);
		
		
		
        List<WebElement> links = driver.findElements(By.cssSelector("li a"));
        
        for(i=0; i<links.size;i++)
        	
        	//get all the links
        	//check if each and every is working
        	//if not show error code
        	HttpURLConnection conn= (HttpURLConnection)new URL(links).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCOde= conn.getResponseCode();
			System.out.println(respCOde);
        	
        {
        	
        	
        }
		*/

}
}