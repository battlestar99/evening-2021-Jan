package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahooSignupV1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse-December\\Libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://login.yahoo.com/account/create");

		String title = driver.getTitle();

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		Thread.sleep(2000);
		
		

		WebElement firstName = driver.findElement(By.name("firstName"));
		
		firstName.sendKeys("Michael");
		Thread.sleep(1000);
		//firstName.clear();
		
		Thread.sleep(1000);
		
		 WebElement lastName = driver.findElement(By.id("usernamereg-lastName"));
         lastName.sendKeys("Scott");
             
             Thread.sleep(1000);
		driver.quit();

	}

}
