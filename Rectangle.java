// Rectangle.java
// Sep 7 2024
// Aaron D. Webb
// Rectangle.java represents a rectangle.
// It inherits methods and fields from Shape
// and TwoDimensionalShape. It has its own fields "length"
// and "width" to hold those respective values.
import java.awt.event.*;
import javax.swing.*;


public class Rectangle extends TwoDimensionalShape{
    int length;
    int width;

    JComboBox<Integer> comboBoxWidth;
    JComboBox<Integer> comboBoxLength;

    public Rectangle(int dimensions){
        super(dimensions);

        frame.setTitle("Enter width, then height");
        comboBoxWidth = new JComboBox<Integer>(choices);
        comboBoxLength = new JComboBox<Integer>(choices);
        comboBoxWidth.addActionListener(this);
        comboBoxLength.addActionListener(this);

        frame.add(comboBoxWidth);
        frame.add(comboBoxLength);
    }
    public void actionPerformed(ActionEvent e){
        width = (int)comboBoxWidth.getSelectedItem();
        length = (int)comboBoxLength.getSelectedItem();

        if (width != 0 && length != 0){
            JFrame frame = super.makeDisplayFrame();
            JLabel label = super.makeDisplayLabel("resources/rectangle.png", width, length);
            frame.add(label);
        }
    }
}
