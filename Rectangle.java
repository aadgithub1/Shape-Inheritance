public class Rectangle extends TwoDimensionalShape{

    public Rectangle(int dimensions){
        super(dimensions);

        System.out.println("You have chosen a rectangle\nEnter the length: ");
        double length = chooser.getDoubleChoice();
        System.out.println("Enter is the width: ");
        double width = chooser.getDoubleChoice();
        area = length * width;
        printAreaVolMsg();
    }

    @Override
    public void printAreaVolMsg() {
        System.out.println("The area of the rectangle is: " + area);
    }
    
}
