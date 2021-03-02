import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Cube {
    int x = 320;
    int y = 120;
    int k;

    public Cube() {
    }

    public void drawCube(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(x, y, 50, 50);
        g.setColor(Color.black);
        g.drawString(String.valueOf(k), x+15, y+33);
    }
}
