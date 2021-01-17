import javax.swing.JPanel;
import java.awt.Graphics;

public class SortingPanel extends JPanel {

  private ArrayElement[] array;

  SortingPanel() {
    array = null;
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    for(int i = 0; i < array.length; i++) {
      g.setColor(array[i].getColor());
      int h = (this.getHeight() / array.length) * array[i].getValue();
      int w = (this.getWidth() / array.length); 
      int x = i*w;
      int y = this.getHeight() - h;
      g.fillRect(x,y,w,h);
    }
  } 

  public void setArray(ArrayElement[] a) {
    array = a;
  }
}
