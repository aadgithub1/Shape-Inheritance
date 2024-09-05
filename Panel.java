import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Panel extends JPanel implements ActionListener{
    ImageIcon image;
    JLabel label;
    public Panel(){
        setPreferredSize(new Dimension(200, 200));
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
