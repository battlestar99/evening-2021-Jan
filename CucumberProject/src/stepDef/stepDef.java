package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.signUpPage;

public class stepDef {
	
	WebDriver driver; 
	signUpPage sp; 

	@Before("@uat")
	public void beforeFeature() {
	
		System.out.println("before hook");
		
		
	}
	
	@After("@uat")
	public void afterFeature() {
		
		System.out.println("after hook");
		
	}
	
	
	
	
	
	
	
	@Then("^lmn$")
	public void lmn()  {
		System.out.println("This is lmn");
	}
	
	
	@Given("^abc$")
	public void abc()  {
	   
		System.out.println("This is abc");
	}

	@When("^xyz$")
	public void xyz() {
		System.out.println("This is xyz");
	}

	@When("^yz$")
	public void yz() throws Throwable {
		System.out.println("This is yz");
	}
	
// -----------------------------------------------------------	
	@Given("^user is on the signup page$")
	public void user_is_on_the_signup_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse-December\\Libraries\\chromedriver.exe");
		driver = new ChromeDriver();
 

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://login.yahoo.com/account/create");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}

	@When("^user can interact with the firstname$")
	public void user_can_interact_with_the_firstname()  {
		boolean firstNamepresent = driver.findElement(By.name("firstName")).isDisplayed();	
	}

	@When("^user can interact with last name$")
	public void user_can_interact_with_last_name()  {
		boolean lastNamepresent=driver.findElement(By.id("usernamereg-lastName")).isDisplayed();
	}

	@When("^user can select a month$")
	public void user_can_select_a_month()  {
		boolean UserNamepresent=driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]")).isDisplayed();
	}

	@When("^user can select a day$")
	public void user_can_select_a_day()  {
		boolean Userpasspresent = driver.findElement(By.id("usernamereg-password")).isDisplayed();  
	}

	@When("^user can select a year$")
	public void user_can_select_a_year() {
	  
	}

	@Then("^user should be able to sign up for new account$")
	public void user_should_be_able_to_sign_up_for_new_account()  {
	  
	}

// -------------------------------------------------------
	
	
	@Given("^the mozila browser is open$")
	public void the_mozila_browser_is_open() {
	   
		System.out.println("mozila browser is open");
	}

	@When("^user navigate to the application$")
	public void user_navigate_to_the_application()  {
		System.out.println("user navigate to the application");
	}

	@Then("^user should be able to see application home page$")
	public void user_should_be_able_to_see_application_home_page()  {
		System.out.println("user should be able to see the homepage");
	}

	@Given("^the chrome browser is open$")
	public void the_chrome_browser_is_open() {
		System.out.println("chrome  browser is open");
	}

	@Given("^the browser is open$")
	public void the_browser_is_open()  {
	   
		System.out.println("The browser is open");
	}

	@When("^user goes to the website$")
	public void user_goes_to_the_website() throws Throwable {
		System.out.println("user goes to the website");
	}

	@Then("^user should be able to buy products$")
	public void user_should_be_able_to_buy_products() throws Throwable {
		System.out.println("user should be able to buy products");
	}

	@When("^user goes to the sign up page$")
	public void user_goes_to_the_sign_up_page() throws Throwable {
		System.out.println("user goes to the sign up page");
	}

	@Then("^user should be able to sign up for new accounts$")
	public void user_should_be_able_to_sign_up_for_new_accounts() throws Throwable {
		System.out.println("hould be able to sign up for new accounts");
	}

// -----------------------------------------------------
	
	@Given("^user is on the yahoo sign up page$")
	public void user_is_on_the_yahoo_sign_up_page() throws InterruptedException  {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\eclipse-December\\Libraries\\chromedriver.exe");
		driver = new ChromeDriver();
	    sp=new signUpPage(driver);

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://login.yahoo.com/account/create");

		Thread.sleep(3000);
	}

	@When("^user enters firstname$")
	public void user_enters_firstname() throws Throwable {
	   
		driver.findElement(By.name("firstName")).sendKeys("Michael");
		Thread.sleep(1000);
	}

	@When("^user enters last name$")
	public void user_enters_last_name() throws Throwable {
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("Scott");
		Thread.sleep(1000);
	}

	@When("^user enters new email address$")
	public void user_enters_new_email_address() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]")).sendKeys("mscott");
		Thread.sleep(1000);
	}

	@When("^user enters new password$")
	public void user_enters_new_password() throws Throwable {
		driver.findElement(By.id("usernamereg-password")).sendKeys("dsfjsadfjkl++");
		Thread.sleep(1000);
	}

	@Then("^user should see the values in the text boxes$")
	public void user_should_see_the_values_in_the_text_boxes() throws Throwable {
	   
	}
	

@Then("^user should be able to close the browser$")
public void user_should_be_able_to_close_the_browser()  {
   
	driver.quit();
}

// --------------------------------------------------


@When("^user enters firstname \"([^\"]*)\" in the textbox$")
public void user_enters_firstname_in_the_textbox(String arg1) throws InterruptedException  {
	sp.getfirstName().sendKeys(arg1);
	Thread.sleep(1000);
}

@When("^user enters lastname \"([^\"]*)\" in the textbox$")
public void user_enters_lastname_in_the_textbox(String arg1) throws InterruptedException  {
	sp.getlastName().sendKeys(arg1);
	Thread.sleep(1000);
}

@When("^user enters new email \"([^\"]*)\" in the textbox$")
public void user_enters_new_email_in_the_textbox(String arg1) throws InterruptedException  {
   
	sp.getuserName().sendKeys(arg1);
	Thread.sleep(1000);
	
	
}

@When("^user enters new password \"([^\"]*)\" in the textbox$")
public void user_enters_new_password_in_the_textbox(String arg1) throws InterruptedException  {
	sp.getpassword().sendKeys(arg1);
	Thread.sleep(1000);
	
	String expectedResult= "https://login.yahoo.com/account/create"; 
	
	String actualResult = driver.getCurrentUrl();
	
	Assert.assertEquals(expectedResult, actualResult);
}




	
	
	

}
