public class Square extends TwoDimensionalShape{
    double sideLength;
    public Square(int dimensions) {
        super(dimensions);

        System.out.println("You have chosen a Square\nEnter the side length: ");
        sideLength = chooser.getDoubleChoice();
        area = Math.pow(sideLength, 2);
        printAreaVolMsg();
    }

    @Override
    public void printAreaVolMsg(){
        System.out.println("The area of the square is " + area);
    }
    
}
