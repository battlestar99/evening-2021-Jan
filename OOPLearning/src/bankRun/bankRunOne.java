package bankRun;

import bankUtilities.bankAccount;

public class bankRunOne {

	public static void main(String[] args) {
		
		bankAccount jim = new bankAccount("jim@gmail.com");
		
		bankAccount mike = new bankAccount("mike@gmail.com");
		
		bankAccount anik;
		anik=new bankAccount("anik@gmail.com");
		
		anik.address="Virginia";
		
		System.out.println(jim.email);
		System.out.println(anik.email);
		
		bankAccount jordan=new bankAccount();
		
		jordan.depositMoney();
		jordan.depositMoney(12);
		
		bankAccount.getnumberOfcustomers();
		
		jordan.withdrawMoney();
		
		

	}

}
