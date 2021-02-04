package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.yahooSignUP;

public class yahooTest {
	
	
WebDriver driver;
yahooSignUP ys; 
	
	@BeforeTest
	public void setupTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse-December\\Libraries\\chromedriver.exe");
		driver = new ChromeDriver();
        ys = new yahooSignUP(driver);

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
	
		boolean firstNamepresent = ys.getfirstName().isDisplayed();
	
		boolean lastNamepresent=ys.getlastName().isDisplayed();
	
		boolean UserNamepresent=ys.getuserName().isDisplayed();
		
		boolean Userpasspresent = ys.getpassword().isDisplayed();
	
		// add the code 
	}
	
	@Test(priority=1)
	public void validateForm() throws InterruptedException {
		
		ys.getfirstName().sendKeys("Michael");
		Thread.sleep(1000);
		ys.getlastName().sendKeys("Scott");
		Thread.sleep(1000);
		ys.getuserName().sendKeys("mscott");
		Thread.sleep(1000);
		ys.getpassword().sendKeys("dsfjsadfjkl++");
		Thread.sleep(1000);
		
		
	}
	


}
