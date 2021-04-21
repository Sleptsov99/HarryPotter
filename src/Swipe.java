import java.awt.*;
import java.awt.image.BufferedImage;

public class Swipe {
    int[] polyay = new int[]{640, 601, 547, 515, 465, 417, 398, 374, 347, 303, 304, 221, 225, 276, 360, 365, 344, 371, 398, 447, 513, 554, 689, 656, 683, 700, 695};
    int[] polyax = new int[]{446, 438, 415, 452, 427, 379, 328, 382, 421, 493, 556, 1035, 1114, 1200, 1237, 1152, 960, 1032, 1109, 1103, 1090, 1138, 1191, 1026, 888, 749, 666};
    public Swipe(){}

    int[] last_places = new int[]{0,0,0};
    long[] startTime = new long[]{0,0,0};
    boolean[] isMoving = new boolean[]{false, false, false};
    public void drawSwipe(Graphics g, int pers, BufferedImage image0, int preplace, int place, int dx){
        if(last_places[pers] < place && !isMoving[pers]) {
            startTime[pers] = System.currentTimeMillis();
        }
        isMoving[pers] = last_places[pers] != place;
        if(isMoving[pers]) {
            long curTime = System.currentTimeMillis();
            int stepTime = 1000;
            int p = last_places[pers];
            double k = (curTime - startTime[pers]) * 1.0 / stepTime;
            g.drawImage(image0, (int) ((polyax[p + 1] - polyax[p]) * k + polyax[p])+dx, (int) ((polyay[p + 1] - polyay[p]) * k + polyay[p]), 40, 40, null);
            if (k >= 1) {
                last_places[pers]++;
                startTime[pers] = curTime;
            }
        }else{
            g.drawImage(image0, polyax[place]+dx, polyay[place], 40, 40, null);
        }
    }
}
