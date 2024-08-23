// Torus.java
// Aug 23 2024
// Aaron D. Webb
// Torus.java represents a torus.
// It inherits methods and fields from Shape
// and ThreeDimensionalShape. It has its own fields "majorRadius",
// and "crossRadius" which hold those respective values.
public class Torus extends ThreeDimensionalShape{
    double majorRadius;
    double crossRadius;
    public Torus(int dimensions) {
        super(dimensions);

        System.out.println("You have chosen a Torus\nEnter the major radius: ");
        majorRadius = chooser.getDoubleChoice();
        System.out.println("Enter the cross-sectional radius: ");
        crossRadius = chooser.getDoubleChoice();
        volume = 2 * Math.pow(Math.PI, 2) * Math.pow(crossRadius, 2) * majorRadius;
        printAreaVolMsg("volume", "torus", volume);

    }
}
