
public class ShapeBuilder {
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
            default:
                return new Shape(2);
        }
    }
}
