package Test.elephant.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.elephant.com.homePage;

public class validateLoginQuoteV2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse-December\\Libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.elephant.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           
		homePage hp =new homePage(driver);
		
		
		//hp.getloginButton();
		
		boolean logindisplay = hp.getloginButton().isDisplayed();
		boolean loginenabled = hp.getloginButton().isEnabled();
		String loginText = hp.getloginButton().getText();
		
		System.out.println(logindisplay);
		System.out.println(loginenabled);
		System.out.println(loginText);
		
		
		boolean quoteDisplay = hp.getQuoteButton().isDisplayed();
		boolean quotEnabled = hp.getQuoteButton().isEnabled();
		String quoteText = hp.getQuoteButton().getText();
		
		System.out.println(quoteDisplay);
		System.out.println(quotEnabled );
		System.out.println(quoteText);

	}

}
