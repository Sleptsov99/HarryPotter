import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Info {
    BufferedImage Harry;
    BufferedImage Dambldor;
    BufferedImage Snegg;
    int x1 = 1340;
    int y1 = 100;
    int x2 = 1340;
    int y2 = 160;
    int x3 = 1340;
    int y3 = 220;
    int x;
    int y;
    int sizex = 60;
    int sizey = 50;
    int xp;
    int yp;
    int count = 0;

    public void Draw(int x1, int y1, int xp, int yp) {
        this.x1 = x1;
        this.y1 = y1;
        this.xp = xp;
        this.yp = yp;
    }

    public void PaintComponent(Graphics g) {
        if (count == 0) {
            g.setColor(Color.red);
            g.fillRect(x1, y1, sizex, sizey);
            g.setColor(Color.black);
            g.drawString("Дамблдор", x1 + 3, y1 +10);
            g.setColor(Color.red);
            g.fillRect(x2,y2,sizex,sizey);
            g.setColor(Color.black);
            g.drawString("Гарри Поттер",x2+3,y2+10);
            g.setColor(Color.red);
            g.fillRect(x3,y3,sizex,sizey);
            g.setColor(Color.black);
            g.drawString("Снегг",x3+3,y3+10);
        }
        if (count == 1) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 1440, 900);
            g.drawImage(Dambldor, 400, 200, 800, 650, null);

        }
        if(count==2){
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 1440, 900);
            g.drawImage(Harry, 400, 200, 800, 650, null);
        }
        if(count==3){
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 1440, 900);
            g.drawImage(Snegg, 400, 200, 900, 650, null);
        }
    }

    public Info(int x, int y) throws IOException {
        this.x = x;
        this.y = y;
        this.Dambldor = ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/dambldor.png"));
        this.Harry = ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Potter.png"));
        this.Snegg = ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Снимок экрана 2021-02-16 в 10.45.38.png"));
    }

    public void Sravnenie() {
        if ((xp >= 0) & (xp <= 1440) & (yp >= 0) && (yp <= 900)) {
            count = 0;
        }
        if ((xp >= x1) && (xp <= x1 + sizex) && (yp >= y1) && (yp <= y1 + sizey)) {
            count = 1;
        }
        if ((xp >= x2) && (xp <= x2 + sizex) && (yp >= y2) && (yp <= y2 + sizey)) {
            count = 2;
        }
        if ((xp >= x3) && (xp <= x3 + sizex) && (yp >= y3) && (yp <= y3 + sizey)) {
            count = 3;
        }
    }

}
