import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Cube {
    int x = 320;
    int y = 120;
    int k;
    BufferedImage ball;
    public Cube() throws IOException {
        this.ball= ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Магический-шар.png"));
    }

    public void drawCube(Graphics g) {
       g.drawImage(ball,x,y,100,100,null);
//        g.fillRect(x, y, 50, 50);
        g.setColor(Color.black);
        g.drawString(String.valueOf(k), x+40, y+55);
    }
}
