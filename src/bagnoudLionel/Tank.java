package bagnoudLionel;

import java.util.Random;

public class Tank{
	private Robocop robot;
	
	public Tank(Robocop robot) {
		this.robot = robot;
}
	public void move(){
		Random rand = new Random(); //instance of random class
	    int upperbound = 10;
	      	//generates random values from 0-10
	    int int_random = rand.nextInt(upperbound);
	    if (int_random == 0) {
	    	//go forward
	  	  robot.ahead(200);
	    }
		if (int_random == 1) {
			//go backward
			robot.back(100);
		}
		if (int_random == 2) {
			// Turn 
			robot.setTurnRight(90);
			//go forward
			robot.ahead(200);  
		}
		if (int_random == 3) {
			// Turn 
			robot.setTurnRight(-90);
			//go forward
			robot.ahead(100); 
		}	
		if (int_random == 4) {
			//go backward
			robot.back(200);
		}
		if (int_random == 5) {
			// Turn 
			robot.setTurnRight(120);
			//go forward
			robot.ahead(50);  
		}
		if (int_random == 6) {
			// Turn 
			robot.setTurnRight(30);
			//go backward
			robot.back(200); 
		}	
		if (int_random == 7) {
			robot.back(200);
		}
		if (int_random == 8) {
			// Turn 
			robot.setTurnRight(95);
			//go backward
			robot.back(550);  
		}
		if (int_random == 9) {
			// Turn 
			robot.setTurnRight(-130);
			//go forward
			robot.ahead(500); 
		}		      
		
}
	

}

