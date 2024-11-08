//1.	Write a program to create an Applet having three buttons red, green, and blue. On clicking on red button the background color should be changed to red, on clicking in blue button the color should be changed to blue and so on

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// Extend the Applet class and implement ActionListener
public class Applet1 extends Applet implements ActionListener {
    // Buttons for color change
    Button redButton, greenButton, blueButton;

    public void init() {
        // Initialize buttons with labels
        redButton = new Button("Red");
        greenButton = new Button("Green");
        blueButton = new Button("Blue");

        // Add buttons to the Applet
        add(redButton);
        add(greenButton);
        add(blueButton);

        // Register buttons with ActionListener
        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);
    }

    // Method to handle button click events
    public void actionPerformed(ActionEvent e) {
        // Check which button was clicked and change background color
        if (e.getSource() == redButton) {
            setBackground(Color.RED);
        } else if (e.getSource() == greenButton) {
            setBackground(Color.GREEN);
        } else if (e.getSource() == blueButton) {
            setBackground(Color.BLUE);
        }
    }
}



// <html>
//   <body>
//     <applet code="ColorChangeApplet.class" width="300" height="200"></applet>
//   </body>
// </html>
