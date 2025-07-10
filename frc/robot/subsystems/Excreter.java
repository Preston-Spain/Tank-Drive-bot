package frc.robot.subsystems;

import frc.robot.Interface.IExcreter;
import frc.robot.Util.Constants.Ports;

import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.controls.DutyCycleOut; // for setting speed
import com.ctre.phoenix6.controls.PositionDutyCycle; // for setting position
import com.ctre.phoenix6.configs.TalonFXConfiguration; // for configuring the Talon FX


public class Excreter implements IExcreter {
    private static final TalonFX ShooterMotor = new TalonFX(Ports.SHOOTER_MOTOR);

    public static void setSpeed(double speed) {  
        ShooterMotor.setControl(new DutyCycleOut(speed));
    }  
}
