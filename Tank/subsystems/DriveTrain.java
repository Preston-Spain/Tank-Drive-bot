package Tank.subsystems;

import Interface.IDriveTrain;

public class DriveTrain implements IDriveTrain {
    private final Object LEFT_MOTORS = new Object(Ports.LEFT_MOTORS);
    private final Object RIGHT_MOTOR = new Object(Ports.RIGHT_MOTORS);
    
    public DriveTrain() {
        // Motors
    }

    public void setSpeed(double speed) {
        // Set speed for all motors
        for (Object motor : LEFT_MOTORS) {
            // Set speed for each left motor
        }
        for (Object motor : RIGHT_MOTOR) {
            // Set speed for each right motor
        }
    }

    public void SetSideSpeed(double speed, char side) {
        if (side == 'L' || side == 'l') {
            // Set speed for left motors
            for (Object motor : LEFT_MOTORS) {
                // Set speed for each left motor
            }
        } else if (side == 'R' || side == 'r') {
            // Set speed for right motors
            for (Object motor : RIGHT_MOTOR) {
                // Set speed for each right motor
            }
        } else if (side == 'B' || side == 'b') {
            setSpeed(speed);
        } else {
            throw new IllegalArgumentException("Invalid side specified. Use 'L' or 'R'.");
        }
    }

    public void SetPivot(double AdjustedDegrees) {
        // Degrees should be adjusted for the real postion of the Body, not the position of the motor mickey mouse thats me oklahoma where the wind comes sweeping down the plains
    }
}
