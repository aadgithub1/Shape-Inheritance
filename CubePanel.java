// CubePanel.java
// Sep 7 2024
// Aaron D. Webb
// CubePanel.java creates a new ShapePanel
// which will be added to the MenuPanel, which
// will be added to a Frame to display
// shape menu. The cone image is added to
// the CubePanel via the ShapePanel parent class.
public class CubePanel extends ShapePanel{
    public CubePanel(String shapeName, String filePath){
        super(shapeName, filePath);
    }
}
