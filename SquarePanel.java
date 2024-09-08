// SquarePanel.java
// Sep 7 2024
// Aaron D. Webb
// SquarePanel.java creates a new ShapePanel
// which will be added to the MenuPanel, which
// will be added to a Frame to display
// shape menu. The square image is added to
// the SquarePanel via the ShapePanel parent class.

public class SquarePanel extends ShapePanel{
    public SquarePanel(String shapeName, String filePath){
        super(shapeName, filePath);
    }
}
