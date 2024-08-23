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
    public Cone(int dimensions) {
        super(dimensions);

        System.out.println("You have chosen a cone\nEnter the radius: ");
        radius = chooser.getDoubleChoice();
        System.out.println("Enter the height: ");
        height = chooser.getDoubleChoice();
        volume = (1.0/3) * Math.PI * Math.pow(radius, 2) * height;
        printAreaVolMsg("volume", "cone", volume);
    }
}
