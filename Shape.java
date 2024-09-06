// Shape.java
// Aug 23 2024
// Aaron D. Webb
// Shape.java represents a basic shape and serves as the
// top of the package class hierarchy.
// It establishes fields and methods that are common
// to all shapes. Namely, a number of dimensions
// and the ability to return that number of dimensions
// (as an int) as well as print the number of dimensions
// in an output sentence.
// The class also creates a Chooser object that is accessible
// to its child classes and a printAreaVolMsg method which
// takes in characteristics as parameters and displays 
// information about them. This method also formats output
// to be rounded to 2 decimal places.

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Shape extends JFrame implements ActionListener{
    protected Chooser chooser = new Chooser();
    protected int numDimensions;

    public Shape(int dimensions){
        this.numDimensions = dimensions;
        setPreferredSize(new Dimension(600, 600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public Shape(int dimensions, JLabel shapeToAdd){
        this.numDimensions = dimensions;
        setPreferredSize(new Dimension(600, 600));
        this.add(shapeToAdd);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

    }

    public void add(Object obj){
        this.add(obj);
        this.setLayout(new FlowLayout());
    }

    public void printDimension(){
        System.out.println("The number of dimensions is " + this.numDimensions);
    }

    public int getDimension(){
        return this.numDimensions;
    }
    //takes in characteristics of a shape and prints context msg
    public void printAreaVolMsg(String areaOrVol, String shape, double rawAreaOrVol) {
        System.out.println("The " + areaOrVol + " of the " + shape + " is " + Math.round(rawAreaOrVol*100.0)/100.0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}