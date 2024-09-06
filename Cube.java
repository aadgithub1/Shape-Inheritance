// Cube.java
// Aug 23 2024
// Aaron D. Webb
// Cube.java represents a cube.
// It inherits methods and fields from Shape
// and ThreeDimensionalShape. It has its own field "sideLength".

public class Cube extends ThreeDimensionalShape{
    double sideLength;
    public Cube(int dimensions, String imagePath) {
        super(dimensions, imagePath);
    }
}
