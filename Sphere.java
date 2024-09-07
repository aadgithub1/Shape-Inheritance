// Sphere.java
// Aug 23 2024
// Aaron D. Webb
// Sphere.java represents a sphere.
// It inherits methods and fields from Shape
// and ThreeDimensionalShape. It has its own field "radius",
// which holds its radius value.
import java.awt.event.*;
import javax.swing.*;

public class Sphere extends ThreeDimensionalShape{
    int radius;
    JComboBox<Integer> comboBoxRadius;

    public Sphere(int dimensions) {
        super(dimensions);
        frame.setTitle("Enter radius");
        comboBoxRadius = new JComboBox<Integer>(choices);
        comboBoxRadius.addActionListener(this);
        frame.add(comboBoxRadius);
    }

    public void actionPerformed(ActionEvent e){
        radius = (int)comboBoxRadius.getSelectedItem();
        if (radius != 0){
            JFrame frame = super.makeDisplayFrame();
            JLabel label = super.makeDisplayLabel("resources/sphere.png", radius*2, radius*2);
            frame.add(label);
        }
    }
}
