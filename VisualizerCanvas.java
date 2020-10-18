import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Toolkit;

public class VisualizerCanvas extends Canvas {

  private Element[] array;

  VisualizerCanvas() {
  }

  public void setAlgorithm(ComparisonSort algorithm) { 
    array = algorithm.getArray();
  }

  public void paint(Graphics g){
    for(int i = 0; i < array.length; i++) {
      g.setColor(array[i].color);
      int w = this.getWidth() / (array.length * 2); 
      int h = (this.getHeight() / array.length) * i;
      int x = (2*i*w) + w/2;
      int y = this.getHeight() - h;
      g.fillRect(x,y,w,h);
      Toolkit.getDefaultToolkit().sync();
    }
  } 
}
