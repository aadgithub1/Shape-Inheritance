// Square.java
// Aug 23 2024
// Aaron D. Webb
// Square.java represents a square.
// It inherits methods and fields from Shape
// and TwoDimensionalShape. It has its own field "sideLength"
// to hold its side length value.

public class Square extends TwoDimensionalShape{
    double sideLength;
    public Square(int dimensions) {
        super(dimensions);

        System.out.println("You have chosen a Square\nEnter the side length: ");
        sideLength = chooser.getDoubleChoice();
        area = Math.pow(sideLength, 2);
        printAreaVolMsg("area", "square", area);
    }
}
