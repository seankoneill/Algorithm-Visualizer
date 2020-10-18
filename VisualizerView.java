import javax.swing.JFrame;

public class VisualizerView extends JFrame {
  private VisualizerCanvas canvas;
  public Visualizer controller;

  VisualizerView() {
    canvas = new VisualizerCanvas();
    add(canvas);
    setSize(1000, 1000);
    setVisible(true);
  }

  public void setAlgorithm(ComparisonSort a) {
    canvas.setAlgorithm(a);
  }

  public void update() {
    canvas.repaint();
  }
}


