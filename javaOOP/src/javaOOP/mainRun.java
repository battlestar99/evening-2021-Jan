package javaOOP;

import utility.facebook;

public class mainRun {

	public static void main(String[] args) {
		
		
		// fundamental data types 
		
		int x = 12; 
		String name="michael";
		
		facebook anik=new facebook("fdafd");
		
		// declaretion , and initializtion 
		
		// declaretion
		int abc;
		// intializtion
		abc=100; 
		
		int y = 123; 
		// declaretion
		facebook bolt ; 
		// initialize
		bolt = new facebook("DFAFDAS");
		
		anik.username="anik";
		
		
		facebook michael = new facebook("FDF");
		
		michael.username="mscott";
		
		facebook jon=new facebook("JON@gmail.com");
		
		anik.chat();
	//	anik.getlikeNumber();
		
		michael.chat();
		//michael.getlikeNumber();
		
		facebook.getnumberofuser();
		

	}

}
