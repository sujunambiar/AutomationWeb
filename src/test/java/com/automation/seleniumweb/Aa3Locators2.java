package com.automation.seleniumweb;

import static org.testng.Assert.assertEquals;


import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aa3Locators2 {

	public static void main(String[] args) throws InterruptedException 
	{
		
	   
		
		String name = "Sujyothi";
		WebDriver driver;
		driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\vipin\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		
		//WebDriver driver = new FirefoxDriver();
		
		
		//System.setProperty("webDiver.Edgedriver", "C:\\Users\\vipin\\Downloads\\edgedriver_win64.exe");
		//WebDriver driver = new EdgeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//calling the method by creating an object
		//Aa3Locators2 pw =new Aa3Locators2();
		//pw.getPassword(driver);
	
		String password =getPassword(driver);
		//or just give getPassword(driver) and change the method type to Static to access from any class.
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
	
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
		
	
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		
		
		
		//1) extract the entire text with password.//getText will extract "Please use temporary password 'rahulshettyacademy' to Login" and assign it to the STring variable passwordText.
		
		String passwordText= driver.findElement(By.cssSelector("form p")).getText();
		
		
		
		
		//2) how to extract "rahulshettyacademy" from the entire text. ' will split at the character ' and split Please use temporary password 'rahulshettyacademy' to Login  into 2 parts
		
		
		//passwordText.split("'");
		//now the above method returns arrays
		//[0] index will have left side-------- Please use temporary password
		//[1] index will have the right side -----'rahulshettyacademy' to Login
		
		//store the string in an array
		
		String [] passwordArray =passwordText.split("'");
		
		//passwordArray[1];
		//now this means the text in 1st index rahulshettyacademy' to Login
		
		//passwordArray[1].split("'")
		
		//Apply split method to the 1st index
		//[0]---rahulshettyacademy
		//[1]----' to Login
		
		 String password= passwordArray[1].split("'")[0];
		 
		 //you can do it all in one line as above; or break it down to 2 linesS as below
		 //String [] passwordArray2=  passwordArray[1].split("'")
		 //String password= passwordArray2[0];
		
		
		return password;
		//change the return type to String
		
	
		
		
		
		
		
		//String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		// int		a		=	10;
		//breakdown of syntax
		//String passwordText; //declare a variable eg int a;
		//passwordText=driver.findElement(By.cssSelector("form p")).getText(); //assign value to variable eg 	a =10
	
		
	}

}
