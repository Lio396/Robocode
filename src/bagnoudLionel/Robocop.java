package bagnoudLionel;


// https://courses.cs.duke.edu/cps097s/fall05/assign/robocode/doc/robocode/Robot.html

import java.awt.Color;
import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;
import robocode.WinEvent;
import robocode.util.Utils;
import robocode.BulletHitEvent;


public class Robocop extends AdvancedRobot {
	private Tank tank;
	private Canon canon;
	private Radar radar;
	
	private boolean enemyDetection = false;
	private double degrees;
	


	
	public void run() {
		// Initialization
		
		
		int turn = 0;
		//setAdjustGunForRobotTurn(true);
		//setAdjustRadarForGunTurn(true);
		
		tank = new Tank(this); 
		canon = new Canon(this);
		radar = new Radar(this);
		
		while (true) {
			// One iteration per turn
			turn++;
			System.out.println("Turn " + turn);	
			setColors(Color.black,Color.black,Color.blue);
			radar.turnRadar();
			radar.getRadarDegrees();
			System.out.println(degrees);
			canon.turnCannon();
			setColors(Color.black,Color.black,Color.red);
			// Perform any actions we planned this turn
			execute();
		}
	}
	
	

	
	public void onWin(WinEvent e) {
		// Victory dance
	}
	/* public void onBulletHit(BulletHitEvent event) {
	     out.println("I hit " + event.getName() + "!");
	     ahead(20);
	     setTurnLeft(45);
			//go forward
	   }*/
}
