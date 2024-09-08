// RectanglePanel.java
// Sep 7 2024
// Aaron D. Webb
// RectanglePanel.java creates a new ShapePanel
// which will be added to the MenuPanel, which
// will be added to a Frame to display
// shape menu. The rectangle image is added to
// the RectanglePanel via the ShapePanel parent class.

public class RectanglePanel extends ShapePanel{
    public RectanglePanel(String shapeName, String filePath){
        super(shapeName, filePath);
    }
}
