
public class ShapeBuilder {
    public ShapeBuilder(){
    }

    public Shape creatShape(String key){
        switch (Integer.parseInt(key)) {
            case 1:
                return new Circle(2);
            default:
                return new Shape(2);
        }
    }
}
