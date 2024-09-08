// Frame.java
// Sep 7 2024
// Aaron D. Webb
// Extends JFrame. Used to display
// MenuPanel.

import javax.swing.JFrame;

public class Frame extends JFrame{
    MenuPanel menu = new MenuPanel();
    public Frame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(menu);
        pack();
        setVisible(true);
    }
}
