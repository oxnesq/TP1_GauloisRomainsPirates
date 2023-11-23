import java.util.ArrayList;
import java.util.Random;

public class Druide extends Gaulois{
    protected int potion;
    protected int min;
    protected int max;

    public Druide(String nom, String metier, int min, int max){
        super(nom, metier);
        this.min=min;
        this.max=max;
    }

    public int getPotion(){
        return potion;
    }

    public int getMin(){
        return min;
    }

    public int getMax(){
        return max;
    }

    public void distribuerPotion(Gaulois g) {
        if (g.getForce() < 5) {
            g.setForce(g.getForce() + potion);
        }

    }
}
