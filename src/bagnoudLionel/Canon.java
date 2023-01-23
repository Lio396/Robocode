package bagnoudLionel;
import robocode.util.*;
import robocode.*;
import java.awt.Color;

public class Canon {
	 Robocop robot = new Robocop();
	 Radar radar = new Radar();

	
	
		public Canon(Robocop robot) {
			 this.robot = robot;
			}
	
	public void turnCannon() {
		robot.turnGunLeft(20);
		robot.fire(1);
		System.out.println("");  
	}
}


