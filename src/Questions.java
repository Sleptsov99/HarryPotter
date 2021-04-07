import java.awt.*;
import java.io.IOException;
import java.net.SocketOption;

public class Questions {
    int stop = 0;
    int g1 = 0;
    int g2 = 0;
    int g3 = 0;
    int cheking = 4;//проверка на правильность ответа
    String[] Answers1 = {"С какой платформы Кингс-Кросс отправляется Хогвартс-экспресс?",
            "Восемь и одна четверть",
            "Девять и три четверти",
            "Пять с половиной"};
    String[] Answers2 = {"Кто был запряжен в кареты, которые везли юных волшебников до замка Хогвартс?",
            "Шестомеры",
            "Лошади",
            "Фестралы"};
    String[] Answers3 = {"Откуда у Гарри мантия-невидимка?",
            "Подарок Рона",
            "От Дамблдора",
            "Покупка для Хогвартса"};
    String[] Answers4 = {"Что такое снитч?",
            "* Десерт в Хогвардсе",
            "* Метла",
            " Мяч для игры в квиддич"};
    String[] Answers5 = {"Кто изображен на гербе Гриффиндора?",
            "Орел",
            "Змея",
            "Лев"};
    String[] Answers6 = {"Как прозвали Гарри Поттера?",
            "Мальчик-Который-Спасся",
            "Мальчик-Со-Шрамом",
            "Мальчик-Который-Выжил"};
    String[] Answers7 = {"Кто уничтожил первым один из крестражей Волан-де-Морта?",
            "Дамблдор",
            "Гарри Поттер",
            "Регулус Блэк"};
    String[] Answers8 = {"За чьи права боролась Гермиона, начиная с четвертого года обучения в Хогвартсе?",
            "Гоблинов",
            "Кентавров",
            "Эльфов-домовиков"};
    String[] Answers9 = {"Какую надпись видят маглы, оказываясь на слишком близком расстоянии от школы чародейства и волшебства Хогвартс?",
            "Не входить, опасная зона",
            "*Территория находится на карантине",
            "Осторожно, дикие животные"};
    String[] Answers10 = {"Сколько обязательных предметов в школе волшебства?",
            "Ученик выбирает предметы сам, обязательных нет",
            "5",
            "7"};
    int[] Placesx = {200, 400, 600};
    int[] Placesy = {350, 350, 350};
    int[] x = {200, 400, 600};
    int width = 150;
    int height = 125;
    int NumberOfAnswer = 0;
    int NumberOfQuestion = 0;

    public Questions() throws IOException {

    }

