package webTesting;

public class chromeDriver implements webDriver {

	@Override
	public void sendkeys() {
		System.out.println("sendkey in chromedriver");
		
	}

	@Override
	public void findlement() {
		System.out.println("findlement in chromedriver");
		
	}

}
