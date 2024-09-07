// Circle.java
// Aug 23 2024
// Aaron D. Webb
// Circle.java represents a circle.
// It inherits methods and fields from Shape
// and TwoDimensionalShape. It has its own field "radius"
// to hold its radius value.

//add a combobox and prompt in the 2D constructor then pass those values to the 

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
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

    public void actionPerformed(ActionEvent e){
        radius = (int)comboBox.getSelectedItem();
        System.out.println(radius);
        if (radius != 0){
            frame = super.makeDisplayFrame();

            ImageIcon originalIcon = new ImageIcon("resources/circle.png");

            Image originalImage = originalIcon.getImage();
            Image resizedImage = originalImage.getScaledInstance(radius*2, radius*2, Image.SCALE_SMOOTH);  // Use smooth scaling
            ImageIcon resizedIcon = new ImageIcon(resizedImage);
            JLabel imageLabel = new JLabel(resizedIcon);
            frame.add(imageLabel);
            
        }
    }
}
