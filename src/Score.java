import java.awt.*;
import java.io.IOException;

public class Score {
    int score1 = 0;
    int score2 = 0;
    int score3 = 0;
    int score = 0;
    int[] scr = new int[]{score1, score2, score3};//хранится количчество очков каждого игрока
    int[] znach = new int[]{0, 0, 0};
    Lamp lamp=new Lamp();
    public Score() throws IOException {

    }

    public void Proverka(int l1, int l2, int l3) {

    }

    public void ScoreDraw(Graphics g) {
        for (int i = 0; i < 3; i++) {
            g.setColor(Color.yellow);
            g.fillRect(1200, 100 + i * 50, 50, 50);
            g.setColor(Color.black);
            g.drawString(String.valueOf(znach[i]), 1210, 110 + i * 50);
        }
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
