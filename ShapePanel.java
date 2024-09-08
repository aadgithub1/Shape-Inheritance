// ShapePanel.java
// Sep 7 2024
// Aaron D. Webb
// ShapePanel.java has multiple variables
// that are used to create an ImageIcon
// and add that ImageIcon to a JLabel along
// with descriptive text. Instances of the ShapePanels
// are added to the MenuPanel.

import javax.swing.*;
import java.awt.*;

public class ShapePanel extends JPanel{
    ImageIcon image;
    JLabel label;
    String shapeName;
    String filePath;
    public ShapePanel(String shapeName, String filePath){
        this.shapeName = shapeName;
        this.filePath = filePath;
        setPreferredSize(new Dimension(200, 200));
        image = new ImageIcon(filePath);
        label = new JLabel();

        label.setIcon(image);
        label.setText(shapeName);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        add(label);
    }
}
