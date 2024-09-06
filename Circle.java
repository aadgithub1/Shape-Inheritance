// Circle.java
// Aug 23 2024
// Aaron D. Webb
// Circle.java represents a circle.
// It inherits methods and fields from Shape
// and TwoDimensionalShape. It has its own field "radius"
// to hold its radius value.

//add a combobox and prompt in the 2D constructor then pass those values to the 

import java.awt.*;

import javax.swing.JComboBox;
import javax.swing.JFrame;
public class Circle extends TwoDimensionalShape{
    private int radius;
    Integer[] choices = {25, 50, 100, 150, 200, 300};
    JComboBox<Integer> comboBox;
    JFrame frame;

    public Circle(int dimensions) {
        super(dimensions);
    }

    public void paint(Graphics g){
        g.drawArc(250, 250, radius, radius, 0, 360);
    }
}
