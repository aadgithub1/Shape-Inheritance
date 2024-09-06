// Sphere.java
// Aug 23 2024
// Aaron D. Webb
// Sphere.java represents a sphere.
// It inherits methods and fields from Shape
// and ThreeDimensionalShape. It has its own field "radius",
// which holds its radius value.
public class Sphere extends ThreeDimensionalShape{
    double radius;
    public Sphere(int dimensions, String imagePath) {
        super(dimensions, imagePath);
        
        // System.out.println("You have chosen a Sphere\nEnter the radius: ");
        // radius = chooser.getDoubleChoice();
        // volume = (4.0/3) * Math.PI * Math.pow(radius, 3);
        // printAreaVolMsg("volume", "sphere", volume);
    }
}
