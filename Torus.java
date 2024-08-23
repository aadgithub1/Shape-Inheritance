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
