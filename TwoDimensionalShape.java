public class TwoDimensionalShape extends Shape{
    protected double area;
    public TwoDimensionalShape(int dimensions) {
        super(dimensions);
    }

    public void printAreaMsg(){
        System.out.println("The area is of this 2D is " + area);
    }
    
}
