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
		robot.turnRadarLeft(90);
	}
	
	public double getRadarDirection() {
			radarDirection = robot.getRadarHeading();	
			return radarDirection;
			
	}
	
	
	public double setRadarDirection (double radarDirection) {
		this.radarDirection = radarDirection;
		return radarDirection;
	}
}

