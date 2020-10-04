import java.awt.Color;

public class Element {
    int size;
    Color color;

    Element(int s, Color c) {
        size = s;
        color = c;
    }

    @Override
    public String toString() {
        return "(" + size + "," + color + ")";
    }
}
