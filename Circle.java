// Circle.java
// Sep 7 2024
// Aaron D. Webb
// Circle.java creates a new JFrame
// and displays the resources/circle image.
// It inherits methods and fields from Shape
// and TwoDimensionalShape. It has its own field "radius"
// to hold its radius value for the image dimensions.
// It has one JComboBox to obtain its radius value.

import java.awt.event.ActionEvent;

import javax.swing.*;

public class Circle extends TwoDimensionalShape{
    private int radius;
    JComboBox<Integer> comboBox;

    public Circle(int dimensions) {
        super(dimensions);
        frame.setTitle("Enter radius");
        comboBox = new JComboBox<Integer>(choices);
        comboBox.addActionListener(this);
        frame.add(comboBox);
    }
    //if JComboBox is assigned, a JFrame is created
    //to display the circle image
    public void actionPerformed(ActionEvent e){
        radius = (int)comboBox.getSelectedItem();
        if (radius != 0){
            JFrame frame = super.makeDisplayFrame();
            JLabel label = super.makeDisplayLabel("resources/circle.png", radius*2, radius*2);
            frame.add(label);
        }
    }
}
