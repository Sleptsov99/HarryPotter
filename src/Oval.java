import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Oval {
    int x;
    int y;
    int tekx1 = 437;
    int prex1;
    int texy1 = 634;
    int prey1;
    int tekx2 = 437;
    int prex2;
    int texy2 = 634;
    int prey2;
    int tekx3 = 437;
    int prex3;
    int teky3 = 634;
    int prey3;
    int tekx11 = 0;
    int tekx22 = 0;
    int tekx33 = 0;
    int texy11 = 0;
    int texy22 = 0;
    int teky33 = 0;
    int l1 = 1;
    int prel1 = 1;
    int l2 = 1;
    int prel2 = 1;
    int l3 = 1;
    int prel3 = 1;
    int x1;
    int n = 3;
    int y1;
    int k1 = 1;
    int p = 16;
    int f = 0;
    int count;
    int dshag = 31;
    Cube cube = new Cube();
    BufferedImage Harry;
    BufferedImage Hermiona;
    BufferedImage Ron;


    public Oval(int x, int y) throws IOException {
        this.x = x;
        this.y = y;

    }

    Swipe sw = new Swipe();
    public void paint(Graphics g) {
        int[] preplaces = {prel1, prel2, prel3};
        int[] places = {l1, l2, l3};
        BufferedImage[] images = {Harry, Hermiona, Ron};

        //BufferedImage[] images = {Harry, Hermiona, Ron};
        if (f == 0) {
            for (int i = 0; i < n; i++) {
                int dx = 30;
                sw.drawSwipe(g, i,images[i], preplaces[i], places[i], dx * (i - 1));
                // g.drawImage(images[i],placesx[i]+dx,placesy[i]);
                //g.fillOval(placesx[i]+dx,placesy[i],30,30 );
            }
        }


        }
    }