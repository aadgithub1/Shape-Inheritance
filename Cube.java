// Cube.java
// Aug 23 2024
// Aaron D. Webb
// Cube.java represents a cube.
// It inherits methods and fields from Shape
// and ThreeDimensionalShape. It has its own field "sideLength".

import javax.swing.*;
import java.awt.*;
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

        System.out.println(sideLength);
        if (sideLength != 0){
            frame = super.makeDisplayFrame();

            ImageIcon originalIcon = new ImageIcon("resources/cube.png");

            Image originalImage = originalIcon.getImage();
            Image resizedImage = originalImage.getScaledInstance(sideLength, sideLength, Image.SCALE_SMOOTH);  // Use smooth scaling
            ImageIcon resizedIcon = new ImageIcon(resizedImage);
            JLabel imageLabel = new JLabel(resizedIcon);
            frame.add(imageLabel);
        }
    }
}
