package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverTest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse-December\\Libraries\\chromedriver.exe");
	    
		// open up the chromebrowser instance 
		
		WebDriver driver = new ChromeDriver();
		
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://www.facebook.com/");
		
		driver.get("https://www.amazon.com/");

	}

}
