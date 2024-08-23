public class Rectangle extends TwoDimensionalShape{
    double length;
    double width;
    public Rectangle(int dimensions){
        super(dimensions);

        System.out.println("You have chosen a Rectangle\nEnter the length: ");
        length = chooser.getDoubleChoice();
        System.out.println("Enter is the width: ");
        width = chooser.getDoubleChoice();
        area = length * width;
        printAreaVolMsg("area", "rectangle", area);
    }
}
