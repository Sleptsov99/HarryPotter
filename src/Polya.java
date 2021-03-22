import java.awt.*;

public class Polya {
    int x0;
    int y0;
    int size;
    int n;
    int i;
    int k;
    int qr;
    int count = 27;
    int proverka = 0;
    int[] polyay = new int[]{640, 601, 547, 515, 465, 417, 398, 374, 347, 303, 304, 221, 225, 276, 360, 365, 344, 371, 398, 447, 513, 554, 689, 656, 683, 700, 695};
    int[] polyax = new int[]{446, 438, 415, 452, 427, 379, 328, 382, 421, 493, 556, 1035, 1114, 1200, 1237, 1152, 960, 1032, 1109, 1103, 1090, 1138, 1191, 1026, 888, 749, 666};

    public Polya(
    ) {

    }

    public void paintPolya(Graphics g) {
        if (proverka == 0) {
            for (int i = 0; i < count; i++) {
                g.setColor(Color.BLACK);
                g.drawString(String.valueOf(i), polyax[i] - 6, polyay[i]);
            }
//нарисовать черным, потом убратьб
        }
    }

}
