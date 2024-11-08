//3.	Write a program using event handling in applet that prints a “Welcome” message by clicking on the button

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet3 extends Applet implements ActionListener {
    private String message = "";
    private Button welcomeButton;

    @Override
    public void init() {
        welcomeButton = new Button("Click Me");
        add(welcomeButton);
        welcomeButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == welcomeButton) {
            message = "Welcome";
            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(message, 50, 50);
    }
}

//<html>
// <body>
//     <applet code="Applet3.class" width="300" height="300"></applet>
// </body>
// </html>