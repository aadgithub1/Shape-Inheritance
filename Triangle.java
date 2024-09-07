// Triangle.java
// Aug 23 2024
// Aaron D. Webb
// Triangle.java represents a triangle.
// It inherits methods and fields from Shape
// and TwoDimensionalShape. It has its own fields "base"
// and "height" to hold those respective values.
import java.awt.*;
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
            JFrame frame = new JFrame("ImageIcon Resize Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(650, 650);

            ImageIcon originalIcon = new ImageIcon("resources/triangle.png");

            Image originalImage = originalIcon.getImage();
            Image resizedImage = originalImage.getScaledInstance(base, height, Image.SCALE_SMOOTH);  // Use smooth scaling
            ImageIcon resizedIcon = new ImageIcon(resizedImage);
            JLabel imageLabel = new JLabel(resizedIcon);
            frame.add(imageLabel);
            frame.setVisible(true);
        }
    }
}
