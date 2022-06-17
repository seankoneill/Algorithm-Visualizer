import javax.swing.JFrame;

public class VisualizerView extends JFrame {
  private SortingPanel panel;

  VisualizerView() {
    panel = new SortingPanel();
    add(panel);
    setSize(800, 650);
    setVisible(true);
  }
  
  public SortingPanel getPanel() {
    return panel;
  }
}
