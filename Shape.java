// Shape.java
// Sep 7 2024
// Aaron D. Webb
// Shape.java represents a generic Shape.
// It has an array of Integers that are used
// as choices for the child class JComboBoxes.
// It returns a JFrame for shape images to
// be displayed. It returns a JLabel
// with a scaled image to be added to the
// JFrame and displayed as the final result.

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

public class Shape extends JFrame implements ActionListener{
    protected int numDimensions;
    Integer[] choices = {0, 25, 50, 100, 200, 300};
    JFrame frame;

    public Shape(int dimensions){
        numDimensions = dimensions;

        frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    //used by subclasses
    public JFrame makeDisplayFrame(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 650);
        frame.setVisible(true);
        return frame;
    }
    //used by subclasses
    public JLabel makeDisplayLabel(String imagePath, int widthDimension, int heightDimension){
        ImageIcon originalIcon = new ImageIcon(imagePath);

        Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(widthDimension, heightDimension, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        JLabel imageLabel = new JLabel(resizedIcon);
        return imageLabel;
    }
}