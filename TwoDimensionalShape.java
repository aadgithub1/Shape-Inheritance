public class TwoDimensionalShape extends Shape implements AreaOrVolumePrinter{
    protected double area;
    public TwoDimensionalShape(int dimensions) {
        super(dimensions);
    }

    public void printAreaVolMsg(){
        System.out.println("The area is of this 2D is " + area);
    }
    
}
