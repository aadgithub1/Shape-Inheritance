// Circle.java
// Aug 23 2024
// Aaron D. Webb
// Circle.java represents a circle.
// It inherits methods and fields from Shape
// and TwoDimensionalShape. It has its own field "radius"
// to hold its radius value.

import java.awt.*;
public class Circle extends TwoDimensionalShape {
    private double radius;
    public Circle(int dimensions) {
        super(dimensions);

        // System.out.println("You have selected a Circle.\nEnter the radius of the circle: ");
        // radius = chooser.getDoubleChoice();
        // area = Math.PI * Math.pow(radius, 2);
        // printAreaVolMsg("area", "circle", area);
        //(above) uses inherited method to print output using
        //current class characteristics
    }

    public void paint(Graphics g){
        g.drawArc(250, 250, 100, 100, 0, 360);
    }
}
