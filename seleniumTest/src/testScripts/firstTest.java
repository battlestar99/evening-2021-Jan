package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {

	public static void main(String[] args) throws InterruptedException  {
		

		// setting up property and location for chromedriver 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse-December\\Libraries\\chromedriver.exe");
	    
	// open up the chromebrowser instance 
	
	WebDriver driver = new ChromeDriver();
	
	String url = "http://www.bdlist24.com/demo/";
	
	
	// navigating us to the url specified 
	//driver.get(url);
	
	driver.navigate().to(url);
	
	// deleting all the cookies of the browser 
	driver.manage().deleteAllCookies();
	
	
	driver.manage().window().maximize();
	
	String title = driver.getTitle();
	
	System.out.println(title);
	
	String currentUrl = driver.getCurrentUrl();
	
	
	System.out.println(currentUrl);
	
	// code is halted here for 2 second 
	Thread.sleep(2000);
	
	//driver.close();
	
	driver.quit();
	
	






		

	}

}
