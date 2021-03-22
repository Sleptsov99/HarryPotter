import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {
        new Thread(() -> new MakeSound().playSound("/Users/kirillsleptsov/IdeaProjects/Harry SHprotter/src/John Williams - Prologue.wav")).start();
        JFrame frame = new JFrame("Monopoly");
        JButton button = new JButton("The best action!");
        CardLayout cl = new CardLayout();
        MyPanel myPanel = new MyPanel();
        JButton button1 = new JButton("Легкий вопрос");
        JButton button2 = new JButton("Средний вопрос");
        JButton button3 = new JButton("Тяжелый вопрос");
        Castle castle = new Castle();
        Oval oval = new Oval(100, 100);
        if (oval.f == 0) {
            frame.add(myPanel);
        }
//        if(oval.f==1){
//            frame.setVisible(false);
//            frame.add(castle);
//            frame.setVisible(true);
//        }

        frame.setSize(1440, 900);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        while (true) {
            frame.repaint();
            Thread.sleep(10);

        }
    }
}