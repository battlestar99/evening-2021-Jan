package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahooSignUp {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse-December\\Libraries\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://login.yahoo.com/account/create");

String title = driver.getTitle();

driver.manage().deleteAllCookies();

driver.manage().window().maximize();

Thread.sleep(2000);

driver.findElement(By.name("firstName")).sendKeys("Michael");
Thread.sleep(1000);
driver.findElement(By.id("usernamereg-lastName")).sendKeys("Scott");
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]")).sendKeys("mscott");
Thread.sleep(1000);
driver.findElement(By.id("usernamereg-password")).sendKeys("dsfjsadfjkl++");
Thread.sleep(1000);
driver.quit();



		
		
		

	}

}
