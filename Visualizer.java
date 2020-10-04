import java.awt.event.*;

public class Visualizer extends Thread {

    private static VisualizerView view;
    private static ComparisonSort model;

    private static KeyListener listener = new KeyListener(){
        @Override
        public void keyPressed(KeyEvent e){
        }
        @Override
        public void keyReleased(KeyEvent e){
            if(e.getKeyCode()==KeyEvent.VK_SPACE){ 
                handleSpace(); 
                System.out.println("Space pressed");
            }
        }
        @Override
        public void keyTyped(KeyEvent e){
        }
    };

    public static void main(String[] args){
        model = new BubbleSort(50, 1000);
        view = new VisualizerView();
        model.setView(view);
        view.setAlgorithm(model);
        view.addKeyListener(listener);
    }         

    public static void handleSpace() {
        synchronized(model) {
            toggleModel();
        }
    }

    public static void toggleModel() {
        try {
            Thread.State state = model.getState();
            if(state == Thread.State.NEW) {
                model.start();
            } else if(state == Thread.State.RUNNABLE) {
                model.wait();
            } else if(state == Thread.State.WAITING) {
                model.notify();
            } else if(state == Thread.State.TERMINATED) {
                System.out.println("Thread Terminated");
            }
        } catch (InterruptedException e) {

        }
    }
}
