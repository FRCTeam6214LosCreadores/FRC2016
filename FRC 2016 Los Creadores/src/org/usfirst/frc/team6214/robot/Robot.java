package org.usfirst.frc.team6214.robot;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */

public class Robot extends IterativeRobot {
	RobotDrive myRobot;
	Joystick stick;
	int autoLoopCounter;
	DigitalInput camera;
	Joystick buttons;
	double leftOutput, rightOutput;
	Victor Motor1;
	VictorSP Motor2;
	int channel;
	// This is NEW!!
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	myRobot = new RobotDrive(0,1);
    	stick = new Joystick(0);
    
    	
    }
 
    
    	
   
    /**z
     * This function is run once each time the robot enters autonomous mode
     */
    public void autonomousInit() {
    	autoLoopCounter = 0;
    }

    /**
     * This function is called periodically during autonomous
     */
   /* public void autonomousPeriodic() {
   
    	if(autoLoopCounter < 100) //Check if we've completed 100 loops (approximately 2 seconds)
		{
			myRobot.drive(-0.5, 0.0); 	// drive forwards half speed
			autoLoopCounter++;
			} 
    	/**elseif {stick. 
			myRobot.drive(0.0, 0.0); 	// stop robot
		}
    }
    
    /**
     * This function is called once each time the robot enters tele-operated mode
     */
    
   

    public void teleopPeriodic() {
    	
       myRobot.arcadeDrive(stick);
       
      //Motor1.equals(stick); Motor2.equals(stick);
       // Motor1.set(.7);
        //Motor2.setInverted(isEnabled());
        
        //System.out.println(frontLeft.getSpeed());
       //System.out.println(frontLeft.get());
    
       //System.out.println(stick.getRawAxis(0));
        //System.out.println(stick.getRawAxis(1));
        //System.out.println(stick.getRawButton(1));
       // System.out.println(Motor1.getSpeed());
       // System.out.println(Motor2.getSpeed());
        //System.out.println(stick.getDirectionRadians());
        //System.out.println(stick.getTrigger());
        //System.out.println(stick.getPOV());
        //System.out.println(stick.getButtonCount());
        //System.out.println(stick.getTop());
       //if( Motor1.getSpeed() >= 1.0){
    	 //  Motor1.stopMotor();
       //}
       
       
        
     //   System.out.println(stick.getAxisChannel(Joystick.AxisType));
    }
    public void teleopInit(){
   
   
    		
    		
    		
    	}
    
    /**
     * This function is called periodically during operator control
     */
  
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    	
    	LiveWindow.run();
}
}
