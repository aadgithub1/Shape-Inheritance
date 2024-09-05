import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Panel extends JPanel implements ActionListener{
    ImageIcon image;
    JLabel label;
    public Panel(String shapeName, String filePath){
        setPreferredSize(new Dimension(200, 200));
        image = new ImageIcon(filePath);
        label = new JLabel();

        label.setIcon(image);
        label.setText(shapeName);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        add(label);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
