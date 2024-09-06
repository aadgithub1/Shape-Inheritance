// TwoDimensionalShape.java
// Aug 23 2024
// Aaron D. Webb
// TwoDimensionalShape.java represents a 2D shape.
// It inherits methods and fields from Shape.
// It has its own field "area"
// to hold the area of any two dimensional shape.


public class TwoDimensionalShape extends Shape{
    protected double area;
    public TwoDimensionalShape(int dimensions) {
        super(dimensions);
    }

    public void add(Object obj){
        super.add(obj);
        
    }
}
