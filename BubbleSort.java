import java.awt.Color;

public class BubbleSort extends ComparisonSort {

    BubbleSort(int size, int delay){
        array = generateRandomArray(size);
        isSorted = false;
        this.delay = delay;
    }    

    public void run() {
        System.out.println("Sorting");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                array[j].color = Color.RED;
                array[j+1].color = Color.RED;
                view.update();
                if (array[j].size>array[j+1].size) {
                    Element tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
                array[j].color = Color.GREEN;
                array[j+1].color = Color.GREEN;
                view.update();
            }
        }
        for (Element e : array) {
            System.out.print(e);
        }
    }
}
