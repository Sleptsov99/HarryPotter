import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Castle extends JPanel implements MouseListener {
    int[] polyax1 = new int[]{721,950,1067,1200,1150,1226,1220,1318,1189,1012,1129,1087,1021,945,720,558,642,373,274,257,264,88,252,230,368,374,504,537,451,490,544,619};
    int[] polyay1 = new int[]{615,628,581,600,523,508,450,333,383,322,271,274,266,221,204,193,73,79,80,128,306,334,507,607,596,333,335,500,648,636,625,647};
    int f=1;//отвечает за переход к замку
    int lenght;
    BufferedImage zamok;
    Oval oval=new Oval(100,100);
    Info info=new Info(100,100);
    Cube cube=new Cube();
    Score score=new Score();
    Questions questions=new Questions();
    int count;
    int i;
    int k=0;
    int t= oval.f;
    public Castle() throws IOException {
        this.zamok = ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Замок Путина.jpg"));
        this.oval.Harry= ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Гарри.png"));
        this.oval.Hermiona=ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Гермиона.png"));
        this.oval.Ron=ImageIO.read(new File("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/Рон.png"));
        this.addMouseListener(null);
    }

    public void paintComponent(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0, 0, 1440, 900);
            g.drawImage(zamok, 0, 0, 1440, 800, null);
            lenght = polyax1.length;
            System.out.println(lenght);
            System.out.println(polyay1.length);
            for (int i = 0; i < lenght; i++) {
                g.setColor(Color.black);
                g.drawOval(polyax1[i]-8, polyay1[i]-8, 20, 20);
            }
            g.setColor(Color.red);
            g.drawString("Игрок"+oval.k1,77,655);
            oval.paint(g);
            info.PaintComponent(g);
            cube.drawCube(g);
        }


    @Override
    public void mouseClicked(MouseEvent e) {
        oval.SravnenieZnachenia(e.getX(),e.getY());
        info.Draw(1340,100,e.getX(),e.getY());
        count=0;
        questions.CheckandDraw(e.getX(),e.getY());
        if ((questions.stop==0)&& (e.getX() >= 77) && (e.getX() <= 77+50) && (e.getY() >= 625) && (e.getY() <= 675) && (oval.k1==3) &&(count==0) && (oval.l3!=26)) {
            cube.k = (int) (Math.random() * 7);
            if (cube.k == 0) {
                cube.k = 1;
            }
            count=1;
            oval.k1=1;
            oval.l3 = oval.l3+ cube.k;
            k=oval.l3;
            if (oval.l3>=26){
                oval.l3=26;
            }
            oval.tekx33=polyax1[k];
            oval.teky33=polyay1[k];
            questions.g1=oval.l1;}

        if ((e.getX() >= 77) && (e.getX() <= 77+50) && (e.getY() >= 625) && (e.getY() <= 675) && (oval.k1==2) &&(count==0)&& (oval.l2!=26)) {
            cube.k = (int) (Math.random() * 7);
            if (cube.k == 0) {
                cube.k = 1;
            }
            oval.k1=oval.k1+1;
            count=1;
            oval.l2 = oval.l2+ cube.k;
            if (oval.l2>=26){
                oval.l2=26;
            }
            k=oval.l2;
            oval.tekx22=polyax1[k];
            oval.texy22=polyay1[k];
            questions.g2=oval.l2;
        }

        if ((e.getX() >= 77) && (e.getX() <= 77+50) && (e.getY() >= 625) && (e.getY() <= 675) && (oval.k1==1) &&(count==0) && (oval.l1!=26)) {
            cube.k = (int) (Math.random() * 7);
            if (cube.k == 0) {
                cube.k = 1;
            }

            oval.l1 = oval.l1+ cube.k;
            oval.k1=2;
            count=1;
            if (oval.l1>=26){
                oval.l1=26;
            }
            k=oval.l1;
            oval.tekx11=polyax1[k];
            oval.texy11=polyay1[k];
            questions.g3=oval.l3;
        }
        info.Sravnenie();
        questions.CheckPlayerAnswers1(e.getX(),e.getY());
        score.Proverka(oval.l1,oval.l2,oval.l3);
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

