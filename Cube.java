// Cube.java
// Aug 23 2024
// Aaron D. Webb
// Cube.java represents a cube.
// It inherits methods and fields from Shape
// and ThreeDimensionalShape. It has its own field "sideLength".

import javax.swing.*;
import java.awt.event.*;

public class Cube extends ThreeDimensionalShape{
    int  sideLength;
    JComboBox<Integer> comboBoxSideLength;

    public Cube(int dimensions) {
        super(dimensions);

        frame.setTitle("Enter side length");
        comboBoxSideLength = new JComboBox<Integer>(choices);
        comboBoxSideLength.addActionListener(this);

        frame.add(comboBoxSideLength);
    }


    public void actionPerformed(ActionEvent e){
        sideLength = (int)comboBoxSideLength.getSelectedItem();

        if (sideLength != 0){
            JFrame frame = super.makeDisplayFrame();
            JLabel label = super.makeDisplayLabel("resources/cube.png", sideLength, sideLength);
            frame.add(label);
        }
    }
}
