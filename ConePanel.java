// ConePanel.java
// Sep 7 2024
// Aaron D. Webb
// ConePanel.java creates a new ShapePanel
// which will be added to the MenuPanel, which
// will be added to a Frame to display
// shape menu. The cone image is added to
// the ConePanel via the ShapePanel parent class.

public class ConePanel extends ShapePanel{
    public ConePanel(String shapeName, String filePath){
        super(shapeName, filePath);
    }
}
