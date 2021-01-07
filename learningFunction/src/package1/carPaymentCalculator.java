package package1;

public class carPaymentCalculator {

	public static void main(String[] args) {
		
		
		double baseprice = 15000; 
		double downpayment = 2000; 
		double fee = 500; 
		double warrenty = 1000; 
		int month = 48; 
		double apr = 3;
		
		double financepayment = (baseprice-downpayment)+fee+warrenty; 
		System.out.println(financepayment);
		
		double totalFinance= financepayment*(apr/100)+financepayment;
		System.out.println(totalFinance);
		
		double monthlyPayment = totalFinance/month;
		System.out.println(monthlyPayment);
		

	}

}
