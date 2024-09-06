// Cylinder.java
// Aug 23 2024
// Aaron D. Webb
// Cylinder.java represents a cylinder.
// It inherits methods and fields from Shape
// and ThreeDimensionalShape. It has its own fields "radius"
// and height to hold those respective values.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cylinder extends ThreeDimensionalShape{
    int radius;
    int height;

    Integer[] choices = {0, 25, 50, 100, 150, 200, 300};
    JComboBox<Integer> comboBoxRadius;
    JComboBox<Integer> comboBoxHeight;
    JFrame frame;

    public Cylinder(int dimensions) {
        super(dimensions);
        frame = new JFrame("Enter radius and height");
        frame.setLayout(new FlowLayout());
        comboBoxRadius = new JComboBox<Integer>(choices);
        comboBoxHeight = new JComboBox<Integer>(choices);

        comboBoxRadius.addActionListener(this);
        comboBoxHeight.addActionListener(this);

        frame.setSize(new Dimension(200, 200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(comboBoxRadius);
        frame.add(comboBoxHeight);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        radius = (int)comboBoxRadius.getSelectedItem();
        height = (int)comboBoxHeight.getSelectedItem();

        System.out.println(radius);
        if (radius != 0 && height != 0){
            JFrame frame = new JFrame("ImageIcon Resize Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(650, 650);

            ImageIcon originalIcon = new ImageIcon("resources/cylinder.png");

            Image originalImage = originalIcon.getImage();
            Image resizedImage = originalImage.getScaledInstance(radius, height, Image.SCALE_SMOOTH);  // Use smooth scaling
            ImageIcon resizedIcon = new ImageIcon(resizedImage);
            JLabel imageLabel = new JLabel(resizedIcon);
            frame.add(imageLabel);
            frame.setVisible(true);
        }
    }
}
