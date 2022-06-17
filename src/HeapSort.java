public class HeapSort extends ComparisonSort {

  HeapSort(int size, int d){
    generateRandomArray(size);
    delay = d;
  }    

  public synchronized void run() {
    System.out.println("Sorting");
    for (int i = size - 1; i >= 0; i--) {
      heapify(i, size);
    }
    drawSleep(1000);

    for (int i = size - 1; i >= 0; i--) {
      swapElements(0, i);
      array[i].setColor(SORTED_COLOR);
      drawSleep();
      heapify(0, i);
    }
    array[0].setColor(SORTED_COLOR);
    drawSleep();
  }

  private void heapify(int i, int n) {
    int largest = i;
    int left = (2*i)+1;
    int right = (2*i)+2;

    array[largest].setColor(PROCESS_COLOR);
    if (left < n) {
      array[left].setColor(PROCESS_COLOR);
      drawSleep();

      if (array[left].getValue() > array[largest].getValue()) {
        largest = left;
      }

      array[left].setColor(UNSORTED_COLOR);
      drawSleep();
    }

    if (right < n) {
      array[right].setColor(PROCESS_COLOR);
      drawSleep();

      if (array[right].getValue() > array[largest].getValue()) {
        largest = right;
      }
      
      array[right].setColor(UNSORTED_COLOR);
      drawSleep();
    }
    array[largest].setColor(UNSORTED_COLOR);

    if (largest != i) {
      swapElements(i, largest);
      heapify(largest, n);
    }
  }
}
