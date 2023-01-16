package bagnoudLionel;

import java.awt.Color;

public class Canon {

	private Radar radar;
	private Canon canon;
	private double targetDirection;
	private Robocop robot;
		
	
	public Canon(Robocop robot) {
		 this.robot = robot;
		}
	
	public void turnCannon() {
		robot.turnGunLeft(20);
		robot.setColors(Color.black,Color.black,Color.orange);
		robot.setColors(Color.black,Color.black,Color.red);
		robot.fire(1);
	}
}


