// Main.java
// Aug 23 2024
// Aaron D. Webb
// Main.java holds the main method which runs the program.
// It prints a welcome message then enters a loop
// which is used to determine whether the user would like to continue
// using the program.
// It contains static objects that are used in the main method and
// the continueQuestion() method.
// The printShapesMenu() method prints the shapes menu and
// the continueQuestion() method has logic that helps determine whether
// the user would like to continue selecting from the menu.
// On each successful iteration the ShapeBuilder returns the Shape which the user
// selected.
public class Main{
    static Chooser chooser = new Chooser();
    static ShapeBuilder builder = new ShapeBuilder();
    static Shape currentShape = new Shape(2);
    public static void main(String[] args) {
        MenuFrame gui = new MenuFrame();
    }
}