    public void drawQuestions(Graphics g) {
        if (stop == 1) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 1440, 900);
            g.setColor(Color.blue);
            g.fillRect(100, 400, 50, 50);
            g.drawString(Answers1[0], 700, 100);
            for (int k = 0; k < 3; k++) {
                g.setColor(Color.RED);
                g.drawString(Answers1[k + 1], Placesx[k] + 30, Placesy[k] + 50);
                g.setColor(Color.yellow);
                g.drawRect(Placesx[k], Placesy[k], width, height);
            }

        }
        if (stop == 2) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 1440, 900);
            g.setColor(Color.blue);
            g.fillRect(100, 400, 50, 50);
            g.drawString(Answers2[0], 700, 100);
            for (int k = 0; k < 3; k++) {
                g.setColor(Color.RED);
                g.drawString(Answers2[k + 1], Placesx[k] + 30, Placesy[k] + 50);
                g.setColor(Color.yellow);
                g.drawRect(Placesx[k], Placesy[k], width, height);
            }

        }


        if (stop == 3) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 1440, 900);
            g.setColor(Color.blue);
            g.fillRect(100, 400, 50, 50);
            g.drawString(Answers3[0], 700, 100);
            for (int k = 0; k < 3; k++) {
                g.setColor(Color.RED);
                g.drawString(Answers3[k + 1], Placesx[k] + 30, Placesy[k] + 50);
                g.setColor(Color.yellow);
                g.drawRect(Placesx[k], Placesy[k], width, height);
            }


            if (stop == 4) {
                g.setColor(Color.WHITE);
                g.fillRect(0, 0, 1440, 900);
                g.setColor(Color.blue);
                g.fillRect(100, 400, 50, 50);
                g.drawString(Answers4[0], 700, 100);
                for (int k = 0; k < 3; k++) {
                    g.setColor(Color.RED);
                    g.drawString(Answers4[k + 1], Placesx[k] + 30, Placesy[k] + 50);
                    g.setColor(Color.yellow);
                    g.drawRect(Placesx[k], Placesy[k], width, height);
                }

            }
        }
    }

    public void CheckandDraw(int getx, int gety) {
        if (g1 == 6 || g2 == 6 || g3 == 6) {
            //(right == 1)) {
            stop = 1;
        }
        if ((g1 == 11) || (g2 == 11) || (g3 == 11)) {
            stop = 2;
        }
        if ((g1 > 15) || (g2 == 15) || (g3 == 15)) {
            stop = 3;
        }
        if ((100 <= getx) && (getx <= 150) && (gety >= 400) && (gety <= 450)) {//кнопка для закрытия вопросов
            stop = 0;
            //System.out.println("ok");
        }

    }


    public void CheckPlayerAnswers1(int x, int y) {
        if (stop == 1) {
            if ((x >= Placesx[1]) && (x <= Placesx[1] + width) && (y >= Placesy[1]) && (y <= Placesy[1] + height)) {
                cheking = 1;
            }
            if (((x >= Placesx[2]) && (x <= Placesx[2] + width) && (y >= Placesy[2]) && (y <= Placesy[2] + height)) || ((x >= Placesx[0]) && (x <= Placesx[0] + width) && (y >= Placesy[0]) && (y <= Placesy[0] + height))) {
                cheking = 2;
            }
        }
        if (stop == 2) {
            if ((x >= Placesx[1]) && (x <= Placesx[1] + width) && (y >= Placesy[1]) && (y <= Placesy[1] + height)) {
                cheking = 1;
            } else {
                cheking = 2;
            }
        }
        if (stop == 3) {
            if ((x >= Placesx[2]) && (x <= Placesx[2] + width) && (y >= Placesy[2]) && (y <= Placesy[2] + height)) {
                cheking = 1;
            } else {
                cheking = 2;
            }
        }
        if (stop == 4) {
            if ((x >= Placesx[0]) && (x <= Placesx[0] + width) && (y >= Placesy[0]) && (y <= Placesy[0] + height)) {
                cheking = 1;
            } else {
                cheking = 2;
            }
        }
    }


    public void Exodys1(Graphics g) {
        if (stop == 1) {
            if (cheking == 1) {
                g.setColor(Color.green);
                g.fillRect(Placesx[1], Placesy[1], width, height);
                g.setColor(Color.white);
                g.drawString(Answers1[1], Placesx[1] + 30, Placesy[1] + 50);
                g.setColor(Color.green);
                g.drawString("Вы ответили правильно", 500, 100);
            }
            if (cheking == 2) {
                g.setColor(Color.red);
                for (int k = 0; k < 3; k++) {
                    g.fillRect(Placesx[k], Placesy[k], width, height);
                }
                g.setColor(Color.red);
                g.drawString("Вы ответили неправильно", 500, 100);
            }

        }


        if (stop == 2) {
            if (cheking == 1) {
//            g.setColor(Color.white);
//            g.fillRect();
                g.setColor(Color.green);
                g.fillRect(Placesx[1], Placesy[1], width, height);
                g.setColor(Color.white);
                g.drawString(Answers1[1], Placesx[1] + 30, Placesy[1] + 50);
                g.setColor(Color.green);
                g.drawString("Вы ответили правильно", 500, 100);

            } else {
                g.setColor(Color.red);
                for (int k = 0; k < 3; k++) {
                    g.fillRect(Placesx[k], Placesy[k], width, height);
                }
                g.setColor(Color.red);
                g.drawString("Вы ответили неправильно", 500, 100);
            }
        }

        if (stop == 3) {
            if (cheking == 1) {
//            g.setColor(Color.white);
//            g.fillRect();
                g.setColor(Color.green);
                g.fillRect(Placesx[2], Placesy[2], width, height);
                g.setColor(Color.white);
                g.drawString(Answers1[2], Placesx[2] + 30, Placesy[2] + 50);
                g.setColor(Color.green);
                g.drawString("Вы ответили правильно", 500, 100);

            } else {
                g.setColor(Color.red);
                for (int k = 0; k < 3; k++) {
                    g.fillRect(Placesx[k], Placesy[k], width, height);
                }
                g.setColor(Color.red);
                g.drawString("Вы ответили неправильно", 500, 100);
            }
        }

        if (stop == 4) {
            if (cheking == 1) {
//            g.setColor(Color.white);
//            g.fillRect();
                g.setColor(Color.green);
                g.fillRect(Placesx[0], Placesy[0], width, height);
                g.setColor(Color.white);
                g.drawString(Answers1[0], Placesx[0] + 30, Placesy[0] + 50);
                g.setColor(Color.green);
                g.drawString("Вы ответили правильно", 500, 100);

            } else {
                g.setColor(Color.red);
                for (int k = 0; k < 3; k++) {
                    g.fillRect(Placesx[k], Placesy[k], width, height);
                }
                g.setColor(Color.red);
                g.drawString("Вы ответили неправильно", 500, 100);
            }
        }

    }
}