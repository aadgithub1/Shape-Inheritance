import javax.swing.*;

import java.awt.Dimension;
import java.awt.*;
import java.awt.event.*;

public class MenuFrame extends JFrame implements ActionListener{
    CirclePanel circlePanel = new CirclePanel("Circle", "circle.png");
    RectanglePanel rectanglePanel = new RectanglePanel("Rectangle", "rectangle.png");

    public MenuFrame(){
        setPreferredSize(new Dimension(600, 600));
        setLayout(new GridLayout(3,3));
        add(circlePanel);
        add(rectanglePanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
            
    }
}
