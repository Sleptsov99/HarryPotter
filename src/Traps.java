import java.awt.*;

public class Traps {
    int[] i={7,8,5,4,3,2,6,9};
    int trap=0;
    public Traps(){

    }
    public void Attencion(Graphics g){


    }
    public void ProverkaZnachenia(int k1,int k2,int k3){
        for(int k=0;k<7;k++){
           if(k1==i[k]){
               trap=1;
           }
        }

    }
    public void Trap(){

    }
}