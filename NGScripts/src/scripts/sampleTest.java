package scripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampleTest {
	
	
	@BeforeTest
	public void setupTest() {
	
		System.out.println("This is before Test");
		
	}
	
	@Test 
	  public void cmainTest() {
	 
	  System.out.println("This is main Test 1"); 
	  }
	
	@Test
	public void bmainTestOne() {
		
		System.out.println("This is main Test 2");
		
	}
	
	
	
	
	@AfterTest
	public void finishTest() {
		
		System.out.println("This is after Test");
		
	}
	
	
	
	  
	 
	
	

}
