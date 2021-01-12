package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testNavigation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse-December\\Libraries\\chromedriver.exe");
	    
		// open up the chromebrowser instance 
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.facebook.com/";
		
		
		
		driver.get(url);
		
		String title = driver.getTitle();
		String currenturl = driver.getCurrentUrl(); 
		
		System.out.println(title);
		System.out.println(currenturl);
		
		// clicking on facebook lite link
		driver.findElement(By.linkText("Facebook Lite")).click();
		
		title = driver.getTitle(); 
		currenturl= driver.getCurrentUrl();
		
		System.out.println(title);
		System.out.println(currenturl);
		
		Thread.sleep(1000);
		driver.navigate().back();
		
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		driver.quit();
		

	}

}
