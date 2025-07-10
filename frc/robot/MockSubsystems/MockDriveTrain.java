package frc.robot.MockSubsystems;

public class MockDriveTrain {
    public void setSpeed(double speed) {
        // Set speed for all motors
        System.out.println("Setting speed for all motors to: " + speed);
    }

    public void SetSideSpeed(double speed, char side) {
        if (side == 'L' || side == 'l') {
            // Set speed for left motors
            System.out.println("Setting speed for all left motors to: " + speed);
        } else if (side == 'R' || side == 'r') {
            // Set speed for right motors
            System.out.println("Setting speed for all right motors to: " + speed);
        } else if (side == 'B' || side == 'b') {
            setSpeed(speed);
        } else {
            throw new IllegalArgumentException("Invalid side specified. Use 'L' or 'R'.");
        }
    }

    public void SetPivot(double UnadjustedDegrees) {
        //TODO: implement real adjuster
        double UnadjustedFactor = 1.0;
        // Degrees should be adjusted for the real postion of the Body, not the position of the motor "mickey mouse thats me oklahoma where the wind comes sweeping down the plains"
        double ADJDegree = UnadjustedFactor * UnadjustedDegrees; // Adjusted degrees based on some factor
        System.out.println("Setting pivot with adjusted degrees: " + ADJDegree);
    }
}
