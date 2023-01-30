package bagnoudLionel;



public class Canon {
	
	private Radar radar;
	
	 Robocop robot = new Robocop();
	 
	 double imShooting;
	
	public Canon(Robocop robot, Radar radar) {
		this.robot = robot;
		this.radar = radar;
	}
	
	public void shootAtEnemy() {
		imShooting = radar.getRadarDirection();
		System.out.println("I'm shooting at " + imShooting);
		robot.setTurnGunLeft(imShooting);
		
	}
}


