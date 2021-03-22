import java.awt.*;

public class Score {
    int score1 = 0;
    int score2 = 0;
    int score3 = 0;
    int score = 0;
    int[] scr=new int[]{score1,score2,score3};
    public Score() {

    }

    public void Proverka(int l1, int l2, int l3) {
        if (score == 0) {
            if ((l1 == 26) && (l2!= 26) && (l3 != 26)) {
                scr[0] = 2;
                score = 1;
            }
            if ((l1 !=26) && (l2 == 26) && (l3!= 26)) {
                scr[1] = 2;
                score = 1;
            }
            if ((l1!= 26) && (l2!=26) && (l3 == 26)) {
                scr[2] = 2;
                score = 1;
            }
        }
        if (score == 1) {
            if (scr[0] == 2) {
                if (l2 > l3) {
                    scr[1] = 1;
                } else {
                    scr[2] = 1;
                }
            }
            if (scr[1] == 2) {
                if (l1 > l3) {
                    scr[0] = 1;
                } else {
                    scr[2] = 1;
                }
            }
            if (scr[2] == 2) {
                if (l2 > l1) {
                    scr[1] = 1;
                } else {
                    scr[0] = 1;
                }
            }

        }
    }
    public void ScoreDraw(Graphics g){
        for(int i=0;i<3;i++){
            g.setColor(Color.yellow);
            g.fillRect(1200,100+i*50,50,50);
            g.setColor(Color.black);
            g.drawString(String.valueOf(scr[i]),1210,110+i*50);
        }
    }
}
