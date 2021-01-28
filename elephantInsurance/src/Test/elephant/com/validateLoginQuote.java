package Test.elephant.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validateLoginQuote {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse-December\\Libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.elephant.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           
		
		WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/header/nav/div[1]/div[2]/a[2]"));
		
		boolean logindisplay = login.isDisplayed();
		boolean loginenabled = login.isEnabled();
		String loginText = login.getText();
		
		System.out.println(logindisplay);
		System.out.println(loginenabled);
		System.out.println(loginText);
		
		
	}

}
