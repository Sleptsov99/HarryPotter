import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class Object implements MouseListener {
    public int x0 = 100;

    public int y0 ;
    public int width ;
    public int height ;
    int k=1;

//public BufferedImage image;

    public Object (int x0, int y0, int width, int height) {

        this.x0 = x0;
        this.y0 = y0;
        this.width = width;
        this.height = height;

// this.image = image;
    }

    public void draw(Graphics g) {
// g.drawRect(x0, y0, width, height);
        g.setColor(Color.blue);
        g.drawRect(x0, y0, width, height);
    }

    @Override
    public void mouseClicked(MouseEvent e){


    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
