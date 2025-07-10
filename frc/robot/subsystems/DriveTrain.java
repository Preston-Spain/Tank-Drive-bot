package Tank.subsystems;

import Interface.IDriveTrain;
import Tank.Util.Constants.Ports;

import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.controls.DutyCycleOut; // for setting speed
import com.ctre.phoenix6.controls.PositionDutyCycle; // for setting position
import com.ctre.phoenix6.configs.TalonFXConfiguration; // for configuring the Talon FX

public class DriveTrain implements IDriveTrain {
    private final TalonFX LEFT_FROUNT_MOTORS = new TalonFX(Ports.LEFT_MOTORS[0]);
    private final TalonFX RIGHT_FROUNT_MOTOR = new TalonFX(Ports.RIGHT_MOTORS[0]);
    private final TalonFX LEFT_BACK_MOTORS   = new TalonFX(Ports.LEFT_MOTORS[1]);
    private final TalonFX RIGHT_BACK_MOTOR   = new TalonFX(Ports.RIGHT_MOTORS[1]);
    
    public DriveTrain() {
        // Motors
    }

    public static void setSpeed(double speed) {
        // Set speed for all motors
        LEFT_FROUNT_MOTORS.setControl(new DutyCycleOut(speed));
        LEFT_BACK_MOTORS.setControl(new DutyCycleOut(speed));
        RIGHT_FROUNT_MOTOR.setControl(new DutyCycleOut(speed));
        RIGHT_BACK_MOTOR.setControl(new DutyCycleOut(speed));
    }

    public static void SetSideSpeed(double speed, char side) {
            if (side == 'L' || side == 'l') {
                // Set speed for left motors
                LEFT_FROUNT_MOTORS.setControl(new DutyCycleOut(speed));
                LEFT_BACK_MOTORS.setControl(new DutyCycleOut(speed));
            } else if (side == 'R' || side == 'r') {
                // Set speed for right motors
                RIGHT_FROUNT_MOTOR.setControl(new DutyCycleOut(speed));
                RIGHT_BACK_MOTOR.setControl(new DutyCycleOut(speed));
            } else if (side == 'B' || side == 'b') {
                setSpeed(speed);
            } else {
                throw new IllegalArgumentException("Invalid side specified. Use 'L' or 'R'.");
            }
    }

    public static void SetSidePos(double speed, char side) {
        if (side == 'L' || side == 'l') {
            // Set speed for left motors
            LEFT_FROUNT_MOTORS.setControl(new PositionDutyCycle(speed));
            LEFT_BACK_MOTORS.setControl(new PositionDutyCycle(speed));
        } else if (side == 'R' || side == 'r') {
            // Set speed for right motors
            RIGHT_FROUNT_MOTOR.setControl(new PositionDutyCycle(speed));
            RIGHT_BACK_MOTOR.setControl(new PositionDutyCycle(speed));
        } else if (side == 'B' || side == 'b') {
            setSpeed(speed);
        } else {
            throw new IllegalArgumentException("Invalid side specified. Use 'L' or 'R'.");
        }
}

    public static void SetPivot(double UnadjustedDegrees) {
        //TODO: implement real adjuster
        double UnadjustedFactor = 1.0;
        // Degrees should be adjusted for the real postion of the Body, not the position of the motor "mickey mouse thats me oklahoma where the wind comes sweeping down the plains"
        double ADJDegree = UnadjustedFactor * UnadjustedDegrees; // Adjusted degrees based on some factor
        SetSideSpeed(ADJDegree, 'l');
        SetSideSpeed(ADJDegree, 'r');
    }
}
