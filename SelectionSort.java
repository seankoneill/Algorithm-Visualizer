public class SelectionSort extends ComparisonSort {

  SelectionSort(int size, int d){
    generateRandomArray(size);
    delay = d;
  }    

  public synchronized void run() {
    System.out.println("Sorting");
    for (int i = 0; i < size; i++) {
      int largest = 0;
      for (int j = 0; j < size - i; j++) {
        array[largest].setColor(PROCESS_COLOR);
        array[j].setColor(PROCESS_COLOR);
        drawSleep();
        array[largest].setColor(UNSORTED_COLOR);
        array[j].setColor(UNSORTED_COLOR);
        if (array[j].getValue() > array[largest].getValue())
          largest = j;
      }
      swapElements(size - i - 1,largest);
      array[size - i - 1].setColor(SORTED_COLOR);
      drawSleep();
    }
  }
}
