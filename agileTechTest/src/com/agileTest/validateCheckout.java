package com.agileTest;


import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.agile.pages.checkoutPage;
import com.agile.pages.homePage;
import com.agile.pages.loginPage;
import com.agile.pages.productPage;

public class validateCheckout {
	
	WebDriver driver;
	homePage hp; 
	checkoutPage cp; 
	productPage pp; 
	loginPage lp;
	Scanner sc; 
	
	
	int x;
	
	
	@BeforeTest
	public void abc() {
		
	int y;
	
	driver=new ChromeDriver();
	hp= new homePage(driver);
	cp=new checkoutPage(driver);
		
		
		
		// pre-requirement of the test	
		
	}
	
	@AfterTest
	public void endTest() {
		
		
	}
	
	@BeforeMethod
	public void beforeerachTest() {
		
		
	}
	
	
	@Test(priority=0)
	public void validatecheckoutWebElement() {
		
	// test for validating web elements 	
		
	}
	
	@Test(priority=1)
	public void validateCheckoutForm() {
		
	// test for validatecheckout form 	
		
	}
	
	
	
	
	

}
