// Square.java
// Sep 7 2024
// Aaron D. Webb
// Square.java uses an inherited JFrame
// and creates a new JFrame
// and displays the resources/square image.
// It inherits methods and fields from Shape
// and TwoDimensionalShape. It has its own field "sideLength"
// to hold its side length value for the image dimensions.
// It has one JComboBox to obtain its side length value.

import java.awt.event.*;
import javax.swing.*;

public class Square extends TwoDimensionalShape{
    int sideLength;
    JComboBox<Integer> comboBox;

    public Square(int dimensions) {
        super(dimensions);
        frame.setTitle("Enter side length");
        comboBox = new JComboBox<Integer>(choices);
        comboBox.addActionListener(this);

        frame.add(comboBox);

    }

    public void actionPerformed(ActionEvent e){
        sideLength = (int)comboBox.getSelectedItem();
        if (sideLength != 0){
            JFrame frame = super.makeDisplayFrame();
            JLabel label = super.makeDisplayLabel("resources/square.png", sideLength+10, sideLength+10);
            frame.add(label);
        }
    }
}
