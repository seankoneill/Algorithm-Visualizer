import java.util.Random;

public class BogoSort extends ComparisonSort {

  BogoSort(int size, int d){
    generateRandomArray(size);
    delay = d;
  }    

  public synchronized void run() {
    Random r = new Random();
    System.out.println("Sorting");
    while (!isSorted()) {
      for (int i = 0; i < size; i++) {
        swapElements(i,r.nextInt(size));
      }
      drawSleep();
    }
    drawSleep();
  }

  private boolean isSorted() {
    int i = 1;
    while (i < size) {
      if (array[i-1].getValue() > array[i].getValue())
        break;
      array[i-1].setColor(SORTED_COLOR);
      drawSleep();
      i++;
    }
    if (i == size) {
      array[i-1].setColor(SORTED_COLOR);
      return true;
    }
    for (int j = 0; j <= i; j++) {
      array[j].setColor(UNSORTED_COLOR);
    }
    drawSleep();
    return false;
  }
}
