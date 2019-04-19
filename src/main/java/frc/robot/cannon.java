/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;

/**
 * Add your docs here.
 */
public class cannon {
    public static Solenoid Cannon;
    public static Joystick driveStick;

    public static void initializeCannon() {
        Cannon = new Solenoid(0);
    }

    public static void runCannon() {
        if(driveStick.getRawAxis(3)==1){
            Cannon.set(true);
            Cannon.set(false);
        }
    }
}
