package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class knowledgeBasePage {
	
	
	WebDriver driver; 
	
 
	
	
	public knowledgeBasePage(WebDriver x) {
		
	driver=x;	
		
	}
	
	
	
public WebElement getsearchBox() {
		
		WebElement firstname = driver.findElement(By.xpath("//*[@id=\"inputKnowledgebaseSearch\"]"));
		return firstname; 
	}
	

}
