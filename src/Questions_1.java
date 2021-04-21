import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.jar.JarEntry;

public class Questions_1 extends JPanel implements MouseListener {

    public Questions_1(MyPanel mp) throws IOException {
        this.mp = mp;
        this.addMouseListener(this);
    }

    MyPanel mp;

    public void paintComponent(Graphics g) {
        mp.questions.drawQuestions(g);
        mp.questions.Exodys1(g);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        mp.questions.CheckandDraw(e.getX(),e.getY());
        mp.questions.CheckPlayerAnswers1(e.getX(),e.getY());

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
