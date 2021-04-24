import java.awt.*;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Questions {
    int stop = 0;
    int g1 = 0;
    int g2 = 0;
    int g3 = 0;
    int count = 0;
    int player=0;
    Moving move=new Moving(0,0);
    int cheking = 0;//проверка на правильность ответа
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
            "От Отца",
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
            "Территория находится на карантине",
            "Осторожно, дикие животные"};
    String[] Answers10 = {"Сколько обязательных предметов в школе волшебства?",
            "Ученик выбирает предметы сам, обязательных нет",
            "5",
            "7"};
    String[] Answers11 = {"По какому адресу проживала семья Дурслей?" +
            "Бирючиновая аллея, дом 8" +
            "Котловая улица, дом 5" +
            "Тисовая улица, дом 4"};
    String[] Answers12 = {"Кот Гермионы может…" +
            "Предсказать действия объекта на несколько шагов вперед" +
            "Стать невидимым" +
            "Почувствовать подозрительного человека"};
    String[] Answers13 = {"Кто является крестным Гарри Поттера?" +
            "Сириус Блэк" +
            "Альбус Дамблдор" +
            "Вернон Дурслей"};
    int[] Placesx = {200, 400, 600};
    int[] Placesy = {350, 350, 350};
    int[] x = {200, 400, 600};
    int width = 150;
    int height = 125;
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
        if (stop == 5) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 1440, 900);
            g.setColor(Color.blue);
            g.fillRect(100, 400, 50, 50);
            g.drawString(Answers5[0], 700, 100);
            for (int k = 0; k < 3; k++) {
                g.setColor(Color.RED);
                g.drawString(Answers5[k + 1], Placesx[k] + 30, Placesy[k] + 50);
                g.setColor(Color.yellow);
                g.drawRect(Placesx[k], Placesy[k], width, height);
            }

        }
        if (stop == 6) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 1440, 900);
            g.setColor(Color.blue);
            g.fillRect(100, 400, 50, 50);
            g.drawString(Answers6[0], 700, 100);
            for (int k = 0; k < 3; k++) {
                g.setColor(Color.RED);
                g.drawString(Answers6[k + 1], Placesx[k] + 30, Placesy[k] + 50);
                g.setColor(Color.yellow);
                g.drawRect(Placesx[k], Placesy[k], width, height);
            }

        }
        if (stop == 7) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 1440, 900);
            g.setColor(Color.blue);
            g.fillRect(100, 400, 50, 50);
            g.drawString(Answers7[0], 700, 100);
            for (int k = 0; k < 3; k++) {
                g.setColor(Color.RED);
                g.drawString(Answers7[k + 1], Placesx[k] + 30, Placesy[k] + 50);
                g.setColor(Color.yellow);
                g.drawRect(Placesx[k], Placesy[k], width, height);
            }

        }
        if (stop == 8) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 1440, 900);
            g.setColor(Color.blue);
            g.fillRect(100, 400, 50, 50);
            g.drawString(Answers8[0], 700, 100);
            for (int k = 0; k < 3; k++) {
                g.setColor(Color.RED);
                g.drawString(Answers8[k + 1], Placesx[k] + 30, Placesy[k] + 50);
                g.setColor(Color.yellow);
                g.drawRect(Placesx[k], Placesy[k], width, height);
            }

        }
        if (stop == 9) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 1440, 900);
            g.setColor(Color.blue);
            g.fillRect(100, 400, 50, 50);
            g.drawString(Answers9[0], 700, 100);
            for (int k = 0; k < 3; k++) {
                g.setColor(Color.RED);
                g.drawString(Answers9[k + 1], Placesx[k] + 30, Placesy[k] + 50);
                g.setColor(Color.yellow);
                g.drawRect(Placesx[k], Placesy[k], width, height);
            }

        }
        if (stop == 10) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 1440, 900);
            g.setColor(Color.blue);
            g.fillRect(100, 400, 50, 50);
            g.drawString(Answers10[0], 700, 100);
            for (int k = 0; k < 3; k++) {
                g.setColor(Color.RED);
                g.drawString(Answers10[k + 1], Placesx[k] + 30, Placesy[k] + 50);
                g.setColor(Color.yellow);
                g.drawRect(Placesx[k], Placesy[k], width, height);
            }

        }
        if (stop == 11) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 1440, 900);
            g.setColor(Color.blue);
            g.fillRect(100, 400, 50, 50);
            g.drawString(Answers11[0], 700, 100);
            for (int k = 0; k < 3; k++) {
                g.setColor(Color.RED);
                g.drawString(Answers11[k + 1], Placesx[k] + 30, Placesy[k] + 50);
                g.setColor(Color.yellow);
                g.drawRect(Placesx[k], Placesy[k], width, height);
            }

        }
        if (stop == 12) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 1440, 900);
            g.setColor(Color.blue);
            g.fillRect(100, 400, 50, 50);
            g.drawString(Answers12[0], 700, 100);
            for (int k = 0; k < 3; k++) {
                g.setColor(Color.RED);
                g.drawString(Answers12[k + 1], Placesx[k] + 30, Placesy[k] + 50);
                g.setColor(Color.yellow);
                g.drawRect(Placesx[k], Placesy[k], width, height);
            }

        }

        if (stop == 13) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, 1440, 900);
            g.setColor(Color.blue);
            g.fillRect(100, 400, 50, 50);
            g.drawString(Answers13[0], 700, 100);
            for (int k = 0; k < 3; k++) {
                g.setColor(Color.RED);
                g.drawString(Answers13[k + 1], Placesx[k] + 30, Placesy[k] + 50);
                g.setColor(Color.yellow);
                g.drawRect(Placesx[k], Placesy[k], width, height);
            }

        }

    }

    public void CheckandDraw(int getx, int gety) {
        if ((g1 >=5 && move.k1 == 1) || (g2 == 5 && move.k1 == 2) || ((g3 == 6) && (move.k1 == 3))) {
            stop = 1;
            count = 1;
        }
        if ((g1 == 10 && move.k1 == 1) || (g2 == 10 && move.k1 == 2) || ((g3 == 10) && (move.k1 == 3))) {
            stop = 2;
            count = 1;
        }
        if ((g1 == 12 && move.k1 == 1) || (g2 == 14 && move.k1 == 2) || ((g3 == 16) && (move.k1 == 3))) {
            stop = 3;
            count = 1;
        }

        if ((g1 == 13 && move.k1 == 1) || (g2 == 15 && move.k1 == 2) || ((g3 == 17) && (move.k1 == 3))) {
            stop = 4;
            count = 1;
        }

        if ((g1 == 18 && move.k1 == 1) || (g2 == 21 && move.k1 == 2) || ((g3 == 19) && (move.k1 == 3))) {
            stop = 5;
            count = 1;
        }

        if ((g1 == 22 && move.k1 == 1) || (g2 == 22 && move.k1 == 2) || ((g3 == 22) && (move.k1 == 3))) {
            stop = 6;
            count = 1;
        }

        if ((g1 == 28 && move.k1 == 1) || (g2 == 28 && move.k1 == 2) || ((g3 == 28) && (move.k1 == 3))) {
            stop = 7;
            count = 1;
        }

        if ((g1 == 32 && move.k1 == 1) || (g2 == 32 && move.k1 == 2) || ((g3 == 32) && (move.k1 == 3))) {
            stop = 8;
            count = 1;
        }

        if ((g1 == 38 && move.k1 == 1) || (g2 == 36 && move.k1 == 2) || ((g3 == 33) && (move.k1 == 3))) {
            stop = 9;
            count = 1;
        }

        if ((g1 == 40 && move.k1 == 1) || (g2 == 40 && move.k1 == 2) || ((g3 == 40) && (move.k1 == 3))) {
            stop = 10;
            count = 1;
        }

        if ((g1 == 41 && move.k1 == 1) || (g2 == 42 && move.k1 == 2) || ((g3 == 43) && (move.k1 == 3))) {
            stop = 11;
            count = 1;
        }

        if ((g1 == 48 && move.k1 == 1) || (g2 == 48 && move.k1 == 2) || ((g3 == 48) && (move.k1 == 3))) {
            stop = 12;
            count = 1;
        }
        if ((g1 == 53 && move.k1 == 1) || (g2 == 54 && move.k1 == 2) || ((g3 == 53) && (move.k1 == 3))) {
            stop = 13;
            count = 1;
        }
//        if ((100 <= getx) && (getx <= 150) && (gety >= 400) && (gety <= 450)) {//кнопка для закрытия вопросов
//            stop = 0;
//            count = 0;
//            //System.out.println("ok");
//        }

    }


    public void CheckPlayerAnswers1(int x, int y) {
        player=move.k1-1;
        System.out.println(move.k1);
        if (stop == 1) {
            if ((x >= Placesx[1]) && (x <= Placesx[1] + width) && (y >= Placesy[1]) && (y <= Placesy[1] + height)) {
                cheking = 1;

            }
            if (((x >= Placesx[2]) && (x <= Placesx[2] + width) && (y >= Placesy[2]) && (y <= Placesy[2] + height)) || ((x >= Placesx[0]) && (x <= Placesx[0] + width) && (y >= Placesy[0]) && (y <= Placesy[0] + height))) {
                cheking = 2;
            }
        }
        if (stop == 2) {
            if ((x >= Placesx[2]) && (x <= Placesx[2] + width) && (y >= Placesy[2]) && (y <= Placesy[2] + height)) {
                cheking = 1;
            } else {
                cheking = 2;
            }
        }
        if (stop == 3) {
            if ((x >= Placesx[1]) && (x <= Placesx[1] + width) && (y >= Placesy[1]) && (y <= Placesy[1] + height)) {
                cheking = 1;
            } else {
                cheking = 2;
            }
        }
        if (stop == 4) {
            if ((x >= Placesx[2]) && (x <= Placesx[2] + width) && (y >= Placesy[2]) && (y <= Placesy[2] + height)) {
                cheking = 1;
            } else {
                cheking = 2;
            }
        }
        if (stop == 5) {
            if ((x >= Placesx[2]) && (x <= Placesx[2] + width) && (y >= Placesy[2]) && (y <= Placesy[2] + height)) {
                cheking = 1;
            } else {
                cheking = 2;
            }
        }

        if (stop == 6) {
            if ((x >= Placesx[2]) && (x <= Placesx[2] + width) && (y >= Placesy[2]) && (y <= Placesy[2] + height)) {
                cheking = 1;
            } else {
                cheking = 2;
            }
        }

        if (stop == 7) {
            if ((x >= Placesx[1]) && (x <= Placesx[1] + width) && (y >= Placesy[1]) && (y <= Placesy[1] + height)) {
                cheking = 1;
            } else {
                cheking = 2;
            }
        }

        if (stop == 8) {
            if ((x >= Placesx[2]) && (x <= Placesx[2] + width) && (y >= Placesy[2]) && (y <= Placesy[2] + height)) {
                cheking = 1;
            } else {
                cheking = 2;
            }
        }

        if (stop == 9) {
            if ((x >= Placesx[0]) && (x <= Placesx[0] + width) && (y >= Placesy[0]) && (y <= Placesy[0] + height)) {
                cheking = 1;
            } else {
                cheking = 2;
            }
        }

        if (stop == 10) {
            if ((x >= Placesx[2]) && (x <= Placesx[2] + width) && (y >= Placesy[2]) && (y <= Placesy[2] + height)) {
                cheking = 1;
            } else {
                cheking = 2;
            }
        }

        if (stop == 11) {
            if ((x >= Placesx[2]) && (x <= Placesx[2] + width) && (y >= Placesy[2]) && (y <= Placesy[2] + height)) {
                cheking = 1;
            } else {
                cheking = 2;
            }
        }

        if (stop == 12) {
            if ((x >= Placesx[2]) && (x <= Placesx[2] + width) && (y >= Placesy[2]) && (y <= Placesy[2] + height)) {
                cheking = 1;
            } else {
                cheking = 2;
            }
        }
        if (stop == 13) {
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
                Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                    count = 0;
                    cheking =0;
                    stop = 0;
                }, 2, TimeUnit.SECONDS);
            }
            if (cheking == 2) {
                g.setColor(Color.red);
                for (int k = 0; k < 3; k++) {
                    g.fillRect(Placesx[k], Placesy[k], width, height);
                }
                g.setColor(Color.red);
                g.drawString("Вы ответили неправильно", 500, 100);
                Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                    count = 0;
                    cheking = 0;
                    stop = 0;
                }, 2, TimeUnit.SECONDS);
            }
        }


        if (stop == 2) {
            if (cheking == 1) {
//            g.setColor(Color.white);
//            g.fillRect();
                g.setColor(Color.green);
                g.fillRect(Placesx[2], Placesy[2], width, height);
                g.setColor(Color.white);
                g.drawString(Answers2[3], Placesx[2] + 20, Placesy[1] + 50);
                g.setColor(Color.green);
                g.drawString("Вы ответили правильно", 500, 100);
                Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                    count = 0;
                    cheking = 0;
                    stop = 0;
                }, 2, TimeUnit.SECONDS);
            } if(cheking==2) {
                g.setColor(Color.red);
                for (int k = 0; k < 3; k++) {
                    g.fillRect(Placesx[k], Placesy[k], width, height);
                }
                g.setColor(Color.red);
                g.drawString("Вы ответили неправильно", 500, 100);
                Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                    count = 0;
                    cheking = 0;
                    stop = 0;
                }, 2, TimeUnit.SECONDS);
            }

        }

        if (stop == 3) {
            if (cheking == 1) {
//            g.setColor(Color.white);
//            g.fillRect();
                g.setColor(Color.green);
                g.fillRect(Placesx[1], Placesy[1], width, height);
                g.setColor(Color.white);
                g.drawString(Answers3[2], Placesx[1] + 30, Placesy[2] + 50);
                g.setColor(Color.green);
                g.drawString("Вы ответили правильно", 500, 100);
                Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                    count = 0;
                    cheking = 0;
                    stop = 0;
                }, 2, TimeUnit.SECONDS);
            }
            if(cheking==2){
                g.setColor(Color.red);
                for (int k = 0; k < 3; k++) {
                    g.fillRect(Placesx[k], Placesy[k], width, height);
                }
                g.setColor(Color.red);
                g.drawString("Вы ответили неправильно", 500, 100);
                Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                    count = 0;
                    cheking = 0;
                    stop = 0;
                }, 2, TimeUnit.SECONDS);
            }

        }

        if (stop == 4) {
            if (cheking == 1) {
//            g.setColor(Color.white);
//            g.fillRect();
                g.setColor(Color.green);
                g.fillRect(Placesx[3], Placesy[3], width, height);
                g.setColor(Color.white);
                g.drawString(Answers4[3], Placesx[3] + 30, Placesy[0] + 50);
                g.setColor(Color.green);
                g.drawString("Вы ответили правильно", 500, 100);
                Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                    count = 0;
                    cheking = 0;
                    stop = 0;
                }, 2, TimeUnit.SECONDS);
            }
            if(cheking==2){
                g.setColor(Color.red);
                for (int k = 0; k < 3; k++) {
                    g.fillRect(Placesx[k], Placesy[k], width, height);
                }
                g.setColor(Color.red);
                g.drawString("Вы ответили неправильно", 500, 100);
                Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                    count = 0;
                    cheking = 0;
                    stop = 0;
                }, 2, TimeUnit.SECONDS);

            }
        }
        if (stop == 5) {
            if (cheking == 1) {
                g.setColor(Color.green);
                g.fillRect(Placesx[3], Placesy[3], width, height);
                g.setColor(Color.white);
                g.drawString(Answers5[3], Placesx[3] + 30, Placesy[1] + 50);
                g.setColor(Color.green);
                g.drawString("Вы ответили правильно", 500, 100);
                Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                    count = 0;
                    cheking = 0;
                    stop = 0;
                }, 2, TimeUnit.SECONDS);

            }
            if (cheking == 2) {
                g.setColor(Color.red);
                for (int k = 0; k < 3; k++) {
                    g.fillRect(Placesx[k], Placesy[k], width, height);
                }
                g.setColor(Color.red);
                g.drawString("Вы ответили неправильно", 500, 100);
                Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                    count = 0;
                    cheking = 0;
                    stop = 0;
                }, 2, TimeUnit.SECONDS);
            }
        }

        if (stop == 6) {
            if (cheking == 1) {
                g.setColor(Color.green);
                g.fillRect(Placesx[3], Placesy[3], width, height);
                g.setColor(Color.white);
                g.drawString(Answers5[3], Placesx[3] + 30, Placesy[1] + 50);
                g.setColor(Color.green);
                g.drawString("Вы ответили правильно", 500, 100);
                Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                    count = 0;
                    cheking = 0;
                    stop = 0;
                }, 2, TimeUnit.SECONDS);

            }
            if (cheking == 2) {
                g.setColor(Color.red);
                for (int k = 0; k < 3; k++) {
                    g.fillRect(Placesx[k], Placesy[k], width, height);
                }
                g.setColor(Color.red);
                g.drawString("Вы ответили неправильно", 500, 100);
                Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                    count = 0;
                    cheking = 0;
                    stop = 0;
                }, 2, TimeUnit.SECONDS);
            }
        }
        if (stop == 7) {
            if (cheking == 1) {
                g.setColor(Color.green);
                g.fillRect(Placesx[2], Placesy[2], width, height);
                g.setColor(Color.white);
                g.drawString(Answers5[2], Placesx[2] + 30, Placesy[1] + 50);
                g.setColor(Color.green);
                g.drawString("Вы ответили правильно", 500, 100);
                Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                    count = 0;
                    cheking = 0;
                    stop = 0;
                }, 2, TimeUnit.SECONDS);
            }
            if (cheking == 2) {
                g.setColor(Color.red);
                for (int k = 0; k < 3; k++) {
                    g.fillRect(Placesx[k], Placesy[k], width, height);
                }
                g.setColor(Color.red);
                g.drawString("Вы ответили неправильно", 500, 100);
                Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                    count = 0;
                    cheking = 0;
                    stop = 0;
                }, 2, TimeUnit.SECONDS);
            }

        }
        if (stop == 8) {
            if (cheking == 1) {
                g.setColor(Color.green);
                g.fillRect(Placesx[3], Placesy[3], width, height);
                g.setColor(Color.white);
                g.drawString(Answers5[3], Placesx[3] + 30, Placesy[1] + 50);
                g.setColor(Color.green);
                g.drawString("Вы ответили правильно", 500, 100);
                Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                    count = 0;
                    cheking = 0;
                    stop = 0;
                }, 2, TimeUnit.SECONDS);
            }
            if (cheking == 2) {
                g.setColor(Color.red);
                for (int k = 0; k < 3; k++) {
                    g.fillRect(Placesx[k], Placesy[k], width, height);
                }
                g.setColor(Color.red);
                g.drawString("Вы ответили неправильно", 500, 100);
                Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                    count = 0;
                    cheking = 0;
                    stop = 0;
                }, 2, TimeUnit.SECONDS);
            }
        }
        if (stop == 9) {
            if (cheking == 1) {
                g.setColor(Color.green);
                g.fillRect(Placesx[1], Placesy[1], width, height);
                g.setColor(Color.white);
                g.drawString(Answers5[1], Placesx[1] + 30, Placesy[1] + 50);
                g.setColor(Color.green);
                g.drawString("Вы ответили правильно", 500, 100);
                Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                    count = 0;
                    cheking = 0;
                    stop = 0;
                }, 2, TimeUnit.SECONDS);
            }
            if (cheking == 2) {
                g.setColor(Color.red);
                for (int k = 0; k < 3; k++) {
                    g.fillRect(Placesx[k], Placesy[k], width, height);
                }
                g.setColor(Color.red);
                g.drawString("Вы ответили неправильно", 500, 100);
                Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                    count = 0;
                    cheking = 0;
                    stop = 0;
                }, 2, TimeUnit.SECONDS);
            }
        }
        if (stop == 10) {
            if (cheking == 1) {
                g.setColor(Color.green);
                g.fillRect(Placesx[3], Placesy[3], width, height);
                g.setColor(Color.white);
                g.drawString(Answers5[3], Placesx[3] + 30, Placesy[1] + 50);
                g.setColor(Color.green);
                g.drawString("Вы ответили правильно", 500, 100);
                Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                    count = 0;
                    cheking = 0;
                    stop = 0;
                }, 2, TimeUnit.SECONDS);

            }
            if (cheking == 2) {
                g.setColor(Color.red);
                for (int k = 0; k < 3; k++) {
                    g.fillRect(Placesx[k], Placesy[k], width, height);
                }
                g.setColor(Color.red);
                g.drawString("Вы ответили неправильно", 500, 100);
                Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                    count = 0;
                    cheking = 0;
                    stop = 0;
                }, 2, TimeUnit.SECONDS);
            }
        }
        if (stop == 11) {
            if (cheking == 1) {
                g.setColor(Color.green);
                g.fillRect(Placesx[3], Placesy[3], width, height);
                g.setColor(Color.white);
                g.drawString(Answers5[3], Placesx[3] + 30, Placesy[1] + 50);
                g.setColor(Color.green);
                g.drawString("Вы ответили правильно", 500, 100);
                Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                    count = 0;
                    cheking = 0;
                    stop = 0;
                }, 2, TimeUnit.SECONDS);

            }
            if (cheking == 2) {
                g.setColor(Color.red);
                for (int k = 0; k < 3; k++) {
                    g.fillRect(Placesx[k], Placesy[k], width, height);
                }
                g.setColor(Color.red);
                g.drawString("Вы ответили неправильно", 500, 100);
                Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                    count = 0;
                    cheking = 0;
                    stop = 0;
                }, 2, TimeUnit.SECONDS);
            }

        }
        if (stop == 12) {
            if (cheking == 1) {
                g.setColor(Color.green);
                g.fillRect(Placesx[3], Placesy[3], width, height);
                g.setColor(Color.white);
                g.drawString(Answers5[3], Placesx[3] + 30, Placesy[1] + 50);
                g.setColor(Color.green);
                g.drawString("Вы ответили правильно", 500, 100);
                Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                    count = 0;
                    cheking = 0;
                    stop = 0;
                }, 2, TimeUnit.SECONDS);

            }
            if (cheking == 2) {
                g.setColor(Color.red);
                for (int k = 0; k < 3; k++) {
                    g.fillRect(Placesx[k], Placesy[k], width, height);
                }
                g.setColor(Color.red);
                g.drawString("Вы ответили неправильно", 500, 100);
                Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                    count = 0;
                    cheking = 0;
                    stop = 0;
                }, 2, TimeUnit.SECONDS);
            }
        }
        if (stop == 13) {
            if (cheking == 1) {
                g.setColor(Color.green);
                g.fillRect(Placesx[1], Placesy[1], width, height);
                g.setColor(Color.white);
                g.drawString(Answers5[1], Placesx[1] + 30, Placesy[1] + 50);
                g.setColor(Color.green);
                g.drawString("Вы ответили правильно", 500, 100);
                Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                    count = 0;
                    cheking = 0;
                    stop = 0;
                }, 2, TimeUnit.SECONDS);
            }
            if (cheking == 2) {
                g.setColor(Color.red);
                for (int k = 0; k < 3; k++) {
                    g.fillRect(Placesx[k], Placesy[k], width, height);
                }
                g.setColor(Color.red);
                g.drawString("Вы ответили неправильно", 500, 100);
                Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                    count = 0;
                    cheking = 0;
                    stop = 0;
                }, 2, TimeUnit.SECONDS);

            }
        }
    }
}