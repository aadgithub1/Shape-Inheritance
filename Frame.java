import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class Frame extends JFrame{
    MenuPanel menu = new MenuPanel();
    public Frame(){
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println(menu.shapeToDraw);
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(menu);
        pack();
        setVisible(true);
    }
}
