package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.DriveWithJoysticks;
import frc.robot.subsystems.Drivetrain;

public class RobotContainer {
    private final Drivetrain m_drivetrain = new Drivetrain();
    private final Joystick m_driverJoystick = new Joystick(0);

    public RobotContainer() {
        configureButtonBindings();
        m_drivetrain.setDefaultCommand(new DriveWithJoysticks(
            m_drivetrain,
            () -> -m_driverJoystick.getY(), // Negative for forward
            () -> m_driverJoystick.getX()
        ));
    }

    private void configureButtonBindings() {
        // Example: a button to stop the robot
        new JoystickButton(m_driverJoystick, 1).whenPressed(m_drivetrain::stop);
    }
}
