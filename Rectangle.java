// Rectangle.java
// Aug 23 2024
// Aaron D. Webb
// Rectangle.java represents a rectangle.
// It inherits methods and fields from Shape
// and TwoDimensionalShape. It has its own fields "length"
// and "width" to hold those respective values.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Rectangle extends TwoDimensionalShape{
    int length;
    int width;

    Integer[] choices = {0, 25, 50, 100, 150, 200, 300};
    JComboBox<Integer> comboBoxWidth;
    JComboBox<Integer> comboBoxLength;
    JFrame frame;
    public Rectangle(int dimensions){
        super(dimensions);

        frame = new JFrame("Enter width, then height");
        frame.setLayout(new FlowLayout());
        comboBoxWidth = new JComboBox<Integer>(choices);
        comboBoxLength = new JComboBox<Integer>(choices);
        comboBoxWidth.addActionListener(this);
        comboBoxLength.addActionListener(this);

        frame.setSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(comboBoxWidth);
        frame.add(comboBoxLength);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        width = (int)comboBoxWidth.getSelectedItem();
        length = (int)comboBoxLength.getSelectedItem();

        System.out.println(length + " " + width);
        if (width != 0 && length != 0){
            JFrame frame = new JFrame("ImageIcon Resize Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(650, 650);

            ImageIcon originalIcon = new ImageIcon("resources/rectangle.png");

            Image originalImage = originalIcon.getImage();
            Image resizedImage = originalImage.getScaledInstance(width, length, Image.SCALE_SMOOTH);  // Use smooth scaling
            ImageIcon resizedIcon = new ImageIcon(resizedImage);
            JLabel imageLabel = new JLabel(resizedIcon);
            frame.add(imageLabel);
            frame.setVisible(true);
        }
    }
}
