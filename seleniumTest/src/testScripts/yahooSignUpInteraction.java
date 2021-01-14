package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahooSignUpInteraction {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse-December\\Libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://login.yahoo.com/account/create");
		
		WebElement button = driver.findElement(By.id("reg-submit-button"));
		WebElement helplink = driver.findElement(By.linkText("Help"));
		
		boolean display = button.isDisplayed();
		boolean enable = button.isEnabled();
		String buttonText = button.getText();
		String helptext = helplink.getText();
		
		System.out.println(display);
		System.out.println(enable);
		System.out.println(buttonText);
		System.out.println(helptext);

	}

}
