package org.usfirst.frc.team6214.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Buttons.*;
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
	Joystick buttons;
	Victor Motor1;
	Victor Motor2;
	int channel;
	double AccelAmt;
	double DecelAmt;
	double SpeedOut;
	
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	public void robotInit() {
		myRobot = new RobotDrive(0,1);	//This joystick to read forwards/backwrds and L/R
		stick = new Joystick(0);

	}

	/**
	 * z This function is run once each time the robot enters autonomous mode
	 */
	public void autonomousInit() {
		autoLoopCounter = 0;
	}

	/**
	 * This function is called periodically during autonomous
	 */
	/*
	 * public void autonomousPeriodic() {
	 * 
	 * if(autoLoopCounter < 100) //Check if we've completed 100 loops
	 * (approximately 2 seconds) { myRobot.drive(-0.5, 0.0); // drive forwards
	 * half speed autoLoopCounter++; } /**elseif {stick. myRobot.drive(0.0,
	 * 0.0); // stop robot } }
	 * 
	 * /** This function is called once each time the robot enters tele-operated
	 * mode
	 */

	public void teleopPeriodic() {
		if (stick.getRawAxis(1) > SpeedOut)	//Acceleration Logic
		{
			SpeedOut = SpeedOut + AccelAmt;
		}
		else 
		{
			SpeedOut = SpeedOut - DecelAmt;
		}
		if (SpeedOut > 0.6)	//Setting Max speed so It don't go crazy
		{
			SpeedOut = 0.6;
		}
		else if (SpeedOut < -.2)
		{
			SpeedOut = -.2;
		}
		//myRobot.arcadeDrive(SpeedOut,stick.getRawAxis(0));
		myRobot.arcadeDrive(stick.getRawAxis(1),-stick.getRawAxis(0));

		 System.out.println(stick.getRawAxis(0));	//These were't
		 System.out.println(stick.getRawAxis(1));	//	necessary
		 System.out.println("SpeedOut = " + SpeedOut);
	}

	public void teleopInit() {
		AccelAmt = .05;
		DecelAmt = .05;
		SpeedOut = 0;
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
	public void victormotorcontrol() {
		//VictorSP (1&2) are the motors being used
		//VictorSP.motor1
		
	}
} 
