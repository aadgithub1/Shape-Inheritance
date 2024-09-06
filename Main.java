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

import javax.swing.JFrame;

public class Main{
    MenuPanel menu = new MenuPanel();
    JFrame frame;

    public Main(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(menu);
        frame.pack();
        frame.setVisible(true);
    }



    public static void main(String[] args) {
        Main main = new Main();
    }
}