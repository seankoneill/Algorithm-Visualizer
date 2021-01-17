public class InsertionSort extends ComparisonSort {

  InsertionSort(int size, int d){
    generateRandomArray(size);
    delay = d;
  }    

  public synchronized void run() {
    System.out.println("Sorting");
    for (int j,i = 0; i < size; i++) {
      j = i;
      while (j > 0 && array[j-1].getValue() > array[j].getValue()) {
        array[j].setColor(PROCESS_COLOR);
        array[j-1].setColor(PROCESS_COLOR);
        drawSleep();
        swapElements(j-1,j);
        drawSleep();
        array[j].setColor(SORTED_COLOR);
        array[j-1].setColor(SORTED_COLOR);
        j--;
      }
    }
    drawSleep();
  }
}
