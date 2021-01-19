package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse-December\\Libraries\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		
		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		String title = driver.getTitle();
		
		WebElement lite = driver.findElement(By.linkText("Facebook Lite"));

		lite.click();
		
		Thread.sleep(2000);

	}

}
