package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class yahooSignupElement {
	
	
	
	WebDriver driver;
	
	@BeforeTest
	public void setupTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse-December\\Libraries\\chromedriver.exe");
		driver = new ChromeDriver();
 

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		//driver.get("https://login.yahoo.com/account/create");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
	}
	
	@AfterTest
	public void endtest() {
		
		driver.quit();
	}
	
	@BeforeMethod
	public void beforeEachTest() {
		
		driver.get("https://login.yahoo.com/account/create");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	@Test(priority=0)
	public void validateElement() {
	
		boolean firstNamepresent = driver.findElement(By.name("firstName")).isDisplayed();
	
		boolean lastNamepresent=driver.findElement(By.id("usernamereg-lastName")).isDisplayed();
	
		boolean UserNamepresent=driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]")).isDisplayed();
		
		boolean Userpasspresent = driver.findElement(By.id("usernamereg-password")).isDisplayed();
	
		Assert.assertTrue(firstNamepresent);
		Assert.assertTrue(lastNamepresent);
	}
	
	@Test(priority=1)
	public void validateForm() throws InterruptedException {
		
		driver.findElement(By.name("firstName")).sendKeys("Michael");
		Thread.sleep(1000);
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("Scott");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]")).sendKeys("mscott");
		Thread.sleep(1000);
		driver.findElement(By.id("usernamereg-password")).sendKeys("dsfjsadfjkl++");
		Thread.sleep(1000);
		
		String expectedResult= "https://login.yahoo.com/account/"; 
		
		String actualResult = driver.getCurrentUrl();
		
		Assert.assertEquals(expectedResult, actualResult);
		
	}
	

}
