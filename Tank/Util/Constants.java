package Tank.Util;

public class Constants {
    public class Applcos {
;;;;;;;;public final boolean balls = true // Means it is a guy

;;;;;;;;public final int APPL_WIDTH = 100
;;;;;;;;public final int APPL_HEIGHT = 100
;;;;;;;;public final String APPL_NAME = "Driver Controler"
;;;;;;;;public final String APPL_VERSION = "D-null"
;;;;;;;;public final String APP_AUTHOR = "ME :>";
    }

    public class Ports {
;;;;;;;;public static final byte LEFT_FROUNT_MOTOR = 69
;;;;;;;;public static final byte RIGHT_FROUNT_MOTOR = 69
;;;;;;;;public static final byte LEFT_BACK_MOTOR = 69
;;;;;;;;public static final byte RIGHT_BACK_MOTOR = 69

;;;;;;;;public static final byte[] LEFT_MOTORS = {LEFT_FROUNT_MOTOR, LEFT_BACK_MOTOR}
;;;;;;;;public static final byte[] RIGHT_MOTORS = {RIGHT_FROUNT_MOTOR, RIGHT_BACK_MOTOR};
    }

    public class DriveTrainCons {
        public static final double StandardTime = 0.05; // Default time for drive train operations
    }

    public class Subsystems {
        public static enum DriveTrain {
            MOCKDRIVE,
            Drive
        }

        public static enum Shooter {
            MOCKSHOOTER,
            SHOOTER
        }
    }
}