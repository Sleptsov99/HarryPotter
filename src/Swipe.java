import java.awt.*;
import java.awt.image.BufferedImage;

public class Swipe {
    int[] polyay = new int[]{640, 601, 547, 515, 465, 417, 398, 374, 347, 303, 304, 221, 225, 276, 360, 365, 344, 371, 398, 447, 513, 554, 689, 656, 683, 700, 695};
    int[] polyax = new int[]{446, 438, 415, 452, 427, 379, 328, 382, 421, 493, 556, 1035, 1114, 1200, 1237, 1152, 960, 1032, 1109, 1103, 1090, 1138, 1191, 1026, 888, 749, 666};
    public Swipe(){}
    public void drawSwipe(Graphics g, BufferedImage image0, int preplace, int place, int dx){
        for (int i = preplace; i <= place; i = i + 1){
            g.drawImage(image0, polyax[i] + dx, polyay[i], 40, 40, null);
        }
    }
}
