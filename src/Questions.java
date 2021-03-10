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
    int[] Placesx = {200, 400, 600};
    int[] Placesy = {350, 350, 350};
    int[] x = {200, 400, 600};
    int width = 150;
    int height = 125;
    int NumberOfAnswer = 0;
    int NumberOfQuestion = 0;

    public Questions() {

    }

    public void drawQuestions(Graphics g) {
        if (stop == 1) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 1440, 900);
            g.setColor(Color.blue);
            g.fillRect(100, 600, 50, 50);
            for (int k = 0; k < 3; k++) {
                g.setColor(Color.RED);
                g.drawString(Answers1[k], Placesx[k] + 30, Placesy[k] + 50);
                g.setColor(Color.yellow);
                g.drawRect(Placesx[k], Placesy[k], width, height);
            }
        }

    }

    public void CheckandDraw(int getx, int gety) {
        if (((g1 > 6) || (g2 == 9) || (g3 == 7)) && (right==1)) {
            stop = 1;
        }
        if ((g1 > 6) || (g2 == 9) || (g3 == 7)) {
            stop = 2;
        }
        if ((g1 > 6) || (g2 == 9) || (g3 == 7)) {
            stop = 3;
        }
        if ((100 <= getx) && (getx <= 150) && (gety >= 600) && (gety <= 650)) {//кнопка для закрытия вопросов
            stop = 0;
            System.out.println("ok");
        }
//        if (stop == 1) {
//            for (int k = 0; k < 3; k++) {
//                if ((Placesx[k] <= getx) && (getx <= Placesx[k] + width) && (gety >= Placesy[k]) && (gety <= Placesy[k] + height)) {
//                    cheking = k;
//                    System.out.println(cheking);
//                }
//            }
//        }
    }


    public void CheckPlayerAnswers1(int x, int y) {
        if (stop == 1) {
            if ((x >= Placesx[1]) && (x <= Placesx[1] + width) && (y >= Placesy[1]) && (y <= Placesy[1] + height)) {
                cheking = 1;
            }
        }

    }

    public void Exodys1(Graphics g) {
        if (stop == 1) {
            if (cheking == 1) {
                g.setColor(Color.green);
                g.fillRect(Placesx[1], Placesy[1], width, height);
                g.drawString(Answers1[1], Placesx[1] + 30, Placesy[1] + 50);
            }

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

//        if (cheking == 0) {
//            if ((Placesx[2] <= getx) && (getx <= Placesx[2]+width) && (gety >= Placesy[2]) && (gety <= Placesy[2]+height)) {
//                green = 1;
//            }}
//            if (cheking == 1) {
//                if  ((Placesx[1] <= getx) && (getx <= Placesx[1]+width) && (gety >= Placesy[1]) && (gety <= Placesy[1]+height)) {
//                    green = 1;
//                }}
//                if (cheking == 2) {
//                    if  ((Placesx[2] <= getx) && (getx <= Placesx[2]+width) && (gety >= Placesy[2]) && (gety <= Placesy[2]+height)) {
//                        green = 1;
//                    }
//                }
//        if ((cheking == 0) || (stop==1)) {
//            if ((x >= Placesx[0]) && (x <= Placesx[0] + width) && (y >= Placesy[0]) && (y <= Placesy[0] + height)) {
//                NumberOfAnswer = 1;
//            }
//            if((cheking==0) && (stop==1)) {
//                NumberOfAnswer = 2;
//            }
//        }
//        if ((x > 900) && (x < 950) && (y > 700) && (y < 750)) {
//            stop = 0;
//        }
//        if ((NumberOfAnswer == 1) && (stop == 1)) {
//            g.setColor(Color.green);
//            g.fillRect(Placesx[NumberOfAnswer], Placesy[NumberOfAnswer], width, height);
//        }
//        if ((NumberOfAnswer == 2) && (stop == 1)) {
//            for (int k = 0; k < 3; k++) {
//                g.setColor(Color.blue);
//                g.drawString(Answers1[k], Placesx[k] + 30, Placesy[k] + 50);
//                g.setColor(Color.red);
//                g.fillRect(Placesx[k], Placesy[k], width, height);
//            }
//        }
//        g.setColor(Color.BLUE);
//        g.fillRect(900, 700, 50, 50);
//    }