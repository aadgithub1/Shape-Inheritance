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

    Integer[] choices = {0, 25, 50, 100, 150, 200, 300};
    JComboBox<Integer> comboBoxBase;
    JComboBox<Integer> comboBoxHeight;
    JFrame frame;
    public Triangle(int dimensions) {
        super(dimensions);

        frame = new JFrame("Enter base, then height");
        frame.setLayout(new FlowLayout());
        comboBoxBase = new JComboBox<Integer>(choices);
        comboBoxHeight = new JComboBox<Integer>(choices);
        comboBoxBase.addActionListener(this);
        comboBoxHeight.addActionListener(this);

        frame.setSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(comboBoxBase);
        frame.add(comboBoxHeight);
        frame.setVisible(true);
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
