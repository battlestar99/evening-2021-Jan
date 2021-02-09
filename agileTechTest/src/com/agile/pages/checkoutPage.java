package com.agile.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkoutPage {
	
WebDriver driver; 

	
	public checkoutPage(WebDriver x) {
		
	driver=x;	
		
	}
	
public WebElement getcheckoutButton() {
		
		WebElement x = driver.findElement(By.name("firstName"));
		return x; 
	}

public WebElement getcheckoption() {
	
	WebElement x = driver.findElement(By.name("firstName"));
	return x; 
}


}
