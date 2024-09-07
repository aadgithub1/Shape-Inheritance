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

    Integer[] choices = {0, 25, 50, 100, 150, 200, 300};
    JComboBox<Integer> comboBox;
    JFrame frame;
    public Square(int dimensions) {
        super(dimensions);

        frame = new JFrame("Enter side length");
        frame.setLayout(new FlowLayout());
        comboBox = new JComboBox<Integer>(choices);
        comboBox.addActionListener(this);

        frame.setSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(comboBox);
        frame.setVisible(true);
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
