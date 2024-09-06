// Triangle.java
// Aug 23 2024
// Aaron D. Webb
// Triangle.java represents a triangle.
// It inherits methods and fields from Shape
// and TwoDimensionalShape. It has its own fields "base"
// and "height" to hold those respective values.
import java.awt.*;

public class Triangle extends TwoDimensionalShape{
    double base;
    double height;
    public Triangle(int dimensions) {
        super(dimensions);
    }

    public void paint(Graphics g){
        int[] xpoints = {300, 450, 150};
        int[] ypoints = {200, 400, 400};
        g.drawPolygon(xpoints, ypoints, 3);
    }
}
