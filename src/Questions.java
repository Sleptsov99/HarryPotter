import java.awt.*;
import java.net.SocketOption;

public class Questions {
    String q1 = "Легкий вопрос";
    String q2 = "Средний вопрос";
    String q3 = "Сложный вопрос";
    String q11 = "";
    String q12 = "";
    String q13 = "";
    String q21 = "";
    String q22 = "";
    String q23 = "";
    String q31 = "";
    String q32 = "";
    String q33 = "";
    int x1;
    int y1;
    int x2;
    int y2;
    int x3;
    int y3;
    int stop = 0;
    int g1 = 0;
    int g2 = 0;
    int g3 = 0;
    Polya polya = new Polya();
    Oval oval = new Oval(0, 0);
    int number = 0;
    int cheking = 4;
    int right = 0;
    int green = 0;
    String[] Categories = {"Легкий вопрос", "Средний вопрос", "Сложный вопрос"};
    String[] Answers1 = {"Ответ 1", "Ответ 2", "Ответ 3"};
    String[] Answers2 = {"Ответ 1", "Ответ 2", "Ответ 3"};
    String[] Answers3 = {"Ответ 1", "Ответ 2", "Ответ 3"};
    int[] x = {200, 400, 600};

    public Questions() {
        if (polya.i == 15) {

        }
    }


    public void drawQuestions(Graphics g) {
        if (stop == 1) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 1440, 900);
            g.setColor(Color.blue);
            g.fillRect(100, 600, 50, 50);

            for (int k = 0; k < 3; k++) {
                g.setColor(Color.RED);
                g.drawString(Categories[k], 200 * (k + 1) + 30, 350 + 50);
                g.drawRect(200 * (k + 1), 350, 150, 125);
            }
        }
    }

    public void CheckandDraw(int getx, int gety) {
        System.out.println();
        if ((g1 >= 6) || (g2 == 6) || (g3 == 2)) {
            stop = 1;
        }
        if ((100 <= getx) && (getx <= 150) && (gety >= 600) && (gety <= 650)) {
            stop = 0;
            System.out.println("ok");
        }
        if (stop == 1) {
            for (int k = 0; k < 3; k++) {
                if ((200 * (k + 1) <= getx) && (getx <= 200 * (k + 1) + 150) && (gety >= 350) && (gety <= 475)) {
                    cheking = k;
                    System.out.println(cheking);

                }
            }
        }
        if (cheking == 0) {
            if ((200 * (right + 1) <= getx) && (getx <= 200 * (right + 1) + 150) && (gety >= 350) && (gety <= 475)) {
                green = 1;
            }}
            if (cheking == 1) {
                if ((200 * (right + 1) <= getx) && (getx <= 200 * (right + 1) + 150) && (gety >= 350) && (gety <= 475)) {
                    green = 1;
                }}
                if (cheking == 2) {
                    if ((200 * (right + 1) <= getx) && (getx <= 200 * (right + 1) + 150) && (gety >= 350) && (gety <= 475)) {
                        green = 1;
                    }
                }

            }

            public void DrawAnswers (Graphics g){
                if (stop == 1) {
                    if (cheking == 0) {
                        g.setColor(Color.WHITE);
                        g.fillRect(0, 0, 1440, 900);
                        for (int k = 0; k < 3; k++) {
                            g.setColor(Color.RED);
                            g.drawString(Answers1[k], 200 * (k + 1) + 30, 350 + 50);
                            g.setColor(Color.blue);
                            g.drawRect(200 * (k + 1), 350, 150, 125);
                        }
                        right = 2;
                        g.setColor(Color.blue);
                        g.fillRect(100, 600, 50, 50);
                    }
                    if (cheking == 1) {
                        g.setColor(Color.WHITE);
                        g.fillRect(0, 0, 1440, 900);
                        for (int k = 0; k < 3; k++) {
                            g.setColor(Color.RED);
                            g.drawString(Answers2[k], 200 * (k + 1) + 30, 350 + 50);
                            g.setColor(Color.blue);
                            g.drawRect(200 * (k + 1), 350, 150, 125);
                        }
                        right = 1;
                        g.setColor(Color.blue);
                        g.fillRect(100, 600, 50, 50);
                    }
                    if (cheking == 2) {
                        g.setColor(Color.WHITE);
                        g.fillRect(0, 0, 1440, 900);
                        for (int k = 0; k < 3; k++) {
                            g.setColor(Color.blue);
                            g.drawRect(200 * (k + 1), 350, 150, 125);
                            g.setColor(Color.RED);
                            g.drawString(Answers3[k], 200 * (k + 1) + 30, 350 + 50);
                        }
                        right = 1;
                        g.setColor(Color.blue);
                        g.fillRect(100, 600, 50, 50);
                    }
                }
            }

//            public void ColorRect (Graphics g){
//                if((cheking==0)&&(green==1)){
//                    g.fillRect(200*(right+1),350,150,125);
//                }
//                if((cheking==0)&&(green==0)){
//                    for (int k = 0; k < 3; k++) {
//                    g.setColor(Color.blue);
//                    g.drawRect(200 * (k + 1), 350, 150, 125);
//                    g.setColor(Color.RED);
//                    g.fillRect(200 * (k + 1), 350, 150, 125);
//                }}
//
//              доделать правильно или неправильно игрок ответил на вопрос
//               вырезать фигурки персонажей; сделать нормальные поля длы перехода фишек
//         }
            }
