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

    public void distribuerPotion(Gaulois g) {
        Random r = new Random();
        potion = r.nextInt(min, max);
        if (g.getForce() < 5) {
            g.setForce(g.getForce() + potion);
        }

    }
}
