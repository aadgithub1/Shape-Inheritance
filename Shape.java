
public class Shape{
    protected Chooser chooser = new Chooser();
    protected int numDimensions;

    public Shape(int dimensions){
        this.numDimensions = dimensions;
    }

    public void printDimension(){
        System.out.println("The number of dimensions is " + this.numDimensions);
    }

    public int getDimension(){
        return this.numDimensions;
    }

    public void printAreaVolMsg(String areaOrVol, String shape, double rawAreaOrVol) {
        System.out.println("The " + areaOrVol + " of the " + shape + " is " + Math.round(rawAreaOrVol*100.0)/100.0);
    }
}