import java.awt.*;

public class VisualizerCanvas extends Canvas {
    private ComparisonSort algorithm; 
    private Element[] array;
    private final int FRAME_WIDTH = 800;
    private final int FRAME_HEIGHT = 600;

    VisualizerCanvas(){
    }

    public void setAlgorithm(ComparisonSort a){ 
        algorithm = a;
        array = algorithm.getArray();
    }

    public void paint(Graphics g){
        for(int i=0;i<array.length;i++){
            g.setColor(array[i].color);
            int w = array.length*40<FRAME_WIDTH ? 20 : FRAME_WIDTH/(2*array.length);
            int h = array[i].size*(200/array.length);
            int x = w+(FRAME_WIDTH/2)-((2*w)*((array.length/2)-i));
            int y = 400-h;
            g.fillRect(x,y,w,h);
        }
    } 
}
