import java.awt.Color;
import java.util.Random;

public abstract class ComparisonSort extends Thread {

  public static final Color UNSORTED_COLOR = Color.BLACK;
  public static final Color SORTED_COLOR = Color.GREEN;
  public static final Color PROCESS_COLOR = Color.BLUE;

  protected ArrayElement[] array;
  protected VisualizerView view;
  protected int delay;
  protected int size;

  public ArrayElement[] getArray() { return array; }

  public void setView(VisualizerView v) { view = v; }

  protected void generateRandomArray(int n){
    Random rand = new Random();
    size = n;
    this.array = new ArrayElement[size];
    int i,r;
    for(i = 0; i<size; i++){
      array[i] = new ArrayElement(i+1, UNSORTED_COLOR);
    }
    for (i = 0; i < size; i++) {
      r = rand.nextInt(size);
      swapElements(r,i);
    }  
  }

  protected void swapElements(int i, int j) {
    ArrayElement tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
  }

  protected void drawSleep() {
    try {
      view.getPanel().repaint();
      Thread.sleep(delay);
    } catch (InterruptedException e) {}
  }

  protected void drawSleep(int s) {
    try {
      view.getPanel().repaint();
      Thread.sleep(s);
    } catch (InterruptedException e) {}
  }
}
