// Square.java
// Aug 23 2024
// Aaron D. Webb
// Square.java represents a square.
// It inherits methods and fields from Shape
// and TwoDimensionalShape. It has its own field "sideLength"
// to hold its side length value.
import java.awt.*;

public class Square extends TwoDimensionalShape{
    double sideLength;
    public Square(int dimensions) {
        super(dimensions);

        // System.out.println("You have chosen a Square\nEnter the side length: ");
        // sideLength = chooser.getDoubleChoice();
        // area = Math.pow(sideLength, 2);
        // printAreaVolMsg("area", "square", area);
    }

    public void paint(Graphics g){
        g.drawRect(250, 250, 100, 100);
    }
}
