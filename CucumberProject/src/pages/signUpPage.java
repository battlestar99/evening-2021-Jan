package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUpPage {
	
	WebDriver driver; 
	
	public signUpPage(WebDriver driver) {
		
		this.driver=driver; 
		
	}
	
	
public WebElement getfirstName() {
		
		WebElement x = driver.findElement(By.name("firstName"));
		return x; 
	}

public WebElement getlastName() {
	
	WebElement x = driver.findElement(By.id("usernamereg-lastName"));
	return x; 
}

public WebElement getuserName() {
	
	WebElement x = driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]"));
	return x; 
}

public WebElement getpassword() {
	
	WebElement x = driver.findElement(By.id("usernamereg-password"));
	return x; 
}

}
