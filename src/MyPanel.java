import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyPanel extends JPanel implements MouseListener {
    int h = 61;//
    int count = 0;
    BufferedImage hog;
    Questions questions = new Questions();
    Oval oval = new Oval(100, 100);
    Cube cube = new Cube();
    Polya polya = new Polya();
    Score score = new Score();
    Heroes heroes=new Heroes();
    Info info = new Info(100, 100);
    //QuestionEasy questioneasy = new QuestionEasy(100, 300, 100, 90);
//QuestionNormal questionNormal = new QuestionNormal(100, 300, 100, 90);
//QuestionHard questionHard=new QuestionHard(100,300,100,90);
    //Object object=new Object(100,100,100,100);

    public MyPanel() throws IOException {
        this.hog = ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Map Harry Potter.jpg"));
        this.oval.Harry = ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Гарри.png"));
        this.oval.Hermiona = ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Гермиона.png"));
        this.oval.Ron = ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Рон.png"));

        this.addMouseListener(this);
    }

    public void paintComponent(Graphics g) {
        g.drawImage(hog, 0, 0, 1440, 800, null);
        g.setColor(Color.yellow);
        g.fillRect(77, 625, 50, 50);
        g.setColor(Color.red);
        g.drawString("Игрок" + oval.k1, 77, 655);
        polya.paintPolya(g);
        heroes.PaintHeroes(g);
        oval.paint(g);
        info.PaintComponent(g);
        cube.drawCube(g);
        score.ScoreDraw(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        info.Draw(1340, 100, e.getX(), e.getY());
        count = 0;
        if ((questions.stop == 0) && (e.getX() >= 77) && (e.getX() <= 77 + 50) && (e.getY() >= 625) && (e.getY() <= 675) && (oval.k1 == 3) && (count == 0) && (oval.l3 != 26)) {
            cube.k = (int) (Math.random() * 7);
            new Thread(() -> new MakeSound().playSound("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/zapsplat_foley_battery_aa_roll_table_001.wav")).start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            if (cube.k == 0) {
                cube.k = 1;
            }
            count = 1;
            oval.k1 = 1;
            oval.prel3 = oval.l3;
            oval.l3 = oval.l3 + cube.k;
            polya.k = oval.l3;
//            if (oval.l3 >= 26) {
//                oval.l3 = 26;
//                polya.k = 26;
//                oval.f = 1;
//            }
            oval.tekx3 = polya.polyax[polya.k];
            oval.teky3 = polya.polyay[polya.k];
            oval.tekx3 = polya.polyax[oval.prel3];
            oval.teky3 = polya.polyay[oval.prel3];
            questions.g1 = oval.l1;
        }

        if ((e.getX() >= 77) && (e.getX() <= 77 + 50) && (e.getY() >= 625) && (e.getY() <= 675) && (oval.k1 == 2) && (count == 0) && (oval.l2 != 26)) {
            cube.k = (int) (Math.random() * 7);
            new Thread(() -> new MakeSound().playSound("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/zapsplat_foley_battery_aa_roll_table_001.wav")).start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            if (cube.k == 0) {
                cube.k = 1;
            }
            oval.k1 = oval.k1 + 1;
            count = 1;
            oval.prel2 = oval.l2;
            oval.l2 = oval.l2 + cube.k;
            polya.k = oval.l2;
//            if (oval.l2 >= 26) {
//                oval.l2 = 26;
//                castle.f = 0;
//                oval.f = 1;
//                polya.k = 26;
//            }

            oval.tekx2 = polya.polyax[polya.k];
            oval.texy2 = polya.polyay[polya.k];
            oval.tekx3 = polya.polyax[oval.prel2];
            oval.teky3 = polya.polyay[oval.prel2];
            questions.g2 = oval.l2;
        }

        if ((e.getX() >= 77) && (e.getX() <= 77 + 50) && (e.getY() >= 625) && (e.getY() <= 675) && (oval.k1 == 1) && (count == 0) && (oval.l1 != 26)) {
            cube.k = (int) (Math.random() * 7);
            new Thread(() -> new MakeSound().playSound("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/zapsplat_foley_battery_aa_roll_table_001.wav")).start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            if (cube.k == 0) {
                cube.k = 1;
            }
            oval.prel1 = oval.l1;
            oval.l1 = oval.l1 + cube.k;
            oval.k1 = 2;
            count = 1;
            polya.k = oval.l1;
//            if (oval.l1 >= 26) {
//                oval.l1 = 26;
//                castle.f = 0;
//                oval.f = 1;
//                polya.k = 26;
//            }
            oval.tekx1 = polya.polyax[polya.k];
            oval.texy1 = polya.polyay[polya.k];
            questions.g3 = oval.l3;
        }
        info.Sravnenie();
        score.Proverka(oval.l1, oval.l2, oval.l3);
    }


    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


}

