// ThreeDimensionalShape.java
// Aug 23 2024
// Aaron D. Webb
// ThreeDimensionalShape.java represents a 3D shape.
// It inherits methods and fields from Shape.
// It has its own field "volume"
// to hold the volume of any three dimensional shape.
public class ThreeDimensionalShape extends Shape{
    protected double volume;
    public ThreeDimensionalShape(int dimensions) {
        super(dimensions);
    }
}
