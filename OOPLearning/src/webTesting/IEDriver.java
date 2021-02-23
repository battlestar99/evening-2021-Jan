package webTesting;

public class IEDriver implements webDriver {

	@Override
	public void sendkeys() {
		System.out.println("sendkey in IEdriver");
		
	}

	@Override
	public void findlement() {
		System.out.println("findelement in iedriver");
		
	}

}
