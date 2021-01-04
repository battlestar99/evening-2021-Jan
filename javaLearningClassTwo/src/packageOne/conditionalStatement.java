package packageOne;

public class conditionalStatement {

	public static void main(String[] args) {
		
		int x = 105 ; 
		
		int y=176; 
		
		boolean flag = x>y;
		boolean flag1= y>x;
		
		if(flag) {
			
		System.out.println("x is greater than y");	
			
		}
		
		
		
		if(flag1) {
		
			System.out.println("Y is greater than x");
			
		}
		
		else {
			
			System.out.println("This is the else statement");
			
		}

	}

}
