// Cone.java
// Sep 7 2024
// Aaron D. Webb
// Cone.java creates a new JFrame
// and displays the resources/cone image.
// It inherits methods and fields from Shape
// and ThreeDimensionalShape. It has its own fields "radius"
// and "height" to hold those respective
// values for the image dimensions.
// It has two JComboBoxes to obtain its radius value
// and height value.

import java.awt.event.*;
import javax.swing.*;

public class Cone extends ThreeDimensionalShape{
    int radius;
    int height;

    JComboBox<Integer> comboBoxRadius;
    JComboBox<Integer> comboBoxHeight;

    public Cone(int dimensions) {
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
    //either JComboBox the conditional checks the returned
    //values; if both are set (are not 0) the cone is
    //rendered with the specified dimensions

     public void actionPerformed(ActionEvent e){
        radius = (int)comboBoxRadius.getSelectedItem();
        height = (int)comboBoxHeight.getSelectedItem();

        if (radius != 0 && height != 0){
            JFrame frame = super.makeDisplayFrame();
            JLabel label = super.makeDisplayLabel(
                "resources/cone.png", 
                (radius + 10)*2, height); //overcome px gap
                                          //at image edge
            frame.add(label);

        }
    }
}
