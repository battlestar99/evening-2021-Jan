package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjectModel.registrarPage;

public class testingTheSignup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse-December\\Libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://phptravels.org/register.php");
		
		//Thread.sleep(10000);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
		
		registrarPage rp = new registrarPage(driver);
		
		WebElement firstname = driver.findElement(By.xpath("//*[@id=\"inputFirstName\"]"));
		firstname.sendKeys("michael");
		
		
		//rp.getfirstName().sendKeys("test");
		
		
		
	}

}
