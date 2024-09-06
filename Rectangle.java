// Rectangle.java
// Aug 23 2024
// Aaron D. Webb
// Rectangle.java represents a rectangle.
// It inherits methods and fields from Shape
// and TwoDimensionalShape. It has its own fields "length"
// and "width" to hold those respective values.
import java.awt.*;


public class Rectangle extends TwoDimensionalShape{
    double length;
    double width;
    public Rectangle(int dimensions){
        super(dimensions);
    }

    public void paint(Graphics g){
        g.drawRect(250, 200, 100, 200);
    }
}
