public class Cube extends ThreeDimensionalShape{
    double sideLength;
    public Cube(int dimensions) {
        super(dimensions);

        System.out.println("You selected a Cube\nEnter the side length: ");
        sideLength = chooser.getDoubleChoice();
        volume = Math.pow(sideLength, 3);
        printAreaVolMsg("volume", "cube", volume);
    }
    
}
