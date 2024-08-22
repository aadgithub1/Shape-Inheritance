
public class Shape{
    int numDimensions;

    public Shape(int dimensions){
        this.numDimensions = dimensions;
    }

    public void printDimension(){
        System.out.println("The number of dimensions is " + this.numDimensions);
    }
}