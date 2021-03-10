import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Oval {
    int x;
    int y;
    int size = 40;
    int tekx1 = 437;
    int texy1 = 634;
    int tekx2 = 437;
    int texy2 = 634;
    int tekx3 = 437;
    int teky3 = 634;
    int l1 = 1;
    int l2 = 1;
    int l3 = 1;
    int x1;
    int n=3;
    int y1;
    int k1 = 1;
    int p = 16;
    int count;
    int dshag = 31;
    Cube cube = new Cube();
    BufferedImage Harry;
    BufferedImage Hermiona;
    BufferedImage Ron;

    public Oval(int x, int y)  {
        this.x = x;
        this.y = y;

    }

    public void paint(Graphics g){
        int[] places = {l1, l2, l3};
        int[] placesx={tekx1,tekx2,tekx3};
        int[]placesy={texy1,texy2,teky3};
        BufferedImage[] images={Harry,Hermiona,Ron};
        Color[] colors={Color.BLUE,Color.RED,Color.GREEN};
        for(int i=0;i<n;i++){
            g.setColor(colors[i]);
            int dx=0;
            for(int j=0; j<i;j++){
                if(places[i]==places[j]){
                    dx+=40;
                }
            }
            g.drawImage(images[i],placesx[i]+dx,placesy[i],40,40,null);
           // g.drawImage(images[i],placesx[i]+dx,placesy[i]);
            //g.fillOval(placesx[i]+dx,placesy[i],30,30 );
        }

    }

    public void SravnenieZnachenia(int x1, int y1) {

    }
}