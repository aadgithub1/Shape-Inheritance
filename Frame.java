import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.event.*;

public class Frame extends JFrame implements ActionListener{

    JPanel panel;
    JComboBox<String> dropdown;
    final String[] shapes = {"Circle", "Rectangle", "Square", "Triangle", "Cone", "Cube", "Cylinder", "Sphere", "Torus"};

    public Frame(){
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 600));

        dropdown = new JComboBox<String>(shapes);
        panel.add(dropdown);

        add(panel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
}
