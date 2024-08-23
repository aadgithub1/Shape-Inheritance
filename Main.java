public class Main{
    public static void main(String[] args) {
        Chooser chooser = new Chooser();
        ShapeBuilder builder = new ShapeBuilder();
        printShapesMenu();
        builder.creatShape(chooser.getChoice());
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
}