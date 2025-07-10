package frc.robot.Util;

import frc.robot.Util.Constants.Applcos;
import frc.robot.Util.Constants.Subsystems;
import frc.robot.subsystems.DriveTrain;

import java.awt.*;
import java.awt.event.*;
// import java.lang.reflect.feild;

public class APPL extends Frame {
    public APPL() {
        Button Forward = new Button("Forward");
        Button Backward = new Button("Backward");
        Button Left = new Button("Left");
        Button Right = new Button("Right");
        Button Shoot = new Button("Shoot");
        Button RightPivot = new Button("Right Pivot");
        Button LeftPivot = new Button("Left Pivot");

        add(Forward); Forward.setVisible(true);
        add(Backward); Backward.setVisible(true);
        add(Left); Left.setVisible(true);
        add(Right); Right.setVisible(true);
        add(Shoot); Shoot.setVisible(true);
        add(RightPivot); Shoot.setVisible(true);
        add(LeftPivot); Shoot.setVisible(true);

        setTitle(Applcos.APPL_NAME + " " + Applcos.APPL_VERSION + " -" + Applcos.APP_AUTHOR);
        setSize(Applcos.APPL_WIDTH, Applcos.APPL_HEIGHT);
        // setIconImage(getIconImage());

        Shoot.setBounds(Applcos.APPL_WIDTH / 2, Applcos.APPL_HEIGHT / 2, (Applcos.APPL_HEIGHT /10) * 8, (Applcos.APPL_HEIGHT /10) * 3);
        Forward.setBounds((Applcos.APPL_WIDTH  / 2) + 30, Applcos.APPL_HEIGHT / 2, (Applcos.APPL_HEIGHT /10) * 8, (Applcos.APPL_HEIGHT /10) * 3);
        Backward.setBounds((Applcos.APPL_WIDTH / 2) - 30, Applcos.APPL_HEIGHT / 2, (Applcos.APPL_HEIGHT /10) * 8, (Applcos.APPL_HEIGHT /10) * 3);
        Right.setBounds(Applcos.APPL_WIDTH / 2, (Applcos.APPL_HEIGHT) + 30 / 2, (Applcos.APPL_HEIGHT /10) * 8, (Applcos.APPL_HEIGHT /10) * 3);
        Left.setBounds(Applcos.APPL_WIDTH / 2, (Applcos.APPL_HEIGHT) - 30 / 2, (Applcos.APPL_HEIGHT /10) * 8, (Applcos.APPL_HEIGHT /10) * 3);
        RightPivot.setBounds((Applcos.APPL_WIDTH / 2) + 30, (Applcos.APPL_HEIGHT) + 30 / 2, (Applcos.APPL_HEIGHT /10) * 8, (Applcos.APPL_HEIGHT /10) * 3);
        LeftPivot.setBounds((Applcos.APPL_WIDTH / 2) + 30, (Applcos.APPL_HEIGHT) - 30 / 2, (Applcos.APPL_HEIGHT /10) * 8, (Applcos.APPL_HEIGHT /10) * 3);

        Forward.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Subsystems.EDriveTrain) {
                    DriveTrain.setSpeed(1.0);
                }
            }
        });

        Backward.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Subsystems.EDriveTrain) {
                    DriveTrain.setSpeed(-1.0);
                }
            }
        });

        Left.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Subsystems.EDriveTrain) {
                    DriveTrain.SetSideSpeed(-1.0, 'L');
                }
            }
        });

        Right.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Subsystems.EDriveTrain) {
                    DriveTrain.SetSideSpeed(1.0, 'R');
                }
            }
        });

        Shoot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Subsystems.EShooter) {
                    // Implement shooting logic here
                    System.out.println("Shooting... :>");
                }
            }
        });
    }
}
