public class Sphere extends ThreeDimensionalShape{
    double radius;
    public Sphere(int dimensions) {
        super(dimensions);
        
        System.out.println("You have chosen a Sphere\nEnter the radius: ");
        radius = chooser.getDoubleChoice();
        volume = (4/3) * Math.PI * Math.pow(radius, 3);
        printAreaVolMsg("volume", "sphere", volume);
    }
    
}
