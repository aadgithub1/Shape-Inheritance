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
    Integer[] torusMajorChoices = {0, 1, 2, 3};
    Integer[] torusCrossChoices = {0, 1};
    JComboBox<Integer> comboBoxMajor;
    JComboBox<Integer> comboBoxCross;

    public Torus(int dimensions) {
        super(dimensions);

        frame.setTitle("Enter major radius to cross radius ratio");
        comboBoxMajor = new JComboBox<Integer>(torusMajorChoices);
        comboBoxCross = new JComboBox<Integer>(torusCrossChoices);
        comboBoxMajor.addActionListener(this);
        comboBoxCross.addActionListener(this);

        frame.add(comboBoxMajor);
        frame.add(comboBoxCross);
    }

    public void actionPerformed(ActionEvent e){
        majorRadius = (int)comboBoxMajor.getSelectedItem();
        crossRadius = (int)comboBoxCross.getSelectedItem();
        JLabel label;
        if (majorRadius != 0 && crossRadius != 0){
            JFrame frame = super.makeDisplayFrame();
            if (majorRadius == 3 && crossRadius == 1){
                label = super.makeDisplayLabel("resources/thin-torus.png", 150, 150);
            } else if (majorRadius == 2 && crossRadius == 1) {
                label = super.makeDisplayLabel("resources/reg-torus.png", 150, 150);
            } else {
                label = super.makeDisplayLabel("resources/fat-torus.png", 150, 150);
            }

            frame.add(label);
        }
    }
}
