// Main.java
// Sep 7 2024
// Aaron D. Webb
// MenuPanel adds ShapePanel objects
// to itself (an extension of JPanel) from
// an array of ShapePanels.
// The ShapePanels are added and
// have MouseListeners added to them
// using a for loop. 

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class MenuPanel extends JPanel{
    String shapeToDraw;
    ShapePanel[] shapePanels = {
        new CirclePanel("Circle", "resources/circle.png"),
        new RectanglePanel("Rectangle", "resources/rectangle.png"),
        new SquarePanel("Square", "resources/square.png"),
        new TrianglePanel("Triangle", "resources/triangle.png"),
        new ConePanel("Cone", "resources/cone.png"),
        new CubePanel("Cube", "resources/cube.png"),
        new CylinderPanel("Cylinder", "resources/cylinder.png"),
        new SpherePanel("Sphere", "resources/sphere.png"),
        new TorusPanel("Torus", "resources/torus.png")
    };

    public MenuPanel(){
        setSize(new Dimension(600, 600));
        setLayout(new GridLayout(3,3));


        for (ShapePanel panel : shapePanels){
            add(panel);
            panel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e){

                    shapeToDraw = panel.shapeName;

                    if (panel.shapeName == "Circle"){
                        new Circle(2);
                    } else if (panel.shapeName == "Rectangle"){
                        new Rectangle(2);
                    } else if (panel.shapeName == "Square"){
                        new Square(2);
                    } else if (panel.shapeName == "Triangle"){
                        new Triangle(2);
                    } else if (panel.shapeName == "Cone"){
                        new Cone(3);
                    } else if (panel.shapeName == "Cube"){
                        new Cube(3);
                    } else if (panel.shapeName == "Cylinder"){
                        new Cylinder(3);
                    } else if (panel.shapeName == "Sphere"){
                        new Sphere(3);
                    } else if (panel.shapeName == "Torus"){
                        new Torus(3);
                    }
                }
            });
        }
    }
}
