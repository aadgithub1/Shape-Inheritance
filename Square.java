// Square.java
// Aug 23 2024
// Aaron D. Webb
// Square.java represents a square.
// It inherits methods and fields from Shape
// and TwoDimensionalShape. It has its own field "sideLength"
// to hold its side length value.
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
            JLabel label = super.makeDisplayLabel("resources/square.png", sideLength, sideLength);
            frame.add(label);
        }
    }
}
