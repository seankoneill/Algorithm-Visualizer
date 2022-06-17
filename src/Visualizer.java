import javax.swing.JFrame;
import java.util.Scanner;

public class Visualizer {

  private static VisualizerView view;
  private static ComparisonSort model;

  public static void main(String[] args) throws InterruptedException {
    System.setProperty("sun.java2d.opengl", "true");

    Scanner scan = new Scanner(System.in);
    int choice = - 1;
    while (choice != 0) {
      System.out.println("Please enter a number");
      System.out.println("1: BubbleSort");
      System.out.println("2: HeapSort");
      System.out.println("3: InsertionSort");
      System.out.println("4: SelectionSort");
      System.out.println("5: QuickSort");
      System.out.println("0: Quit\n");
      System.out.print(">> ");
      choice = scan.nextInt();
      switch (choice) {
        case 1:
          model = new BubbleSort(100, 1);
          break;
        case 2:
          model = new HeapSort(100, 1);
          break;
        case 3: 
          model = new InsertionSort(100, 1);
          break;
        case 4:
          model = new SelectionSort(100, 1);
          break;
        case 5:
          model = new QuickSort(100, 1);
          break;
        default:
          continue;
      }
      view = new VisualizerView();
      view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      view.getPanel().setArray(model.getArray());

      model.setView(view);
      Thread.sleep(2000);
      model.start();

      model.join();
      Thread.sleep(1000);
      view.dispose();
    }
  }
}
