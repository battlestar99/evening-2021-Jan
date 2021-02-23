package webTesting;

public class firefoxDriver implements webDriver {

	@Override
	public void sendkeys() {
		System.out.println("sendkey in firefoxDriver");
		
	}

	@Override
	public void findlement() {
		System.out.println("findlement in chromedriver");
		
	}

}
