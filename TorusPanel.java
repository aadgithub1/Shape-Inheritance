// TorusPanel.java
// Sep 7 2024
// Aaron D. Webb
// TorusPanel.java creates a new ShapePanel
// which will be added to the MenuPanel, which
// will be added to a Frame to display
// shape menu. The torus image is added to
// the TorusPanel via the ShapePanel parent class.

public class TorusPanel extends ShapePanel{
    public TorusPanel(String shapeName, String filePath){
        super(shapeName, filePath);
    }
}
