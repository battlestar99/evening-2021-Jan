package webTesting;

public class mainRun {

	public static void main(String[] args) {
	
		
		webDriver driver=new chromeDriver();
		
		webDriver driver1=new firefoxDriver();
		
		webDriver driver2=new IEDriver();
		
		driver.sendkeys();
		
		driver1.sendkeys();
		
		driver.sendkeys();

	}

}
