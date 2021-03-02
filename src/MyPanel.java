import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyPanel extends JPanel implements MouseListener {
    int h = 61;
    int p = 16;
    int k = 0;
    int qr=25;
    int count = 0;
    BufferedImage hog;
    Kletka[] kletki = new Kletka[h];
    Polya[] polyax=new Polya[qr];
    Polya[] polyay=new Polya[qr];
    Questions questions=new Questions();
    Oval oval = new Oval(100, 100);
    Cube cube = new Cube();
    Polya polya=new Polya();
    Info info=new Info(100,100);
    //QuestionEasy questioneasy = new QuestionEasy(100, 300, 100, 90);
//QuestionNormal questionNormal = new QuestionNormal(100, 300, 100, 90);
//QuestionHard questionHard=new QuestionHard(100,300,100,90);
    Kletka kletka = new Kletka(61);
    int dlinx = 100 + oval.size * h;
    //Object object=new Object(100,100,100,100);
    Object button1 = new Object(100, 300, 100, 50);
    Object button2 = new Object(300, 300, 100, 50);
    Object button3 = new Object(500, 300, 100, 50);
    public MyPanel() throws IOException {
        this.hog= ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Map Harry Potter.jpg"));
        for (int i = 0; i < h; i++) {
            kletki[i] = new Kletka(i);
        }
        this.addMouseListener(this);
    }

    public void paintComponent(Graphics g) {
        g.drawImage(hog,0,0,1440,800,null);
        g.setColor(Color.red);
        g.fillRect(800,300,120,50);
        polya.paintPolya(g);
        oval.paint(g);
        info.PaintComponent(g);
        cube.drawCube(g);
        questions.drawQuestions(g);
        questions.DrawAnswers(g);
        questions.ColorRect(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        oval.SravnenieZnachenia(e.getX(),e.getY());
        info.Draw(1340,100,e.getX(),e.getY());
        count=0;
        questions.CheckandDraw(e.getX(),e.getY());
        if ((questions.stop==0)&& (e.getX() >= 800) && (e.getX() <= 920) && (e.getY() >= 300) && (e.getY() <= 350) && (oval.k1==3) &&(count==0)) {
            cube.k = (int) (Math.random() * 7);
            if (cube.k == 0) {
                cube.k = 1;
            }
            count=1;
            oval.k1=1;
            oval.l3 = oval.l3+ cube.k;
            if (oval.l3>=27){
                oval.l3=oval.l3-27;
            }
            polya.k=oval.l3;
            oval.tekx3=polya.polyax[polya.k];
            oval.teky3=polya.polyay[polya.k];
            questions.g1=oval.l1;}

        if ((e.getX() >= 800) && (e.getX() <= 920) && (e.getY() >= 300) && (e.getY() <= 350) && (oval.k1==2) &&(count==0)) {
            cube.k = (int) (Math.random() * 7);
            if (cube.k == 0) {
                cube.k = 1;
            }
            oval.k1=oval.k1+1;
            count=1;
            oval.l2 = oval.l2+ cube.k;
            if (oval.l2>=27){
                oval.l2=oval.l2-27;
            }
            polya.k=oval.l2;
            oval.tekx2=polya.polyax[polya.k];
            oval.texy2=polya.polyay[polya.k];
            questions.g2=oval.l2;
        }

        if ((e.getX() >= 800) && (e.getX() <= 920) && (e.getY() >= 300) && (e.getY() <= 350) && (oval.k1==1) &&(count==0)) {
            cube.k = (int) (Math.random() * 7);
            if (cube.k == 0) {
                cube.k = 1;
            }

            oval.l1 = oval.l1+ cube.k;
            oval.k1=2;
            count=1;
            if (oval.l1>=27){
                oval.l1=oval.l1-27;
            }
            polya.k=oval.l1;
            oval.tekx1=polya.polyax[polya.k];
            oval.texy1=polya.polyay[polya.k];
            questions.g3=oval.l3;
        }
        info.Sravnenie();
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