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
    Moving move = new Moving(100, 100);
    Lamp lamp=new Lamp();
    Polya polya = new Polya();
    Score score = new Score();
    Heroes heroes=new Heroes();
    Info info = new Info(100, 100);
    End end=new End();

    //QuestionEasy questioneasy = new QuestionEasy(100, 300, 100, 90);
//QuestionNormal questionNormal = new QuestionNormal(100, 300, 100, 90);
//QuestionHard questionHard=new QuestionHard(100,300,100,90);
    //Object object=new Object(100,100,100,100);

    public MyPanel() throws IOException {
        this.hog = ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Map Harry Potter.jpg"));
        this.move.Harry = ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Гарри.png"));
        this.move.Hermiona = ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Гермиона.png"));
        this.move.Ron = ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Рон.png"));

        this.addMouseListener(this);
    }

    public void paintComponent(Graphics g) {
        g.drawImage(hog, 0, 0, 1440, 800, null);
        g.setColor(Color.yellow);
        g.fillRect(77, 625, 50, 50);
        g.setColor(Color.red);
        g.drawString("Игрок " + move.k1, 77, 655);
        polya.paintPolya(g);
        heroes.PaintHeroes(g);
        move.paint(g);
        lamp.drawLamp(g);
        score.ScoreDraw(g);
        info.PaintComponent(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        info.Draw(1340, 100, e.getX(), e.getY());
        count = 0;
        if ((questions.stop == 0) && (e.getX() >= 77) && (e.getX() <= 77 + 50) && (e.getY() >= 625) && (e.getY() <= 675) && (move.k1 == 3) && (count == 0) && (move.l3 != 75)) {
            lamp.k = (int) (Math.random() * 7);
            new Thread(() -> new MakeSound().playSound("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/zapsplat_foley_battery_aa_roll_table_001.wav")).start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            if (lamp.k == 0) {
                lamp.k = 1;
            }
            count = 1;
            move.k1 = 1;
            move.prel3 = move.l3;
            move.l3 = move.l3 + lamp.k;
            polya.k = move.l3;
            if (move.l3 >= 75) {
                move.l3 = 75;
                polya.k = 75;
                end.end=1;
            }
            move.tekx3 = polya.polyax[polya.k];
            move.teky3 = polya.polyay[polya.k];
            move.tekx3 = polya.polyax[move.prel3];
            move.teky3 = polya.polyay[move.prel3];
            questions.g1 = move.l1;
        }

        if ((e.getX() >= 77) && (e.getX() <= 77 + 50) && (e.getY() >= 625) && (e.getY() <= 675) && (move.k1 == 2) && (count == 0) && (move.l2 != 26)) {
            lamp.k = (int) (Math.random() * 7);
            new Thread(() -> new MakeSound().playSound("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/zapsplat_foley_battery_aa_roll_table_001.wav")).start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            if (lamp.k == 0) {
                lamp.k = 1;
            }
            move.k1 = move.k1 + 1;
            count = 1;
            move.prel2 = move.l2;
            move.l2 = move.l2 + lamp.k;
            polya.k = move.l2;
            if (move.l2 >= 75) {
                move.l2 = 75;
                polya.k = 75;
                end.end=1;
            }

            move.tekx2 = polya.polyax[polya.k];
            move.texy2 = polya.polyay[polya.k];
            move.tekx3 = polya.polyax[move.prel2];
            move.teky3 = polya.polyay[move.prel2];
            questions.g2 = move.l2;
        }

        if ((e.getX() >= 77) && (e.getX() <= 77 + 50) && (e.getY() >= 625) && (e.getY() <= 675) && (move.k1 == 1) && (count == 0) && (move.l1 != 26)) {
            lamp.k = (int) (Math.random() * 7);
            new Thread(() -> new MakeSound().playSound("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/zapsplat_foley_battery_aa_roll_table_001.wav")).start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            if (lamp.k == 0) {
                lamp.k = 1;
            }
            move.prel1 = move.l1;
            move.l1 = move.l1 + lamp.k;
            move.k1 = 2;
            count = 1;
            polya.k = move.l1;
            if (move.l1 >= 75) {
                move.l1 = 75;
                polya.k = 75;
                end.end=1;
            }
            move.tekx1 = polya.polyax[polya.k];
            move.texy1 = polya.polyay[polya.k];
            questions.g3 = move.l3;
        }
        info.Sravnenie();
        score.Proverka(move.l1, move.l2, move.l3);
        questions.CheckandDraw(0,0);
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

