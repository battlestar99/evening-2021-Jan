package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class yahooSignUp {
	
	WebDriver driver; 
	int x; 
	
	
	@BeforeTest
	public void setupTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse-December\\Libraries\\chromedriver.exe");
		driver = new ChromeDriver();
		x = 12; 

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://login.yahoo.com/account/create");

		Thread.sleep(3000);
	}
	
	@Test
	public void mainTest() throws InterruptedException {
		
		driver.findElement(By.name("firstName")).sendKeys("Michael");
		Thread.sleep(1000);
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("Scott");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]")).sendKeys("mscott");
		Thread.sleep(1000);
		driver.findElement(By.id("usernamereg-password")).sendKeys("dsfjsadfjkl++");
		Thread.sleep(1000);
	}
	
	@AfterTest
	public void finishTest() {
		
	//	System.out.println(x);
		driver.quit();
		
	}
	
	

}
