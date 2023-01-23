package bagnoudLionel;

import robocode.ScannedRobotEvent;

public class Radar {
	private Robocop robot;
	private double radarDirection;
	private boolean enemySpotted = false;
	

	
	public Radar() {
	}
	
	
	Robocop robocop = new Robocop();
	
	public Radar(Robocop robot) {
		 this.robot = robot;
		}
	
	
	public void turnRadar() {
			robot.turnRadarLeft(90.0);
				radarDirection = robot.getRadarHeading();
				enemySpotted = true;
				System.out.println("radarDirection " + radarDirection + " and enemySpotted is " + enemySpotted);
			}

	//Getter
	public double getRadarDegrees() {
		return radarDirection;
			}

	//Setter
	public void setRadarDegrees(double radarDirection) {
		this.radarDirection = radarDirection;
	}
	
	public void onScannedRobot(ScannedRobotEvent event) {
		turnRadar();
		
	}
	
}
