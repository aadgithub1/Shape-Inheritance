// Cube.java
// Aug 23 2024
// Aaron D. Webb
// Cube.java represents a cube.
// It inherits methods and fields from Shape
// and ThreeDimensionalShape. It has its own field "sideLength".

public class Cube extends ThreeDimensionalShape{
    double sideLength;
    public Cube(int dimensions) {
        super(dimensions);

        System.out.println("You selected a Cube\nEnter the side length: ");
        sideLength = chooser.getDoubleChoice();
        volume = Math.pow(sideLength, 3);
        printAreaVolMsg("volume", "cube", volume);
    }
}
