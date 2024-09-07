// Square.java
// Aug 23 2024
// Aaron D. Webb
// Square.java represents a square.
// It inherits methods and fields from Shape
// and TwoDimensionalShape. It has its own field "sideLength"
// to hold its side length value.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Square extends TwoDimensionalShape{
    int sideLength;

    JComboBox<Integer> comboBox;

    public Square(int dimensions) {
        super(dimensions);

        frame.setTitle("Enter side length");
        comboBox = new JComboBox<Integer>(choices);
        comboBox.addActionListener(this);

        frame.add(comboBox);

    }

    public void actionPerformed(ActionEvent e){
        sideLength = (int)comboBox.getSelectedItem();
        if (sideLength != 0){
            JFrame frame = new JFrame("ImageIcon Resize Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(650, 650);

            ImageIcon originalIcon = new ImageIcon("resources/square.png");

            Image originalImage = originalIcon.getImage();
            Image resizedImage = originalImage.getScaledInstance(sideLength, sideLength, Image.SCALE_SMOOTH);  // Use smooth scaling
            ImageIcon resizedIcon = new ImageIcon(resizedImage);
            JLabel imageLabel = new JLabel(resizedIcon);
            frame.add(imageLabel);
            frame.setVisible(true);
        }
    }
}
