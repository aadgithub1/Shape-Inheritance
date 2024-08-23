import java.text.SimpleDateFormat;
import java.util.Date;

public class ShapeBuilder {
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("MMM d 'at' h:mm a");
    public ShapeBuilder(){
    }

    public Shape creatShape(String key){
        switch (Integer.parseInt(key)) {
            case 1:
                return new Circle(2);
            case 2:
                return new Rectangle(2);
            case 3:
                return new Square(2);
            case 4:
                return new Triangle(2);
            case 5:
                return new Sphere(3);
            case 6:
                return new Cube(3);
            case 7:
                return new Cone(3);
            case 8:
                return new Cylinder(3);
            case 9:
                return new Torus(3);
            case 10:
                System.out.println("Thanks for using the program. Today is " + formatter.format(date) + "."); //+ date);
            default:
                return new Shape(2);
        }
    }
}
