package frc.robot.Interface;

public interface IDriveTrain extends ISubsystems {
    public void setSpeed(double speed);

    public void SetSideSpeed(double speed, char side);

    public void SetPivot(double AdjustedDegrees);
}
