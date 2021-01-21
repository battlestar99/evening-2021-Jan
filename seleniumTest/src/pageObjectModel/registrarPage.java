package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registrarPage {
	
	WebDriver tdriver; 
	
	
	public registrarPage(WebDriver x) {
		
	tdriver=x;	
		
	}
	
	
	
	public WebElement getfirstName() {
		
		WebElement firstname = tdriver.findElement(By.xpath("//*[@id=\"inputFirstName\"]"));
		return firstname; 
	}
	
public WebElement getlastName() {
		
		WebElement lastname = tdriver.findElement(By.xpath("//*[@id=\"inputLastName\"]"));
		return lastname; 
	}

public WebElement getemail() {
	
	WebElement email = tdriver.findElement(By.xpath("//*[@id=\"inputEmail\"]"));
	return email; 
}



public void something() {
	
	
	//return 12; 
}

}
