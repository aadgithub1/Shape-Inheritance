import javax.swing.*;
import java.awt.*;

public class ShapePanel extends JPanel{
    ImageIcon image;
    JLabel label;
    String shapeName;
    String filePath;
    public ShapePanel(String shapeName, String filePath){
        this.shapeName = shapeName;
        this.filePath = filePath;
        setPreferredSize(new Dimension(200, 200));
        image = new ImageIcon(filePath);
        label = new JLabel();

        label.setIcon(image);
        label.setText(shapeName);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        add(label);
    }
}
