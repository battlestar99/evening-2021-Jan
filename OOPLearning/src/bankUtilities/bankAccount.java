package bankUtilities;

public class bankAccount {
	
	
	
	public String bankaccountNo; 
	public int amountOfmoney; 
	public String email; 
	public String address; 
	
	public bankAccount(String email) {
		
		//email=x;
		
		this.email=email; 
		System.out.println("constructor with parameter");
		
	}
	
	public bankAccount() {
		
		System.out.println("constructor with no parameter");
	}
	
	
	
	public void depositMoney() {
		
		System.out.println("function with no input");
	}
	
    public void depositMoney(int x) {
		
    	System.out.println("function with  input");
    	withdrawMoney();
	}
	
	
	public void withdrawMoney()
	{
		
		
	}	
	
	public static void getnumberOfcustomers() {
		
		
		
	}

}
