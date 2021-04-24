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
        MyPanel myPanel = new MyPanel();
        Questions_1 Questions_1 = new Questions_1(myPanel);
        JPanel start = new JPanel(null){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.RED);
                g.fillRect(0,0,1440,900);
            }
        };
        JButton jb = new JButton("Start");
        jb.setBounds(1440/2-100/2, 900/2-100/2,100,100);
        start.add(jb);
        CardLayout cl = new CardLayout();//Он определяет, как объекты в панели будут располагаться
        JPanel main = new JPanel(cl);//main- содержит mypanel и questions, отображает одно а другое скрывает
        main.add(start, "s");
        main.add(myPanel, "m");
        main.add(Questions_1,"q");
        frame.setLayout(new BorderLayout());
        frame.add(main, BorderLayout.CENTER);
        frame.setSize(1440, 900);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread(()->{
                    while (true) {
                        myPanel.repaint();
                        Questions_1.repaint();
                        System.out.println(myPanel.questions.count + " " + myPanel.questions.stop);
                        if (myPanel.questions.count == 1) {
                            cl.show(main, "q");
                           // System.out.println("q");
                        } else {
                            cl.show(main, "m");
                            //System.out.println("m");
                        }
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException interruptedException) {
                            interruptedException.printStackTrace();
                        }
                    }
                }).start();
            }
        });
    }
}