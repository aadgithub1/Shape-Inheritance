// Cone.java
// Aug 23 2024
// Aaron D. Webb
// Cone.java represents a cone.
// It inherits methods and fields from Shape
// and ThreeDimensionalShape. It has its own fields "radius"
// and height to hold those respective values.


public class Cone extends ThreeDimensionalShape{
    double radius;
    double height;
    public Cone(int dimensions, String imagePath) {
        super(dimensions, imagePath);
    }
}
