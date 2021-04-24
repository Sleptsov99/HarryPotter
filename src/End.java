import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class End {
    int end = 0;
    BufferedImage main;
    BufferedImage left;
    BufferedImage right;
    BufferedImage back;
    public End() throws IOException {
        this.main = ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/End of game.jpeg"));
        this.left=ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Заставка.jpeg"));
        this.right=ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/ЗАставка игры.jpeg"));
        this.back= ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Background.jpeg"));
    }

    public void End(Graphics g) {
        if (end == 1) {
            g.fillRect(0, 0, 1440, 900);
            g.drawImage(main, 0, 0, 750, 900, null);
            g.drawString("СПАСИБО ЗА ИГРУ!!!!!!", 800, 400);

        }
    }
}
