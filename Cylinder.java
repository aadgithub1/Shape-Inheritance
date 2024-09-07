// Cylinder.java
// Sep 7 2024
// Aaron D. Webb
// Cylinder.java creates a new JFrame
// and displays the resources/cylinder image.
// It inherits methods and fields from Shape
// and ThreeDimensionalShape. It has its own fields
// "radius" and "height"
// to hold the values for the image dimensions.
// It has two JComboBoxes to obtain its radius and height.

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

    //when the user creates an action by clicking
    //the JComboBox the conditional checks the returned
    //values; if they are set (are not 0) the cylinder is
    //rendered with the specified dimensions

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
