// CylinderPanel.java
// Sep 7 2024
// Aaron D. Webb
// CylinderPanel.java creates a new ShapePanel
// which will be added to the MenuPanel, which
// will be added to a Frame to display the
// shape menu. The cylinder image is added to
// the CylinderPanel via the ShapePanel parent class.

public class CylinderPanel extends ShapePanel{
    public CylinderPanel(String shapeName, String filePath){
        super(shapeName, filePath);
    }
}
