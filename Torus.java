// Torus.java
// Aug 23 2024
// Aaron D. Webb
// Torus.java represents a torus.
// It inherits methods and fields from Shape
// and ThreeDimensionalShape. It has its own fields "majorRadius",
// and "crossRadius" which hold those respective values.
import java.awt.event.*;
import javax.swing.*;


//HOW TF DO I FIX THE RENDER ON THIS BADDIE

public class Torus extends ThreeDimensionalShape{
    int majorRadius;
    int crossRadius;
    JComboBox<Integer> comboBoxMajor;
    JComboBox<Integer> comboBoxCross;

    public Torus(int dimensions) {
        super(dimensions);

        frame.setTitle("Enter major radius, the cross radius");
        comboBoxMajor = new JComboBox<Integer>(choices);
        comboBoxCross = new JComboBox<Integer>(choices);
        comboBoxMajor.addActionListener(this);
        comboBoxCross.addActionListener(this);

        frame.add(comboBoxMajor);
        frame.add(comboBoxCross);
    }

    public void actionPerformed(ActionEvent e){
        majorRadius = (int)comboBoxMajor.getSelectedItem();
        crossRadius = (int)comboBoxCross.getSelectedItem();
        if (majorRadius != 0 && crossRadius != 0){
            JFrame frame = super.makeDisplayFrame();
            JLabel label = super.makeDisplayLabel("resources/thin-torus.png", majorRadius+10, crossRadius+10);
            frame.add(label);
        }
    }
}
