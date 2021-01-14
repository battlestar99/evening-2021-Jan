package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class yahooDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse-December\\Libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://login.yahoo.com/account/create");
		
          Thread.sleep(2000);
          
         WebElement monthdd =  driver.findElement(By.xpath("//*[@id=\"usernamereg-month\"]"));
         
         Select mdd = new Select(monthdd);
         
         mdd.selectByVisibleText("June");
         
         WebElement countrydd =  driver.findElement(By.xpath("//*[@id=\"regform\"]/div[3]/div[2]/div/select"));
         
         Select cdd = new Select(countrydd );
         
         cdd.selectByIndex(15);
         
         
         
		
	}

}
