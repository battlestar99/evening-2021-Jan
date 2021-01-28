package Pages.elephant.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	
	
	WebDriver driver; 
	
	public homePage (WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	
	public WebElement getloginButton() {
		
		WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/header/nav/div[1]/div[2]/a[2]"));
		return login; 
	}
	
	public WebElement getQuoteButton() {
		
		WebElement getQuote = driver.findElement(By.xpath("//*[@id=\"header-qj-cta\"]"));
		return getQuote; 
		
	}
	

}
