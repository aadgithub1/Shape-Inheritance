// Cylinder.java
// Aug 23 2024
// Aaron D. Webb
// Cylinder.java represents a cylinder.
// It inherits methods and fields from Shape
// and ThreeDimensionalShape. It has its own fields "radius"
// and height to hold those respective values.
public class Cylinder extends ThreeDimensionalShape{
    double radius;
    double height;
    public Cylinder(int dimensions, String imagePath) {
        super(dimensions, imagePath);

        // System.out.println("You have chosen a Cylinder\nEnter the radius: ");
        // radius = chooser.getDoubleChoice();
        // System.out.println("Enter the height: ");
        // height = chooser.getDoubleChoice();
        // volume  = Math.PI * Math.pow(radius, 2) * height;
        // printAreaVolMsg("volume", "cylinder", volume);
    }
}
