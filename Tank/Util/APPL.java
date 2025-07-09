package Tank.Util;

import Tank.Util.Constants.APPLcos;
import java.awt.*;
import java.awt.event.*;
// import java.lang.reflect.feild;

public class APPL {
    public APPL() {
        Button Forward = new Button("Forward");
        Button Backward = new Button("Backward");
        Button Left = new Button("Left");
        Button Right = new Button("Right");
        Button Shoot = new Button("Shoot");

        add(Forward); Forward.setVisible(true);
        add(Backward); Backward.setVisible(true);
        add(Left); Left.setVisible(true);
        add(Right); Right.setVisible(true);
        add(Shoot); Shoot.setVisible(true);

        setTitle(APPLcos.APPL_NAME + " " + APPLcos.APPL_VERSION + " -" + APPLcos.APP_AUTHOR);
        setSize(APPLcos.APPL_WIDTH, APPLcos.APPL_HEIGHT);

        Shoot.setBounds(APPLcos.APPL_WIDTH / 2, APPLcos.APPL_HEIGHT / 2, (APPLcos.APPL_HEIGHT /10) * 8, (APPLcos.APPL_HEIGHT /10) * 3);
        Forward.setBounds((APPLcos.APPL_WIDTH  / 2) + 30, APPLcos.APPL_HEIGHT / 2, (APPLcos.APPL_HEIGHT /10) * 8, (APPLcos.APPL_HEIGHT /10) * 3);
        Backward.setBounds((APPLcos.APPL_WIDTH / 2) - 30, APPLcos.APPL_HEIGHT / 2, (APPLcos.APPL_HEIGHT /10) * 8, (APPLcos.APPL_HEIGHT /10) * 3);
        Right.setBounds(APPLcos.APPL_WIDTH / 2, (APPLcos.APPL_HEIGHT) + 30 / 2, (APPLcos.APPL_HEIGHT /10) * 8, (APPLcos.APPL_HEIGHT /10) * 3);
        Left.setBounds(APPLcos.APPL_WIDTH / 2, (APPLcos.APPL_HEIGHT) - 30 / 2, (APPLcos.APPL_HEIGHT /10) * 8, (APPLcos.APPL_HEIGHT /10) * 3);

        Forward.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if 
            }
        });

        Backward.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        Left.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        Right.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        Shoot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }
}
