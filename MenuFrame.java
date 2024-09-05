import javax.swing.*;

import java.awt.Dimension;
import java.awt.*;
import java.awt.event.*;

public class MenuFrame extends JFrame{
    Graphics2D g;
    CirclePanel circlePanel;
    Panel[] shapePanels = {
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

    public MenuFrame(){
        super("Choose a shape to draw!");
        setPreferredSize(new Dimension(600, 600));
        setLayout(new GridLayout(3,3));

        //TO-DO:
        // Change stroke weight


        for (Panel panel : shapePanels){
            add(panel);
            panel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e){
                    if (panel.shapeName == "Square"){
                        new Square(2).paint(g);
                    } else if (panel.shapeName == "Circle"){
                        new Circle(2).paint(g);
                    }
                }
            });
        }
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
