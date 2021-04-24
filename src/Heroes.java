import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Heroes {
    BufferedImage dragon;
    BufferedImage voland;
    BufferedImage dementr;
    BufferedImage hagrid;
    BufferedImage dambldor;
    BufferedImage macgonogl;
    public Heroes() throws IOException {
        this.dragon= ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Дракон.png"));
        this.voland=ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Морда.png"));
        this.dementr=ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Призрак.png"));
        this.hagrid=ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Хагрид.png"));
        this.dambldor=ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Дамблдор.png"));
        this.macgonogl=ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Макгоногал.png"));
    }
    public void PaintHeroes(Graphics g){
        g.drawImage(dementr,464,200,50,50,null);
        g.drawImage(dementr,561,210,50,50,null);
        g.drawImage(dementr,520,270,50,50,null);
        g.drawImage(voland,350,290,50,50,null);
        g.drawImage(dragon,1262,244,80,80,null);
        g.drawImage(dementr,523,400,50,50,null);
        g.drawImage(dementr,590,360,50,50,null);
       /* g.drawImage(dementr,)*/
        g.drawImage(hagrid,1128,607,60,60,null);
        g.drawImage(dambldor,961,347,50,50,null);
        g.drawImage(macgonogl,1020,347,50,50,null);
    }
}
