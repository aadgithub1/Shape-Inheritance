import java.awt.Color;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CirclePanel extends Panel{
    public CirclePanel(){
        image = new ImageIcon("circle.png");
        label = new JLabel();

        label.setIcon(image);
        label.setText("Circle");
        // label.setHorizontalTextPosition(JLabel.CENTER);
        // label.setVerticalTextPosition(JLabel.BOTTOM);
        setSize(new Dimension(200, 200));
        setBackground(Color.red);
        add(label);
    }
}
