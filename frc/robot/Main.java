package frc.robot;

public final class Main {
    private Main() {}
  
    /**
     * Main initialization function. Do not perform any initialization here.
     *
     * <p>If you change your main robot class, change the parameter type.
     */
    public static void main(String... args) {
      RobotBase.startRobot(Robot::new);
    }
  }