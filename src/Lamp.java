import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Lamp {
    int x = 127;
    int y = 595;
    int k;
    BufferedImage ball;
    public Lamp() throws IOException {
        this.ball= ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Магический-шар.png"));
    }

    public void drawLamp(Graphics g) {
       g.drawImage(ball,x,y,100,100,null);
        g.setColor(Color.black);
        g.drawString(String.valueOf(k), x+40, y+55);
    }
}
