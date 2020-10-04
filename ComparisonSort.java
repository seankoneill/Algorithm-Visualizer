import java.awt.Color;

public abstract class ComparisonSort extends Thread {

    protected VisualizerView view;
    protected boolean isSorted = false;
    protected Element[] array = {};
    protected int delay;

    public boolean isSorted() { return isSorted; }
    public Element[] getArray() { return array; }
    public void setView(VisualizerView v){ view = v; }

    protected Element[] generateRandomArray(int size){
        Element[] array = new Element[size];
        for(int i=0;i<array.length;i++){
            array[i] = new Element(i, Color.BLACK);
        }
        return shuffleArray(array);
    }

    protected Element[] shuffleArray(Element[] array){
        for(int i=0;i<array.length;i++){
            Element tmp = array[i];
            int rand = (int)(Math.random()*(array.length-1));
            array[i] = array[rand];
            array[rand] = tmp;
        }
        return array;
    } 
}    
