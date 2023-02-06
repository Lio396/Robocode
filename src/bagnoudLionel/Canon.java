package bagnoudLionel;

import java.awt.Color;

public class Canon {
	
	private Radar radar;
	
	 Robocop robot = new Robocop();
	 
	 double imShooting;
	 double gunDirection;
	
	public Canon(Robocop robot, Radar radar) {
		this.robot = robot;
		this.radar = radar;
	}
	
	public void shootAtEnemy() {
		imShooting = radar.getRadarDirection();
		System.out.println("I'm shooting at " + imShooting);
		System.out.println("But I'm shooting at " + gunDirection);
		if (gunDirection != imShooting) {
			System.out.println("Were not the same");
			robot.turnGunLeft(imShooting-gunDirection);
			System.out.println("I'll shoot at " + (imShooting-gunDirection));
		}
		if (gunDirection == imShooting) {
			System.out.println("Were the same");
		}
		robot.setBulletColor(Color.red);
		robot.fire(3);
	}
	{
		
	}
	public double getCanonDirection() {
		gunDirection = robot.getGunHeading();	
		return gunDirection;	
	}
}


