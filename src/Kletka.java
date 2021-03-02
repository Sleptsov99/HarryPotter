import java.awt.*;

public class Kletka {
    int x0 = 100;
    int y0 = 100;
    int size = 40;
    int n;
    int i;
    int k;
    int h = 61;

    public Kletka(int n) {
        this.n = n;
    }

    public void drawKletka(Graphics g) {
        for (int i = 0; i < h; i++) {
            if ((0 <= i) && (i <= 15)) {
                g.setColor(new Color(245, 191, 55, 204));
                g.fillRect(x0 + i * size, y0, size, size);
                g.setColor(Color.black);
                g.drawRect(x0 + i * size, y0, size, size);//по горизонтали направо

// System.out.println(i);
            }
            if ((16 <= i) && (i <= 30)) {
                k = i - 16;
                g.setColor(new Color(0, 255, 42, 203));
                g.fillRect(x0 + size * 15, y0 + size * k, size, size);
                g.setColor(Color.black);
                g.drawRect(x0 + size * 15, y0 + size * k, size, size);
//вниз по вертикали
            }
            if ((31 <= i) && (i <= 45)) {
                k = i - 30;
                g.setColor(new Color(150, 3, 193, 203));
                g.fillRect(x0 + k * size, y0 + size * 15, size, size);
                g.setColor(Color.black);
                g.drawRect(x0 + k * size, y0 + size * 15, size, size);
//по горизонтали влево
            }
            if ((46 <= i) && (i <= 61)) {
                k = i - 46;
                g.setColor(new Color(0, 166, 255, 204));
                g.fillRect(x0, 700 - k * size, size, size);
                g.setColor(Color.black);
                g.drawRect(x0, 700 - k * size, size, size);
//по вертикали вверх

            }
        }
    }

}
