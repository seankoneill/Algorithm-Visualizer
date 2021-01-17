import javax.swing.JFrame;

public class Visualizer {

  private static VisualizerView view;
  private static ComparisonSort model;

  public static void main(String[] args){
    System.setProperty("sun.java2d.opengl", "true");
    model = new BubbleSort(200, 1);
    view = new VisualizerView();
    view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    view.getPanel().setArray(model.getArray());

    model.setView(view);
    model.start();
  }
}
