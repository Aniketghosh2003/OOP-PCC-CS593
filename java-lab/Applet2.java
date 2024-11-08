import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet2 extends Applet implements ActionListener {
    private String shapeToDraw = "";

    private Button circleButton;
    private Button rectangleButton;

    @Override
    public void init() {
        circleButton = new Button("Draw Circle");
        rectangleButton = new Button("Draw Rectangle");

        add(circleButton);
        add(rectangleButton);

        circleButton.addActionListener(this);
        rectangleButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == circleButton) {
            shapeToDraw = "circle";
        } else if (e.getSource() == rectangleButton) {
            shapeToDraw = "rectangle";
        }
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (shapeToDraw.equals("circle")) {
            g.setColor(Color.RED);
            g.drawOval(50, 50, 100, 100); // Draw circle
        } else if (shapeToDraw.equals("rectangle")) {
            g.setColor(Color.BLUE);
            g.drawRect(50, 50, 150, 100); // Draw rectangle
        }
    }
}

// <html>
// <body>
//     <applet code="ShapeApplet.class" width="300" height="300"></applet>
// </body>
// </html>
