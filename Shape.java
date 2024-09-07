// Shape.java
// Aug 23 2024
// Aaron D. Webb
// Shape.java represents a basic shape and serves as the
// top of the package class hierarchy.
// It establishes fields and methods that are common
// to all shapes. Namely, a number of dimensions
// and the ability to return that number of dimensions
// (as an int) as well as print the number of dimensions
// in an output sentence.
// The class also creates a Chooser object that is accessible
// to its child classes and a printAreaVolMsg method which
// takes in characteristics as parameters and displays 
// information about them. This method also formats output
// to be rounded to 2 decimal places.

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

public class Shape extends JFrame implements ActionListener{
    protected int numDimensions;
    Integer[] choices = {0, 25, 50, 100, 150, 200, 300};
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

    public JFrame makeDisplayFrame(){
        JFrame frame = new JFrame("ImageIcon Resize Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 650);
        frame.setVisible(true);
        return frame;
    }
}