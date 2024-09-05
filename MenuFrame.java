import javax.swing.*;

import java.awt.Dimension;
import java.awt.*;
import java.awt.event.*;

public class MenuFrame extends JFrame implements ActionListener{
    // JPanel panel;
    // ImageIcon image;
    // JLabel label;
    CirclePanel circlePanel = new CirclePanel();

    public MenuFrame(){
        setPreferredSize(new Dimension(600, 600));

        // panel = new JPanel();
        // image = new ImageIcon("circle.png");
        // label = new JLabel();

        // label.setIcon(image);
        // label.setText("circ");
        // panel.add(label);

        add(circlePanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
            
    }
}
