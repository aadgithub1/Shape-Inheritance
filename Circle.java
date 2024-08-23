public class Circle extends TwoDimensionalShape implements PrintAreaMessage{
    private double radius;
    public Circle(int dimensions) {
        super(dimensions);

        System.out.println("You have selected a Circle.\nEnter the radius of the circle: ");
        radius = chooser.getDoubleChoice();
        area = Math.PI * Math.pow(radius, 2);
        printAreaMsg();
    }

    public void printAreaMsg(){
        System.out.println("The area of the Circle is " + area);
    }

    
}
