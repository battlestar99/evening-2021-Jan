package package1;

import java.util.Scanner;

public class carPaymentVersion2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter the base price of the car");
		double baseprice = sc.nextDouble();
		System.out.println("Enter the down payment of the car");
		double downpayment = sc.nextDouble(); 
		double fee = 500; 
		double warrenty = 1000; 
		
		System.out.println("Enter the months for financing");
		int month = sc.nextInt(); 
		System.out.println("Enter the Credit score");
		
		
		carUtility obj = new carUtility ();
		
		obj.getApr(760);
		
		double apr = obj.getApr(670); 
		
		
		
		
		double financepayment = (baseprice-downpayment)+fee+warrenty; 
	//	System.out.println(financepayment);
		
		double totalFinance= financepayment*(apr/100)+financepayment;
		System.out.println("Total price of the car");
		System.out.println(totalFinance);
		
		double monthlyPayment = totalFinance/month;
		System.out.println("Your monthyly payment is");
		System.out.println(monthlyPayment);

	}

}
