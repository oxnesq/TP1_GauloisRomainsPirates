import java.util.ArrayList;
import java.util.Random;

public class Druide extends Gaulois{
    protected int potion;

    public Druide(String nom, String metier, int min, int max){
        super(nom, metier);
        Random r = new Random();
        this.potion = r.nextInt(min,max);
    }

    public int getPotion(){
        return potion;
    }

    public void distribuerPotion(Gaulois g){
            if (g.getForce() < 5) {
                g.setForce(g.getForce() + potion);
            }

    }

}
