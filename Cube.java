// Cube.java
// Sep 7 2024
// Aaron D. Webb
// Cube.java creates a new JFrame
// and displays the resources/cube image.
// It inherits methods and fields from Shape
// and ThreeDimensionalShape. It has its own field "sideLength"
// to hold the value for the image dimensions.
// It has one JComboBox to obtain its side length.

import javax.swing.*;
import java.awt.event.*;

public class Cube extends ThreeDimensionalShape{
    int sideLength;
    JComboBox<Integer> comboBoxSideLength;

    public Cube(int dimensions) {
        super(dimensions);

        frame.setTitle("Enter side length");
        comboBoxSideLength = new JComboBox<Integer>(choices);
        comboBoxSideLength.addActionListener(this);

        frame.add(comboBoxSideLength);
    }

    //when the user creates an action by clicking
    //the JComboBox the conditional checks the returned
    //value; if it is set (is not 0) the cube is
    //rendered with the specified dimension
    public void actionPerformed(ActionEvent e){
        sideLength = (int)comboBoxSideLength.getSelectedItem();

        if (sideLength != 0){
            JFrame frame = super.makeDisplayFrame();
            JLabel label = super.makeDisplayLabel("resources/cube.png", sideLength, sideLength);
            frame.add(label);
        }
    }
}
