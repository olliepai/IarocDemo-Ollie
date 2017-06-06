package Assignments;

import java.io.IOException;

import org.jointheleague.ecolban.rpirobot.IRobotAdapter;
import org.jointheleague.ecolban.rpirobot.IRobotInterface;
import org.jointheleague.ecolban.rpirobot.SimpleIRobot;

public class AssignmentCode extends IRobotAdapter {
	Sonar sonar = new Sonar();
	
	public AssignmentCode(IRobotInterface iRobot) {
		super(iRobot);
	}

	public static void main(String[] args) throws Exception {
		System.out.println("Try event listner, rev Monday 2030");
		IRobotInterface base = new SimpleIRobot();
		AssignmentCode rob = new AssignmentCode(base);
		rob.setup();
		while(rob.loop()){}
		//rob.shutDown();
		
	}

	private void setup() throws Exception {
		//SETUP CODE GOES HERE!!!!!\

	}
	
	private boolean loop() throws Exception{
		//LOOP CODE GOES HERE!!!!!
		
		readSensors(100);
		
		//if the sensors don't detect anything, they return 0
		//otherwise they return some positive integer
		//the higher the integer the closer the object
	
		driveDirect(200, 400);
		Thread.sleep(9000);
		driveDirect(400, 200);
		Thread.sleep(9000);
		
		return true;
	}
	
	private void sleep(int amt){
		try {
			Thread.sleep(amt);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void shutDown() throws IOException {
		reset();
		stop();
		closeConnection();
	}
}