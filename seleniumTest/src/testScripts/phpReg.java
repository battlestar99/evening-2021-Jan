package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class phpReg {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse-December\\Libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://phptravels.org/register.php");
		
		//Thread.sleep(10000);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement firstname = driver.findElement(By.xpath("//*[@id=\"inputFirstName\"]"));

		firstname.sendKeys("Michael");
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement streetaddress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"inputAddress2\"]")));
	}

}
