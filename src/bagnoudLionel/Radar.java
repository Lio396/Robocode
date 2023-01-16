package bagnoudLionel;


public class Radar {
	private double radarDirection;
	private Robocop robot;
	
	Robocop robocop = new Robocop();
	
	public Radar(Robocop robot) {
		 this.robot = robot;
		}
	
	
	
	public void turnRadar() {
			robot.turnRadarLeft(90.0);
			System.out.println("I'm scannin'");
			}

	
	public double getRadarDegrees(double radarDirection) {
			radarDirection = robot.getRadarHeading();
			this.radarDirection = radarDirection;
			return radarDirection;
			}
	
	}
	

