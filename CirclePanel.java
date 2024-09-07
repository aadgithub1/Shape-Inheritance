// CirclePanel.java
// Sep 7 2024
// Aaron D. Webb
// CirclePanel.java creates a new ShapePanel
// which will be added to the MenuPanel, which
// will be added to a Frame to display
// shape menu. The circle image is added to
// the CirclePanel via the ShapePanel parent class.

public class CirclePanel extends ShapePanel{
    public CirclePanel(String shapeName, String filePath){
        super(shapeName, filePath);
    }
}
