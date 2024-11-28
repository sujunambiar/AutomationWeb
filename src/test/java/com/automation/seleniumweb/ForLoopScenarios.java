package com.automation.seleniumweb;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class ForLoopScenarios {

	public static void main(String[] args)
	

	
	{ 
        /*
		//1) Iterating Over a List of Web Elements
		//Java Example:
		//	When you want to interact with a list of elements (e.g., buttons, links, checkboxes), you can use a for loop to iterate over the list.
		
		    
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://example.com");

		        // Find all buttons on the page
		        List<WebElement> buttons = driver.findElements(By.tagName("button"));

		        // Use a for loop to iterate over the list of buttons
		        for (WebElement button : buttons) {
		            System.out.println(button.getText()); // Print the text of each button
		            button.click(); // Click each button (use carefully)
		            
		              *****************************************************************
		               
		              2) For Loop With Index
						If you need the index of each element as you iterate over a collection (e.g., to perform actions on specific elements), you can use an index-based for loop.
		               driver.get("https://example.com");

        			// Find all links on the page
        			List<WebElement> links = driver.findElements(By.tagName("a"));

        			// Iterate with an index
        			for (int i = 0; i < links.size(); i++)
        	
        	 	{
            			WebElement link = links.get(i);
            		System.out.println("Link " + (i + 1) + ": " + link.getText()); // Print link number and text
		             
		             
		             
		             3) For Loop With a Conditional (Filtering)
				You can use for loops with a condition (like an if statement) to filter elements you want to interact with.
				List<WebElement> links = driver.findElements(By.tagName("a"));

        	// Iterate and only interact with specific links
        	for (WebElement link : links) {
            if (link.getText().contains("Contact")) {
                link.click(); // Click on links that contain the word "Contact"
                break; // Optionally break after finding the link
                
                
                
                
                ********************************************
               4)  For Loop With a List of Specific Element Identifiers
                
			You may also want to loop through a predefined list of specific element locators (like CSS selectors or XPath expressions).
  			List<String> selectors = Arrays.asList("button#submit", "input#email", "a#contact");

        	// Iterate over the list of selectors
        	for (String selector : selectors) {
            WebElement element = driver.findElement(By.cssSelector(selector));
            System.out.println(element.getText()); // Perform actions on each element
            
            
            
            
           5)  Nested For Loops (Iterating Through Tables or Nested Elements)
	You might need a nested for loop when working with tables or any nested HTML structure, such as a list of items within a list.
	 List<WebElement> rows = table.findElements(By.tagName("tr"));

        // Iterate through the rows
        for (WebElement row : rows) {
            // Get all columns in the current row
            List<WebElement> columns = row.findElements(By.tagName("td"));
            for (WebElement column : columns) {
                System.out.println(column.getText());
        }

		   
		           
		            
		            
		            
		        }

		        driver.quit();
		          */
		    }
		

	}


		            
