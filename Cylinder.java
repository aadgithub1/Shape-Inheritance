public class Cylinder extends ThreeDimensionalShape{
    double radius;
    double height;
    public Cylinder(int dimensions) {
        super(dimensions);

        System.out.println("You have chosen a Cylinder\nEnter the radius: ");
        radius = chooser.getDoubleChoice();
        System.out.println("Enter the height: ");
        height = chooser.getDoubleChoice();
        volume  = Math.PI * Math.pow(radius, 2) * height;
        printAreaVolMsg("volume", "cylinder", volume);
    }
}
