package com.agile.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	
WebDriver driver; 

	
	public homePage(WebDriver x) {
		
	driver=x;	
		
	}
	
public WebElement getproductLink() {
		
		WebElement x = driver.findElement(By.name("firstName"));
		return x; 
	}


}
