public class Main{
    static Chooser chooser = new Chooser();
    static ShapeBuilder builder = new ShapeBuilder();
    static Shape currentShape = new Shape(2);
    public static void main(String[] args) {
        System.out.println("*****Welcome to the Java OO Shapes Program*****");

        //I want to create the objects like I have been and
        //continually print the shapes menu until the user explicitly enters 10

        do{
            printShapesMenu();
            currentShape = builder.creatShape(chooser.getChoice());
            continueQuestion();
        }   while (currentShape.getDimension() != 0);
    }

    private static void printShapesMenu(){
        System.out.println("Select from the menu below:");
        System.out.println("1. Construct a Circle");
        System.out.println("2. Construct a Rectangle");
        System.out.println("3. Construct a Square");
        System.out.println("4. Construct a Triangle");
        System.out.println("5. Construct a Sphere");
        System.out.println("6. Construct a Cube");
        System.out.println("7. Construct a Cone");
        System.out.println("8. Construct a Cylinder");
        System.out.println("9. Construct a Torus");
        System.out.println("10. Exit");
    }

    private static void continueQuestion(){
        while (true){
            System.out.println("Would you like to continue? (Y/N)");
            String response = chooser.getChoice().toUpperCase();

            if (response.equals("Y")){
                System.out.println("in Y block");
                return;
            } else if (response.equals("N")){
                currentShape = builder.creatShape("10"); //exits with thank you message
                return;
            } else{
                System.out.println("Please enter a valid character.");
            }
        }
    }
}