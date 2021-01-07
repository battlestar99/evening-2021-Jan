package package1;

public class carUtility {

	
public double getApr(int creditscore) {
		
		double apr =0 ; 
		if(creditscore>750) {
			apr = 1; 
			
		}
		if(creditscore<=750 && creditscore>700) {
			apr = 2; 
			
		}
		
		if(creditscore<=700 && creditscore>600) {
			apr = 3; 
			
		}
		
		return apr; 
		
		
	}
// want to create a function to name 




















}
