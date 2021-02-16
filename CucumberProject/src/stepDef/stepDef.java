package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDef {
	
	WebDriver driver; 

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



	
	
	
	

}
