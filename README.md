# Reefscape2025
2025 FRC Reefscape robot code

Coral end effector
* Add interface
* Add subsystem
    * Use spark motor control
    * Function foward, reverse, stop
* Add mocksubsystem

## Wants:
* Fall detection: Put robot in safty state if falling.
* low battery LED status
* same battery LED detection



Manual Drive up and Auto place when at distance
 * Do this without the left/right adjust. Just the logic to auto place when you are at a certain distance
 * Setup a VirtualSubsystem for the PhotonVision.
 * Create a new trigger that watches for a specific April Tag( for now ), and then triggers IF we are past a certain threashold.
    We will then use a debounce on the trigger to assure that this has been true for a specific amount of time before we actually place. This will also cancel the action if they drive back.





mode: Int (1-2: "Ranking Point" || "High Score" )
co-op_achieved: Int ( 0-1 )
algae_state: Int (Bitfield)
coral_levels_state: Int (Bitfield)
trough_state: Int ( 0-1 )
l1_override: Int ( 0-1 )
l2_override: Int ( 0-1 )
l3_override: Int ( 0-1 )
l4_override: Int ( 0-1 )
manual_level: Integer ( 1-8: Odds are left, Evens are right. )





Modes: "Ranking Point" || "High Score"
IF High Score, method to get best scoring position
* Input Data
    * HP Station
    * Available Positions
    * Closest Position with the highest point value

* What we need
    * Time from HP to Reef Face
    * Point Value


* Need check to make sure that there is not a coral being seated before moving the elevator.
* Function that gets called when we pull up infront of a face.
* Constant Optimal Function that gets called (Coud be triggered based on Dashboard changes). This would be dispayed to Driver1.



FEATURE:
* Auto adjust left or right when the driver lets go.




Even if you cant build out logic for retuning certain things. You can atleast have it documented how you can really easily. Biggest being the whoop whoop.






* X - Deploy Algae ARM
* A - Either Auto Drives and Grabs Algae OR places coral. Depending on if X is true
* Right Bumper - Spits algae out no matter what position

* Dashboard - Updated to add Barge Button, top algae and bottom algae.






Goals
* Pose2D Logging ( Expected/Current )
* PID Tuning
* Odometry with Red vs Blue
    * Starting Pose and ability to just Drive at the beginning of teleop
* Whoop-Whoop error correction
* Autonoumous



ARM CAN move down IF CEE-Yee is Far Right && ELEVATOR IS DOWN
ARM CAN AlWAYS MOVE UP
CEE-YEE CAN move IF ARM is above/At Home Angle
ELEVATOR CAN move up IF ARM is At Home Angle
ELEVATOR CAN AlWAYS MOVE DOWN



Mock Arm
Run CoralEndEffector
Run Elevator
    Hold Y, Move Arm Down > Elevator Goes Home
    Hold Y with Arm Down > Elevator Doesnt Move
    Hold Y with Arm Down, Move Arm Up > Elevator Moves once arm is safe

Mock Elevator
Mock Ceeyee
Run Arm
    Hold X with Elevator @ home or below > Arm moves down
    Hold X with Elevator higher than home > Arm Shouldnt Move
    Hold X with Elevator @ home, Arm moves down, move ele up > Arm should go home


------------------------------------------------------------


* Setup Manual Camera Lineup

