// SpherePanel.java
// Sep 7 2024
// Aaron D. Webb
// SpherePanel.java creates a new ShapePanel
// which will be added to the MenuPanel, which
// will be added to a Frame to display
// shape menu. The sphere image is added to
// the SpherePanel via the ShapePanel parent class.

public class SpherePanel extends ShapePanel {
    public SpherePanel(String shapeName, String filePath){
        super(shapeName, filePath);
    }
}
