import java.util.Random;

public class Druide extends Gaulois{
    private int potion;

    public Druide(String nom, String metier, int potion, int min, int max){
        super(nom, metier);
        Random r = new Random();
        this.potion = r.nextInt(min,max);
    }

    public void preparerPotion(Gaulois g){
        if (g.getForce()<5){
            g.setForce(g.getForce()+potion);
        }
    }
}
