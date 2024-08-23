public class ThreeDimensionalShape extends Shape implements AreaOrVolumePrinter{
    protected double volume;
    public ThreeDimensionalShape(int dimensions) {
        super(dimensions);
    }
    @Override
    public void printAreaVolMsg() {
        System.out.println("The volume is " + volume);
    }
    
}
