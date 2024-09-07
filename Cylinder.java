// Cylinder.java
// Aug 23 2024
// Aaron D. Webb
// Cylinder.java represents a cylinder.
// It inherits methods and fields from Shape
// and ThreeDimensionalShape. It has its own fields "radius"
// and height to hold those respective values.

import javax.swing.*;
import java.awt.event.*;

public class Cylinder extends ThreeDimensionalShape{
    int radius;
    int height;

    JComboBox<Integer> comboBoxRadius;
    JComboBox<Integer> comboBoxHeight;

    public Cylinder(int dimensions) {
        super(dimensions);

        frame.setTitle("Enter radius, then height");
        comboBoxRadius = new JComboBox<Integer>(choices);
        comboBoxHeight = new JComboBox<Integer>(choices);

        comboBoxRadius.addActionListener(this);
        comboBoxHeight.addActionListener(this);
        frame.add(comboBoxRadius);
        frame.add(comboBoxHeight);

    }

    public void actionPerformed(ActionEvent e){
        radius = (int)comboBoxRadius.getSelectedItem();
        height = (int)comboBoxHeight.getSelectedItem();

        if (radius != 0 && height != 0){
            JFrame frame = super.makeDisplayFrame();
            JLabel label = super.makeDisplayLabel("resources/cylinder.png", (radius+10)*2, height);
            frame.add(label);;
        }
    }
}
