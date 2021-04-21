import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Heroes {
    BufferedImage dragon;
    BufferedImage voland;
    BufferedImage dementr;
    public Heroes() throws IOException {
        this.dragon= ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Дракон.png"));
        this.voland=ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Морда.png"));
        this.dementr=ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Призрак.png"));
    }
    public void PaintHeroes(Graphics g){
        g.drawImage(dementr,464,200,50,50,null);
        g.drawImage(dementr,561,210,50,50,null);
        g.drawImage(dementr,520,270,50,50,null);
        g.drawImage(voland,350,290,50,50,null);
        g.drawImage(dragon,1262,244,80,80,null);
    }
}
