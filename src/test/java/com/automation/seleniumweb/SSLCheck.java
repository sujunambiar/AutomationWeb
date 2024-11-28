package com.automation.seleniumweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Proxy;
import java.util.HashMap;
import java.util.Map;

public class SSLCheck {

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		
		ChromeOptions options =  new ChromeOptions();
		
		options.setAcceptInsecureCerts(true);
	
		
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("myhttpproxy:3337");
		options.setCapability("proxy", proxy);
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);

		
		WebDriver driver = new ChromeDriver (options);
		
		driver.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle());
		
		
		
		

	}

}
