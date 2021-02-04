package scripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampleTestOne {
	
	@BeforeTest
	public void setupTest() {
	
		System.out.println("This is before Test");
		
	}
	
	
	@BeforeMethod
	public void beforeEachTest() {
		
		System.out.println("This is before method");
		
	}
	
	
	@AfterMethod 
	public void afterEachTest() {
		
		System.out.println("This is after method");
		
	}
	
	@Test(priority=0) 
	  public void validateElement() {
	 
	  System.out.println("This is validate element"); 
	  
	  System.out.println("This is after method");
	  }
	
	@Test(priority=1) 
	public void validateLink() {
		
		System.out.println("This is validate link");
		
	}
	
	@Test(priority=2) 
	public void validatemenu() {
		
		System.out.println("This is validate menu");
		
	}
	
	@AfterTest
	public void finishTest() {
		
		System.out.println("This is after Test");
		
	}
	
	

}
