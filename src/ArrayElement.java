import java.awt.Color;

public class ArrayElement {
  private int value;
  private Color color;

  ArrayElement(int n, Color c) {
    value = n;
    color = c;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int n) {
    value = n;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color c) {
    color = c;
  }
}
