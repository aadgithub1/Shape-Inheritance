// Triangle.java
// Aug 23 2024
// Aaron D. Webb
// Triangle.java represents a triangle.
// It inherits methods and fields from Shape
// and TwoDimensionalShape. It has its own fields "base"
// and "height" to hold those respective values.
import java.awt.event.*;
import javax.swing.*;

public class Triangle extends TwoDimensionalShape{
    int base;
    int height;
    JComboBox<Integer> comboBoxBase;
    JComboBox<Integer> comboBoxHeight;

    public Triangle(int dimensions) {
        super(dimensions);
        frame.setTitle("Enter base, then height");
        comboBoxBase = new JComboBox<Integer>(choices);
        comboBoxHeight = new JComboBox<Integer>(choices);
        comboBoxBase.addActionListener(this);
        comboBoxHeight.addActionListener(this);

        frame.add(comboBoxBase);
        frame.add(comboBoxHeight);
    }

    public void actionPerformed(ActionEvent e){
        base = (int)comboBoxBase.getSelectedItem();
        height = (int)comboBoxHeight.getSelectedItem();
        if (base != 0 && height != 0){
            JFrame frame = super.makeDisplayFrame();
            JLabel label = super.makeDisplayLabel("resources/triangle.png", base, height);
            frame.add(label);
        }
    }
}
