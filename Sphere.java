// Sphere.java
// Aug 23 2024
// Aaron D. Webb
// Sphere.java represents a sphere.
// It inherits methods and fields from Shape
// and ThreeDimensionalShape. It has its own field "radius",
// which holds its radius value.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sphere extends ThreeDimensionalShape{
    int radius;

    Integer[] choices = {0, 25, 50, 100, 150, 200, 300};
    JComboBox<Integer> comboBoxRadius;
    JFrame frame;
    public Sphere(int dimensions) {
        super(dimensions);

        frame = new JFrame("Enter radius");
        frame.setLayout(new FlowLayout());
        comboBoxRadius = new JComboBox<Integer>(choices);
        comboBoxRadius.addActionListener(this);

        frame.setSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(comboBoxRadius);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        radius = (int)comboBoxRadius.getSelectedItem();
        if (radius != 0){
            JFrame frame = new JFrame("ImageIcon Resize Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(650, 650);

            ImageIcon originalIcon = new ImageIcon("resources/sphere.png");

            Image originalImage = originalIcon.getImage();
            Image resizedImage = originalImage.getScaledInstance(radius*2, radius*2, Image.SCALE_SMOOTH);  // Use smooth scaling
            ImageIcon resizedIcon = new ImageIcon(resizedImage);
            JLabel imageLabel = new JLabel(resizedIcon);
            frame.add(imageLabel);
            frame.setVisible(true);
        }
    }
}
