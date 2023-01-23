package bagnoudLionel;

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
			if (enemySpotted) {
				radarDirection = robot.getRadarHeading();
				System.out.println("radarDirection " + radarDirection + " and enemySpotted is " + enemySpotted);
				enemySpotted = false;
			}
			robot.turnRadarLeft(90.0);
	}
	
	public void setEnemySpotted(boolean enemySpotted) {
		this.enemySpotted = enemySpotted;
	}
	
}
