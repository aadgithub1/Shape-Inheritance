// TrianglePanel.java
// Sep 7 2024
// Aaron D. Webb
// TrianglePanel.java creates a new ShapePanel
// which will be added to the MenuPanel, which
// will be added to a Frame to display
// shape menu. The triangle image is added to
// the TrianglePanel via the ShapePanel parent class.

public class TrianglePanel extends ShapePanel{
    public TrianglePanel(String shapeName, String filePath){
        super(shapeName, filePath);
    }
}

