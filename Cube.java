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

    Integer[] choices = {0, 25, 50, 100, 150, 200, 300};
    JComboBox<Integer> comboBoxSideLength;
    JFrame frame;

    public Cube(int dimensions) {
        super(dimensions);
        frame = new JFrame("Enter side length");
        frame.setLayout(new FlowLayout());
        comboBoxSideLength = new JComboBox<Integer>(choices);

        comboBoxSideLength.addActionListener(this);

        frame.setSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(comboBoxSideLength);
        frame.setVisible(true);

    }


    public void actionPerformed(ActionEvent e){
        sideLength = (int)comboBoxSideLength.getSelectedItem();

        System.out.println(sideLength);
        if (sideLength != 0){
            JFrame frame = new JFrame("ImageIcon Resize Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(650, 650);

            ImageIcon originalIcon = new ImageIcon("resources/cube.png");

            Image originalImage = originalIcon.getImage();
            Image resizedImage = originalImage.getScaledInstance(sideLength, sideLength, Image.SCALE_SMOOTH);  // Use smooth scaling
            ImageIcon resizedIcon = new ImageIcon(resizedImage);
            JLabel imageLabel = new JLabel(resizedIcon);
            frame.add(imageLabel);
            frame.setVisible(true);
        }
    }
}
