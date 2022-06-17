public class BubbleSort extends ComparisonSort {

  BubbleSort(int size, int d){
    generateRandomArray(size);
    delay = d;
  }    

  public synchronized void run() {
    System.out.println("Sorting");
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size - i - 1; j++) {
        array[j].setColor(PROCESS_COLOR);
        array[j+1].setColor(PROCESS_COLOR);
        drawSleep();
        if (array[j].getValue() > array[j+1].getValue()) {
          drawSleep();
          swapElements(j,j+1);
          drawSleep();
        }
        array[j].setColor(UNSORTED_COLOR);
        array[j+1].setColor(UNSORTED_COLOR);
        drawSleep();
      }
      array[size - i - 1].setColor(SORTED_COLOR);
      drawSleep();
    }
  }
}
