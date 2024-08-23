public class Triangle extends TwoDimensionalShape{
    double base;
    double height;
    public Triangle(int dimensions) {
        super(dimensions);

        System.out.println("You have chosen a Triangle\nEnter the base: ");
        base = chooser.getDoubleChoice();
        System.out.println("Enter the height: ");
        height = chooser.getDoubleChoice();
        area = 0.5 * (base * height);
        printAreaVolMsg("area", "triangle", area);
    }
}
