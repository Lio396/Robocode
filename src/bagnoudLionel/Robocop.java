package bagnoudLionel;


// https://courses.cs.duke.edu/cps097s/fall05/assign/robocode/doc/robocode/Robot.html

import java.awt.Color;
import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;
import robocode.WinEvent;
import robocode.BulletHitEvent;


public class Robocop extends AdvancedRobot {
	private Tank tank;
	private Canon canon;
	private Radar radar;
	


	
	public void run() {
		// Initialization
		
		
		int turn = 0;
		//setAdjustGunForRobotTurn(true);
		//setAdjustRadarForGunTurn(true);
		
		tank = new Tank(this); 
		radar = new Radar(this);
		canon = new Canon(this,radar);
		
		while (true) {
			// One iteration per turn
			turn++;
			System.out.println("Turn " + turn);
			setColors(Color.black,Color.black,Color.blue);
			radar.turnRadar();
			setColors(Color.black,Color.black,Color.red);
			// Perform any actions we planned this turn
			execute();
		}
	}
	
	public void onScannedRobot(ScannedRobotEvent event) {
		radar.getRadarDirection();
		canon.getCanonDirection();
		canon.shootAtEnemy();
		tank.move();
	}
	

	public void onWin(WinEvent e) {
		// Victory dance
	}
		
}
