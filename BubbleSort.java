import java.awt.Color;
import java.awt.Toolkit;

public class BubbleSort extends ComparisonSort {

  BubbleSort(int size, int delay){
    array = generateRandomArray(size);
    isSorted = false;
    this.delay = delay;
  }    

  public void run() {
    System.out.println("Sorting");
    int size = array.length;
    try {
      for (int i = 0; i < size; i++) {
        for (int j = 0; j < size - i - 1; j++) {
          array[j].color = Color.RED;
          array[j+1].color = Color.RED;
          view.update();
          Thread.sleep(10);
          if (array[j].size > array[j+1].size) {
            Element tmp = array[j];
            array[j] = array[j+1];
            array[j+1] = tmp;
          }
          array[j].color = Color.BLACK;
          array[j+1].color = Color.BLACK;
          view.update();
          Thread.sleep(10);
        }
      array[size - i - 1].color = Color.GREEN;
      view.update();
      }
    } catch (InterruptedException e) {}
  }
}
