public class QuickSort extends ComparisonSort {

  QuickSort(int size, int d){
    generateRandomArray(size);
    delay = d;
  }    

  public synchronized void run() {
    System.out.println("Sorting");
    quicksort(0, size - 1);
  }

  private void quicksort(int low, int high) {
    if (low < high) {
      int p = partition(low, high);
      quicksort(low, p - 1);
      quicksort(p + 1, high);
    } else {
      if (low > 0 && low < size)
        array[low].setColor(SORTED_COLOR);
      if (high > 0 && high < size)
        array[high].setColor(SORTED_COLOR);
    }
  }

  private int partition(int low, int high) {
    int pIndex = (high + low) / 2;
    ArrayElement pivot = array[pIndex];
    int pNum = pivot.getValue();
    pivot.setColor(PROCESS_COLOR);
    while (true) {
      while (array[low].getValue() < pNum) {
        array[low].setColor(PROCESS_COLOR);
        drawSleep();
        array[low].setColor(UNSORTED_COLOR);
        low++;
      }
      while (array[high].getValue() > pNum) {
        array[high].setColor(PROCESS_COLOR);
        drawSleep();
        array[high].setColor(UNSORTED_COLOR);
        high--;
      }
      if (low >= high) {
        pivot.setColor(SORTED_COLOR);
        drawSleep();
        return high;
      }
      swapElements(low,high);
      drawSleep();
    }
  }
}
